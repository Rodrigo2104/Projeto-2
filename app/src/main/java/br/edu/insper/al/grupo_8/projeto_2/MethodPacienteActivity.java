package br.edu.insper.al.grupo_8.projeto_2;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.util.Calendar;
import java.util.Objects;

public class MethodPacienteActivity extends AppCompatActivity {
    private EditText RH_in;
    private DatePickerDialog.OnDateSetListener mDateSetListener;

    private void startGoTo(Class classe){
        Intent intent = new Intent(this, classe);
        intent.putExtra("rh", RH_in.getText().toString());
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_paciente);

        Button buttonTests = findViewById(R.id.button_goTests);
        Button buttonGoHome = findViewById(R.id.button_goLog);

        TextView Data_in = findViewById(R.id.data_txt);
        EditText Nome_in = findViewById(R.id.nome_txt);
        RH_in = findViewById(R.id.rh_txt);
        EditText Idade_in = findViewById(R.id.idade_txt);
        EditText Diagnostico_in = findViewById(R.id.diagnostico_txt);
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

//      ============================== Programação ==============================
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("Pacientes");

        buttonGoHome.setOnClickListener((view) -> startGoTo(HomeActivity.class));

        buttonTests.setOnClickListener(v -> {
            if (RH_in.getText().toString().isEmpty() || Nome_in.getText().toString().isEmpty()){
                Toast.makeText(getApplicationContext(), "Faltam Dados", Toast.LENGTH_SHORT).show();
            }
            else {
                ref.child(RH_in.getText().toString()).child("Info").child("nome").setValue(Nome_in.getText().toString());
                ref.child(RH_in.getText().toString()).child("Info").child("rh").setValue(RH_in.getText().toString());
                startGoTo(PacientLog.class);
            }
        });

//      Calendário
        Data_in.setOnClickListener(v -> {
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
            Data_in.setText(data);
        };

//      Radio Groups
    }
}
