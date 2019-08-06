package br.edu.insper.al.grupo_8.projeto_2;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Objects;

import br.edu.insper.al.grupo_8.projeto_2.methods.MethodIActivity;

public class MethodPaciente extends AppCompatActivity {

    private ArrayList<Paciente> lista;
    private HashMap<String, String> resultados = new HashMap<>();
    private DatePickerDialog.OnDateSetListener mDateSetListener;

    private TextView Data_in;

    private EditText RH_in, Idade_in, Diagnostico_in, Alta_in, Nome_in, Queixa_in, Outros_in, Medicamentos_casa_in,
            Medicamentos_hospital_in,Tratamentos_Anteriores_in, PA_in, P_in,Dx_in,Tmax_in,Ri_in;

    private RadioButton checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8, checkBox9,
            checkBox10, checkBox11, checkBox12, checkBox13, checkBox14, checkBox15, checkBox16, checkBox17, checkBox18,
            checkBox19, checkBox20, checkBox21, checkBox22, checkBox23, checkBox24, checkBox25, checkBox26, checkBox27,
            checkBox28, checkBox29, checkBox30, checkBox31, checkBox32, checkBox33, checkBox34, checkBox35, checkBox36,
            checkBox37, checkBox38, checkBox39, checkBox40, checkBox41, checkBox42, checkBox43, checkBox1a, checkBox2a,
            checkBox3a, checkBox15a, checkBox16a, checkBox17a, checkBox18a, checkBox19a, checkBox20a, checkBox21a,
            checkBox22a, checkBox23a, checkBox24a, checkBox25a, checkBox26a,checkBox27a, checkBox28a, checkBox29a,
            checkBox30a, checkBox31a, checkBox32a, checkBox33a, checkBox34a, checkBox35a, checkBox36a, checkBox37a,
            checkBox38a, checkBox39a, checkBox40a;

    private CheckBox checkBox4a, checkBox5a, checkBox6a, checkBox7a, checkBox8a, checkBox9a, checkBox10a,
            checkBox11a, checkBox12a, checkBox13a, checkBox14a;

    private void startGoTo(Class classe){
        Intent intent = new Intent(this, classe);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadData();
        setContentView(R.layout.activity_method_paciente);
        Button buttonGoMethodI = findViewById(R.id.button_goMethodI);
        Button buttonGoHome = findViewById(R.id.button_goHome);
        buttonGoHome.setOnClickListener((view) -> startGoTo(HomeActivity.class));

        RH_in = findViewById(R.id.rh);
        Data_in = findViewById(R.id.data);
        Idade_in = findViewById(R.id.idade);
        Diagnostico_in = findViewById(R.id.editText5);
        Alta_in = findViewById(R.id.editText16);
        Nome_in = findViewById(R.id.nome_txt);
        Queixa_in = findViewById(R.id.editText6);
        Outros_in = findViewById(R.id.editText22);
        Medicamentos_casa_in = findViewById(R.id.textView40);
        Medicamentos_hospital_in = findViewById(R.id.textView41);
        Tratamentos_Anteriores_in = findViewById(R.id.textView31);
        PA_in = findViewById(R.id.editText8);
        P_in = findViewById(R.id.editText2a);
        Dx_in = findViewById(R.id.sexo);
        Tmax_in = findViewById(R.id.editText);
        Ri_in = findViewById(R.id.editText3a);

        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);
        checkBox6 = findViewById(R.id.checkBox6);
        checkBox7 = findViewById(R.id.checkBox7);
        checkBox8 = findViewById(R.id.checkBox8);
        checkBox9 = findViewById(R.id.checkBox9);
        checkBox10 = findViewById(R.id.checkBox10);
        checkBox11 = findViewById(R.id.checkBox11);
        checkBox12 = findViewById(R.id.checkBox12);
        checkBox13 = findViewById(R.id.checkBox13);
        checkBox14 = findViewById(R.id.checkBox14);
        checkBox15 = findViewById(R.id.checkBox15);
        checkBox16 = findViewById(R.id.checkBox16);
        checkBox17 = findViewById(R.id.checkBox17);
        checkBox18 = findViewById(R.id.checkBox18);
        checkBox19 = findViewById(R.id.checkBox19);
        checkBox20 = findViewById(R.id.checkBox20);
        checkBox21 = findViewById(R.id.checkBox21);
        checkBox22 = findViewById(R.id.checkBox22);
        checkBox23 = findViewById(R.id.checkBox23);
        checkBox24 = findViewById(R.id.checkBox24);
        checkBox25 = findViewById(R.id.checkBox25);
        checkBox26 = findViewById(R.id.checkBox26);
        checkBox27 = findViewById(R.id.checkBox27);
        checkBox28 = findViewById(R.id.checkBox28);
        checkBox29 = findViewById(R.id.checkBox29);
        checkBox30 = findViewById(R.id.checkBox30);
        checkBox31 = findViewById(R.id.checkBox31);
        checkBox32 = findViewById(R.id.checkBox32);
        checkBox33 = findViewById(R.id.checkBox33);
        checkBox34 = findViewById(R.id.checkBox34);
        checkBox35 = findViewById(R.id.checkBox35);
        checkBox36 = findViewById(R.id.checkBox36);
        checkBox37 = findViewById(R.id.checkBox37);
        checkBox38 = findViewById(R.id.checkBox38);
        checkBox39 = findViewById(R.id.checkBox39);
        checkBox40 = findViewById(R.id.checkBox40);
        checkBox41 = findViewById(R.id.checkBox41);
        checkBox42 = findViewById(R.id.checkBox42);
        checkBox43 = findViewById(R.id.checkBox43);
        checkBox1a = findViewById(R.id.checkBox1a);
        checkBox2a = findViewById(R.id.checkBox2a);
        checkBox3a = findViewById(R.id.checkBox3a);
        checkBox4a = findViewById(R.id.checkBox4a);
        checkBox5a = findViewById(R.id.checkBox5a);
        checkBox6a = findViewById(R.id.checkBox6a);
        checkBox7a = findViewById(R.id.checkBox7a);
        checkBox8a = findViewById(R.id.checkBox8a);
        checkBox9a = findViewById(R.id.checkBox9a);
        checkBox10a = findViewById(R.id.checkBox10a);
        checkBox11a = findViewById(R.id.checkBox11a);
        checkBox12a = findViewById(R.id.checkBox12a);
        checkBox13a = findViewById(R.id.checkBox13a);
        checkBox14a = findViewById(R.id.checkBox14a);
        checkBox15a = findViewById(R.id.checkBox15a);
        checkBox16a = findViewById(R.id.checkBox16a);
        checkBox17a = findViewById(R.id.checkBox17a);
        checkBox18a = findViewById(R.id.checkBox18a);
        checkBox19a = findViewById(R.id.checkBox19a);
        checkBox20a = findViewById(R.id.checkBox20a);
        checkBox21a = findViewById(R.id.checkBox21a);
        checkBox22a = findViewById(R.id.checkBox22a);
        checkBox23a = findViewById(R.id.checkBox23a);
        checkBox24a = findViewById(R.id.checkBox24a);
        checkBox25a = findViewById(R.id.checkBox25a);
        checkBox26a = findViewById(R.id.checkBox26a);
        checkBox27a = findViewById(R.id.checkBox27a);
        checkBox28a = findViewById(R.id.checkBox28a);
        checkBox29a = findViewById(R.id.checkBox29a);
        checkBox30a = findViewById(R.id.checkBox30a);
        checkBox31a = findViewById(R.id.checkBox31a);
        checkBox32a = findViewById(R.id.checkBox32a);
        checkBox33a = findViewById(R.id.checkBox33a);
        checkBox34a = findViewById(R.id.checkBox34a);
        checkBox35a = findViewById(R.id.checkBox35a);
        checkBox36a = findViewById(R.id.checkBox36a);
        checkBox37a = findViewById(R.id.checkBox37a);
        checkBox38a = findViewById(R.id.checkBox38a);
        checkBox39a = findViewById(R.id.checkBox39a);
        checkBox40a = findViewById(R.id.checkBox40a);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("Pacientes");

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

        buttonGoMethodI.setOnClickListener(v -> {
            if (Nome_in.getText().toString().isEmpty() || RH_in.getText().toString().isEmpty() || Data_in.getText().toString().isEmpty()
                    || Idade_in.getText().toString().isEmpty() || Idade_in.getText().toString().isEmpty() || Idade_in.getText().toString().isEmpty()
                    || Idade_in.getText().toString().isEmpty()|| Idade_in.getText().toString().isEmpty()|| Idade_in.getText().toString().isEmpty()
                    || Idade_in.getText().toString().isEmpty()|| Idade_in.getText().toString().isEmpty()|| Idade_in.getText().toString().isEmpty()
                    || Idade_in.getText().toString().isEmpty()){
                Toast.makeText(getApplicationContext(), "Faltam Dados", Toast.LENGTH_SHORT).show();
            }
            else {
                ref.child(RH_in.getText().toString()).child("Info").child("nome").setValue(Nome_in.getText().toString());
                ref.child(RH_in.getText().toString()).child("Info").child("rh").setValue(RH_in.getText().toString());
                ref.child(RH_in.getText().toString()).child("Info").child("data_internacao").setValue(Data_in.getText().toString());
                ref.child(RH_in.getText().toString()).child("Info").child("idade").setValue(Idade_in.getText().toString());
                startGoTo(MethodIActivity.class);
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Fim();
    }

    private void saveData() {
        SharedPreferences sharedPreferences = getSharedPreferences("shared preferences", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(lista);
        editor.putString("task list", json);
        editor.apply();
    }

    private void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences("shared preferences", MODE_PRIVATE);
        Gson gson = new Gson();
        String json = sharedPreferences.getString("task list", null);
        Type type = new TypeToken<ArrayList<Paciente>>() {}.getType();
        lista = gson.fromJson(json, type);

        if (lista == null) {
            lista = new ArrayList<>();
        }
    }

    public void Fim(){
        String RH = RH_in.getText().toString();
        resultados.put("RH", RH);

        String data = Data_in.getText().toString();
        resultados.put("Data", data);

        String idade = Idade_in.getText().toString();
        resultados.put("Idade", idade);

        String diagnostico = Diagnostico_in.getText().toString();
        resultados.put("Diagnostico", diagnostico);

        String alta = Alta_in.getText().toString();
        resultados.put("Alta", alta);

        String nome = Nome_in.getText().toString();
        resultados.put("Nome", nome);

        String queixa = Queixa_in.getText().toString();
        resultados.put("Queixa", queixa);

        String outros = Outros_in.getText().toString();
        resultados.put("Outros", outros);

        String medicamentos_casa = Medicamentos_casa_in.getText().toString();
        resultados.put("Medicamentos_casa", medicamentos_casa);

        String medicamentos_hospital = Medicamentos_hospital_in.getText().toString();
        resultados.put("Medicamentos_hospital", medicamentos_hospital);

        String tratamentos_Anteriores = Tratamentos_Anteriores_in.getText().toString();
        resultados.put("Tratamentos_Anteriores", tratamentos_Anteriores);

        String PA = PA_in.getText().toString();
        resultados.put("PA", PA);

        String p = P_in.getText().toString();
        resultados.put("P", p);

        String ri = Ri_in.getText().toString();
        resultados.put("R", ri);

        String tmax = Tmax_in.getText().toString();
        resultados.put("Tmax", tmax);

        String dx = Dx_in.getText().toString();
        resultados.put("Dx", dx);

        saveData();
    }

    public void checRad(View v) {
        if (checkBox1.isChecked()) {
            resultados.put("Sexo", checkBox1.getText().toString());
        }
        if (checkBox2.isChecked()){
            resultados.put("Sexo",checkBox2.getText().toString());
        }

        //============================
        if (checkBox3.isChecked()){
            resultados.put("Cor",checkBox3.getText().toString());
        }
        if (checkBox4.isChecked()){
            resultados.put("Cor",checkBox4.getText().toString());
        }
        if (checkBox5.isChecked()){
            resultados.put("Cor",checkBox5.getText().toString());
        }
        if (checkBox6.isChecked()){
            resultados.put("Cor",checkBox6.getText().toString());
        }
        if (checkBox7.isChecked()){
            resultados.put("Cor",checkBox7.getText().toString());
        }

        //===========================
        if (checkBox8.isChecked()){
            resultados.put("Estado civil",checkBox8.getText().toString());
        }
        if (checkBox9.isChecked()){
            resultados.put("Estado civil",checkBox9.getText().toString());
        }
        if (checkBox10.isChecked()){
            resultados.put("Estado civil",checkBox10.getText().toString());
        }
        if (checkBox11.isChecked()){
            resultados.put("Estado civil",checkBox11.getText().toString());
        }

        //===========================
        if (checkBox12.isChecked()){
            resultados.put("Escolaridade",checkBox12.getText().toString());
        }
        if (checkBox13.isChecked()){
            resultados.put("Escolaridade",checkBox13.getText().toString());
        }
        if (checkBox14.isChecked()){
            resultados.put("Escolaridade",checkBox15.getText().toString());
        }
        if (checkBox15.isChecked()){
            resultados.put("Escolaridade",checkBox15.getText().toString());
        }
        if (checkBox16.isChecked()){
            resultados.put("Escolaridade",checkBox16.getText().toString());
        }
        if (checkBox17.isChecked()){
            resultados.put("Escolaridade",checkBox17.getText().toString());
        }
        if (checkBox18.isChecked()){
            resultados.put("Escolaridade",checkBox18.getText().toString());
        }

        //===========================
        if (checkBox19.isChecked()){
            resultados.put("Ocupação",checkBox19.getText().toString());
        }
        if (checkBox20.isChecked()){
            resultados.put("Escolaridade",checkBox20.getText().toString());
        }
        if (checkBox21.isChecked()){
            resultados.put("Escolaridade",checkBox21.getText().toString());
        }
        if (checkBox22.isChecked()){
            resultados.put("Escolaridade",checkBox22.getText().toString());
        }
        if (checkBox23.isChecked()){
            resultados.put("Escolaridade",checkBox23.getText().toString());
        }
        if (checkBox24.isChecked()){
            resultados.put("Escolaridade",checkBox24.getText().toString());
        }

        //=============================
        if (checkBox25.isChecked()){
            resultados.put("Provedor da casa",checkBox25.getText().toString());
        }
        if (checkBox26.isChecked()){
            resultados.put("Provedor da casa",checkBox26.getText().toString());
        }

        //============================
        if (checkBox27.isChecked()){
            resultados.put("Renda Idoso",checkBox27.getText().toString());
        }
        if (checkBox28.isChecked()){
            resultados.put("Renda Idoso",checkBox28.getText().toString());
        }
        if (checkBox29.isChecked()){
            resultados.put("Renda Idoso",checkBox29.getText().toString());
        }

        //=============================
        if (checkBox30.isChecked()){
            resultados.put("Renda Familiar",checkBox30.getText().toString());
        }
        if (checkBox31.isChecked()){
            resultados.put("Renda Familiar",checkBox31.getText().toString());
        }
        if (checkBox32.isChecked()){
            resultados.put("Renda Familiar",checkBox32.getText().toString());
        }

        //============================
        if (checkBox33.isChecked()){
            resultados.put("Quantas pessoas dependem da renda",checkBox33.getText().toString());
        }
        if (checkBox34.isChecked()){
            resultados.put("Quantas pessoas dependem da renda",checkBox34.getText().toString());
        }
        if (checkBox35.isChecked()){
            resultados.put("Quantas pessoas dependem da renda",checkBox35.getText().toString());
        }

        //===========================
        if (checkBox36.isChecked()){
            resultados.put("Religião",checkBox36.getText().toString());
        }
        if (checkBox37.isChecked()){
            resultados.put("Religião",checkBox37.getText().toString());
        }
        if (checkBox38.isChecked()){
            resultados.put("Religião",checkBox38.getText().toString());
        }
        if (checkBox39.isChecked()){
            resultados.put("Religião",checkBox39.getText().toString());
        }

        //===========================
        if (checkBox40.isChecked()){
            resultados.put("Hábitos",checkBox40.getText().toString());
        }
        if (checkBox41.isChecked()){
            resultados.put("Hábitos",checkBox41.getText().toString());
        }
        if (checkBox42.isChecked()){
            resultados.put("Hábitos",checkBox42.getText().toString());
        }
        if (checkBox43.isChecked()){
            resultados.put("Hábitos",checkBox43.getText().toString());
        }

        //===================================
        String ant = "";

        if (checkBox1a.isChecked()) {
            resultados.put("Procedencia", checkBox1a.getText().toString());
        }
        if (checkBox2a.isChecked()){
            resultados.put("Procedencia",checkBox2a.getText().toString());
        }
        if (checkBox3a.isChecked()){
            resultados.put("Procedencia",checkBox3a.getText().toString());
        }

        //============================
        if (checkBox4a.isChecked()){
            ant += checkBox4.getText().toString();
            ant += " ";
        }
        if (checkBox5a.isChecked()){
            ant += checkBox5a.getText().toString();
            ant += " ";
        }
        if (checkBox6a.isChecked()){
            ant += checkBox6a.getText().toString();
            ant += " ";
        }
        if (checkBox7a.isChecked()){
            ant += checkBox7a.getText().toString();
            ant += " ";
        }
        if (checkBox8a.isChecked()){
            ant += checkBox8a.getText().toString();
            ant += " ";
        }
        if (checkBox9a.isChecked()){
            ant += checkBox9a.getText().toString();
            ant += " ";
        }
        if (checkBox10a.isChecked()){
            ant += checkBox10a.getText().toString();
            ant += " ";
        }
        if (checkBox11a.isChecked()){
            ant += checkBox11a.getText().toString();
            ant += " ";
        }
        if (checkBox12a.isChecked()){
            ant += checkBox12a.getText().toString();
            ant += " ";
        }
        if (checkBox13a.isChecked()){
            ant += checkBox13a.getText().toString();
            ant += " ";
        }
        if (checkBox14a.isChecked()){
            ant += checkBox14a.getText().toString();
            ant += " ";
            resultados.put("Antecedentes Pessoais", ant);
        }

        //======================================
        if (checkBox39a.isChecked()){
            resultados.put("Anti-coagulação",checkBox39a.getText().toString());
        }
        if (checkBox40a.isChecked()){
            resultados.put("Anti-coagulação",checkBox40a.getText().toString());
        }

        //======================================
        if (checkBox15a.isChecked()){
            resultados.put("Dor",checkBox15a.getText().toString());
        }
        if (checkBox16a.isChecked()){
            resultados.put("Dor",checkBox16a.getText().toString());
        }
        if (checkBox17a.isChecked()){
            resultados.put("Dor",checkBox17a.getText().toString());
        }
        if (checkBox18a.isChecked()){
            resultados.put("Dor",checkBox18a.getText().toString());
        }
        if (checkBox19a.isChecked()){
            resultados.put("Dor",checkBox19a.getText().toString());
        }

        //======================================
        if (checkBox20a.isChecked()){
            resultados.put("Nível de Consciência",checkBox20a.getText().toString());
        }
        if (checkBox21a.isChecked()){
            resultados.put("Nível de Consciência",checkBox21a.getText().toString());
        }
        if (checkBox22a.isChecked()){
            resultados.put("Nível de Consciência",checkBox22a.getText().toString());
        }
        if (checkBox23a.isChecked()){
            resultados.put("Nível de Consciência",checkBox23a.getText().toString());
        }
        if (checkBox24a.isChecked()){
            resultados.put("Nível de Consciência",checkBox24a.getText().toString());
        }
        if (checkBox25a.isChecked()){
            resultados.put("Nivel de Consciência",checkBox25a.getText().toString());
        }
        if (checkBox26a.isChecked()){
            resultados.put("Nivel de Consciência",checkBox26a.getText().toString());
        }

        //=================================
        if (checkBox27a.isChecked()){
            resultados.put("Avaliação Pulmonar",checkBox27a.getText().toString());
        }
        if (checkBox28a.isChecked()){
            resultados.put("Avaliação Pulmonar",checkBox28a.getText().toString());
        }

        //=====================================
        if (checkBox29a.isChecked()){
            resultados.put("Avaliação Cardiovascular",checkBox29a.getText().toString());
        }
        if (checkBox30a.isChecked()){
            resultados.put("Avaliação Cardiovascular",checkBox30a.getText().toString());
        }

        //====================================
        if (checkBox31a.isChecked()){
            resultados.put("Avaliação Gastrointestinal",checkBox31a.getText().toString());
        }
        if (checkBox32a.isChecked()){
            resultados.put("Avaliação Gastrointestinal",checkBox32a.getText().toString());
        }

        //====================================
        if (checkBox33a.isChecked()){
            resultados.put("Avaliação Geniturinario",checkBox33a.getText().toString());
        }
        if (checkBox34a.isChecked()){
            resultados.put("Avaliação Geniturinario",checkBox34a.getText().toString());
        }

        //===================================
        if (checkBox35a.isChecked()){
            resultados.put("Extremidades",checkBox35a.getText().toString());
        }
        if (checkBox36a.isChecked()){
            resultados.put("Extremidades",checkBox36a.getText().toString());
        }

        //=================================
        if (checkBox37a.isChecked()){
            resultados.put("Pele e Anexos",checkBox37a.getText().toString());
        }
        if (checkBox38a.isChecked()){
            resultados.put("Pele e Anexos",checkBox38a.getText().toString());
        }
    }
}
