package br.edu.insper.al.grupo_8.projeto_2;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.util.Calendar;
import java.util.Objects;

public class MethodPacienteActivity extends AppCompatActivity {
    private EditText rhIn;
    private DatePickerDialog.OnDateSetListener mDateSetListener;

    private void startGoTo(Class classe){
        Intent intent = new Intent(this, classe);
        intent.putExtra("rh", rhIn.getText().toString());
        startActivity(intent);
    }

    private void justGoTo(Class classe) {
        Intent intent = new Intent(this, classe);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_paciente);

        Button buttonTests = findViewById(R.id.button_goTests);
        Button buttonGoHome = findViewById(R.id.button_goLog);

        TextView dataIn = findViewById(R.id.data_txt);
        EditText nomeIn = findViewById(R.id.nome_txt);
        rhIn = findViewById(R.id.rh_txt);
        EditText idadeIn = findViewById(R.id.idade_txt);
        EditText diagnosticoIn = findViewById(R.id.diagnostico_txt);
        EditText Alta_in = findViewById(R.id.alta_txt);
        EditText Queixa_in = findViewById(R.id.queixa_txt);
        EditText PA_in = findViewById(R.id.PA_txt);
        EditText P_in = findViewById(R.id.P_txt);
        EditText R_in = findViewById(R.id.R_txt);
        EditText Tmax_in = findViewById(R.id.tmax_txt);
        EditText Dx_in = findViewById(R.id.DX_txt);
        EditText Outros_in = findViewById(R.id.outros_txt);
        EditText Medicamentos_casa_in = findViewById(R.id.med_casa_txt);
        EditText Medicamentos_hospital_in = findViewById(R.id.med_hosp_txt);
        EditText Tratamentos_Anteriores_in = findViewById(R.id.trat_txt);
        EditText Exame_Fisico_in = findViewById(R.id.fisico_txt);

        RadioGroup sexoIn = findViewById(R.id.radioS);
        RadioGroup corIn = findViewById(R.id.radioC);
        RadioGroup estCivIn = findViewById(R.id.radioEC);
        RadioGroup escolaridadeIn = findViewById(R.id.radioGroup0) ;
        RadioGroup ocupacaoIn = findViewById(R.id.radioGroup1) ;

//      =============================== Calendário ===============================
        dataIn.setOnClickListener(v -> {
            Calendar cal = Calendar.getInstance();
            int dia = cal.get(Calendar.DAY_OF_MONTH);
            int mes = cal.get(Calendar.MONTH);
            int ano = cal.get(Calendar.YEAR);

            DatePickerDialog dialog = new DatePickerDialog(
                    this,
                    android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                    mDateSetListener,
                    ano, mes, dia);

            Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawable((new ColorDrawable(Color.TRANSPARENT)));
            dialog.show();
        });

        mDateSetListener = (view, year, month, dayOfMonth) -> {
            month = month + 1;
            String data = dayOfMonth + "/" + month + "/" + year;
            dataIn.setText(data);
        };

//      ============================== Programação ==============================
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("Pacientes");

        buttonGoHome.setOnClickListener((view) -> justGoTo(HomeActivity.class));
        buttonTests.setOnClickListener(v -> {
//      ============================== Firebase ==============================
            if (rhIn.getText().toString().isEmpty() || nomeIn.getText().toString().isEmpty() ||
                    dataIn.getText().toString().isEmpty() || idadeIn.getText().toString().isEmpty() ||
                    sexoIn.getCheckedRadioButtonId() == -1 || diagnosticoIn.getText().toString().isEmpty() ||
                    corIn.getCheckedRadioButtonId() == -1 || estCivIn.getCheckedRadioButtonId() == -1 ||
                    escolaridadeIn.getCheckedRadioButtonId() == -1 || ocupacaoIn.getCheckedRadioButtonId() == -1){

                Toast.makeText(getApplicationContext(), "Faltam Dados", Toast.LENGTH_SHORT).show();
            }
            else {
                int sexId = sexoIn.getCheckedRadioButtonId();
                RadioButton sexSelected = findViewById(sexId);
                int corId = corIn.getCheckedRadioButtonId();
                RadioButton corSelected = findViewById(corId);
                int estCivId = estCivIn.getCheckedRadioButtonId();
                RadioButton estCivSelected = findViewById(estCivId);
                int escolaridadeId = escolaridadeIn.getCheckedRadioButtonId();
                RadioButton escolaridadeSelected = findViewById(escolaridadeId);
                int ocupacaoId = ocupacaoIn.getCheckedRadioButtonId();
                RadioButton ocupacaoSelected = findViewById(ocupacaoId);

                ref.child(rhIn.getText().toString()).child("Info").child("nome").setValue(nomeIn.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("rh").setValue(rhIn.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("data").setValue(dataIn.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("idade").setValue(idadeIn.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("sexo").setValue(sexSelected.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("diagnostico").setValue(diagnosticoIn.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("cor").setValue(corSelected.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("estado civil").setValue(estCivSelected.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("escolaridade").setValue(escolaridadeSelected.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("ocupacao").setValue(ocupacaoSelected.getText().toString());


                startGoTo(PacientLog.class);
            }
        });
    }
}
