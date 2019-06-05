package br.edu.insper.al.grupo_8.projeto_2.methods;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;

import br.edu.insper.al.grupo_8.projeto_2.Paciente;
import br.edu.insper.al.grupo_8.projeto_2.R;

public class MethodPaciente extends AppCompatActivity {
    private ArrayList<Paciente> lista;
    private String ant;
    private EditText RH_in;
    private EditText Data_in;
    private EditText Idade_in;
    private EditText Diagnostico_in;
    private EditText Alta_in;
    private EditText Nome_in;
    private EditText Queixa_in, Outros_in, Medicamentos_casa_in, Medicamentos_hospital_in,Tratamentos_Anteriores_in, Exame_Fisico_in;
    private EditText PA_in, P_in,Dx_in,Tmax_in,Ri_in;
    private String RH, Queixa, Outros, Medicamentos_casa, Medicamentos_hospital,Tratamentos_Anteriores, Exame_Fisico, Diagnostico;
    private String PA, P,Dx,Tmax,Ri;

    private HashMap<String, String> resultados = new HashMap<String, String>();
    private Paciente paciente;

    private RadioButton checkBox1;
    private RadioButton checkBox2;
    private RadioButton checkBox3;
    private RadioButton checkBox4;
    private RadioButton checkBox5;
    private RadioButton checkBox6;
    private RadioButton checkBox7;
    private RadioButton checkBox8;
    private RadioButton checkBox9;
    private RadioButton checkBox10;
    private RadioButton checkBox11;
    private RadioButton checkBox12;
    private RadioButton checkBox13;
    private RadioButton checkBox14;
    private RadioButton checkBox15;
    private RadioButton checkBox16;
    private RadioButton checkBox17;
    private RadioButton checkBox18;
    private RadioButton checkBox19;
    private RadioButton checkBox20;
    private RadioButton checkBox21;
    private RadioButton checkBox22;
    private RadioButton checkBox23;
    private RadioButton checkBox24;
    private RadioButton checkBox25;
    private RadioButton checkBox26;
    private RadioButton checkBox27;
    private RadioButton checkBox28;
    private RadioButton checkBox29;
    private RadioButton checkBox30;
    private RadioButton checkBox31;
    private RadioButton checkBox32;
    private RadioButton checkBox33;
    private RadioButton checkBox34;
    private RadioButton checkBox35;
    private RadioButton checkBox36;
    private RadioButton checkBox37;
    private RadioButton checkBox38;
    private RadioButton checkBox39;
    private RadioButton checkBox40;
    private RadioButton checkBox41;
    private RadioButton checkBox42;
    private RadioButton checkBox43;

    //===============================

    private RadioButton checkBox1a;
    private RadioButton checkBox2a;
    private RadioButton checkBox3a;
    private CheckBox checkBox4a;
    private CheckBox checkBox5a;
    private CheckBox checkBox6a;
    private CheckBox checkBox7a;
    private CheckBox checkBox8a;
    private CheckBox checkBox9a;
    private CheckBox checkBox10a;
    private CheckBox checkBox11a;
    private CheckBox checkBox12a;
    private CheckBox checkBox13a;
    private CheckBox checkBox14a;
    private RadioButton checkBox15a;
    private RadioButton checkBox16a;
    private RadioButton checkBox17a;
    private RadioButton checkBox18a;
    private RadioButton checkBox19a;
    private RadioButton checkBox20a;
    private RadioButton checkBox21a;
    private RadioButton checkBox22a;
    private RadioButton checkBox23a;
    private RadioButton checkBox24a;
    private RadioButton checkBox25a;
    private RadioButton checkBox26a;
    private RadioButton checkBox27a;
    private RadioButton checkBox28a;
    private RadioButton checkBox29a;
    private RadioButton checkBox30a;
    private RadioButton checkBox31a;
    private RadioButton checkBox32a;
    private RadioButton checkBox33a;
    private RadioButton checkBox34a;
    private RadioButton checkBox35a;
    private RadioButton checkBox36a;
    private RadioButton checkBox37a;
    private RadioButton checkBox38a;
    private RadioButton checkBox39a;
    private RadioButton checkBox40a;

    private String Data, Idade, Alta, Nome;

    private void startMethodActivity(Class classe){
        Intent intent = new Intent(this, classe);
        startActivity(intent);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadData();

        setContentView(R.layout.activity_method_paciente);
        Button Proximo = findViewById(R.id.button2);
        RH_in = (EditText) findViewById(R.id.editText1);
        Data_in = (EditText) findViewById(R.id.editText2);
        Idade_in = (EditText) findViewById(R.id.editText3);
        Diagnostico_in = (EditText) findViewById(R.id.editText5);
        Alta_in = (EditText) findViewById(R.id.editText16);
        Nome_in = (EditText) findViewById(R.id.editText0);

        checkBox1 = (RadioButton) findViewById(R.id.checkBox1);
        checkBox2 = (RadioButton) findViewById(R.id.checkBox2);
        checkBox3 =  (RadioButton) findViewById(R.id.checkBox3);
        checkBox4 =  (RadioButton) findViewById(R.id.checkBox4);
        checkBox5 =  (RadioButton) findViewById(R.id.checkBox5);
        checkBox6 =  (RadioButton) findViewById(R.id.checkBox6);
        checkBox7 =  (RadioButton) findViewById(R.id.checkBox7);
        checkBox8 =  (RadioButton) findViewById(R.id.checkBox8);
        checkBox9 =  (RadioButton) findViewById(R.id.checkBox9);
        checkBox10 =  (RadioButton) findViewById(R.id.checkBox10);
        checkBox11 =  (RadioButton) findViewById(R.id.checkBox11);
        checkBox12 =  (RadioButton) findViewById(R.id.checkBox12);
        checkBox13 =  (RadioButton) findViewById(R.id.checkBox13);
        checkBox14 =  (RadioButton) findViewById(R.id.checkBox14);
        checkBox15 =  (RadioButton) findViewById(R.id.checkBox15);
        checkBox16 =  (RadioButton) findViewById(R.id.checkBox16);
        checkBox17 =  (RadioButton) findViewById(R.id.checkBox17);
        checkBox18 =  (RadioButton) findViewById(R.id.checkBox18);
        checkBox19 =  (RadioButton) findViewById(R.id.checkBox19);
        checkBox20 =  (RadioButton) findViewById(R.id.checkBox20);

        checkBox21 = (RadioButton) findViewById(R.id.checkBox21);
        checkBox22 = (RadioButton) findViewById(R.id.checkBox22);
        checkBox23 =  (RadioButton) findViewById(R.id.checkBox23);
        checkBox24 =  (RadioButton) findViewById(R.id.checkBox24);
        checkBox25 =  (RadioButton) findViewById(R.id.checkBox25);
        checkBox26 =  (RadioButton) findViewById(R.id.checkBox26);
        checkBox27 =  (RadioButton) findViewById(R.id.checkBox27);
        checkBox28 =  (RadioButton) findViewById(R.id.checkBox28);
        checkBox29 =  (RadioButton) findViewById(R.id.checkBox29);
        checkBox30 =  (RadioButton) findViewById(R.id.checkBox30);
        checkBox31 =  (RadioButton) findViewById(R.id.checkBox31);
        checkBox32 =  (RadioButton) findViewById(R.id.checkBox32);
        checkBox33 =  (RadioButton) findViewById(R.id.checkBox33);
        checkBox34 =  (RadioButton) findViewById(R.id.checkBox34);
        checkBox35 =  (RadioButton) findViewById(R.id.checkBox35);
        checkBox36 =  (RadioButton) findViewById(R.id.checkBox36);
        checkBox37 =  (RadioButton) findViewById(R.id.checkBox37);
        checkBox38 =  (RadioButton) findViewById(R.id.checkBox38);
        checkBox39 =  (RadioButton) findViewById(R.id.checkBox39);
        checkBox40 =  (RadioButton) findViewById(R.id.checkBox40);
        checkBox41 =  (RadioButton) findViewById(R.id.checkBox41);
        checkBox42 =  (RadioButton) findViewById(R.id.checkBox42);
        checkBox43 =  (RadioButton) findViewById(R.id.checkBox43);

        Proximo.setOnClickListener((view) -> startMethodActivity(MethodIActivity.class));

        //========================================================
        //RH_in = (EditText) findViewById(R.id.editText1);
        Queixa_in = (EditText) findViewById(R.id.editText6);
        //Diagnostico_in = (EditText) findViewById(R.id.editText5);
        Outros_in = (EditText) findViewById(R.id.editText22);
        Medicamentos_casa_in = (EditText) findViewById(R.id.textView40);
        Medicamentos_hospital_in = (EditText) findViewById(R.id.textView41);
        Tratamentos_Anteriores_in = (EditText) findViewById(R.id.textView31);
        Exame_Fisico_in = (EditText) findViewById(R.id.textView32);
        PA_in = (EditText) findViewById(R.id.editText8);
        P_in = (EditText) findViewById(R.id.editText2a);
        Dx_in = (EditText) findViewById(R.id.editText4);
        Tmax_in = (EditText) findViewById(R.id.editText);
        Ri_in = (EditText) findViewById(R.id.editText3a);


        checkBox1a = (RadioButton) findViewById(R.id.checkBox1a);
        checkBox2a = (RadioButton) findViewById(R.id.checkBox2a);
        checkBox3a =  (RadioButton) findViewById(R.id.checkBox3a);
        checkBox4a =  (CheckBox) findViewById(R.id.checkBox4a);
        checkBox5a =  (CheckBox) findViewById(R.id.checkBox5a);
        checkBox6a =  (CheckBox) findViewById(R.id.checkBox6a);
        checkBox7a =  (CheckBox) findViewById(R.id.checkBox7a);
        checkBox8a =  (CheckBox) findViewById(R.id.checkBox8a);
        checkBox9a =  (CheckBox) findViewById(R.id.checkBox9a);
        checkBox10a =  (CheckBox) findViewById(R.id.checkBox10a);
        checkBox11a =  (CheckBox) findViewById(R.id.checkBox11a);
        checkBox12a =  (CheckBox) findViewById(R.id.checkBox12a);
        checkBox13a =  (CheckBox) findViewById(R.id.checkBox13a);
        checkBox14a =  (CheckBox) findViewById(R.id.checkBox14a);
        checkBox15a =  (RadioButton) findViewById(R.id.checkBox15a);
        checkBox16a =  (RadioButton) findViewById(R.id.checkBox16a);
        checkBox17a =  (RadioButton) findViewById(R.id.checkBox17a);
        checkBox18a =  (RadioButton) findViewById(R.id.checkBox18a);
        checkBox19a =  (RadioButton) findViewById(R.id.checkBox19a);
        checkBox20a =  (RadioButton) findViewById(R.id.checkBox20a);

        checkBox21a = (RadioButton) findViewById(R.id.checkBox21a);
        checkBox22a = (RadioButton) findViewById(R.id.checkBox22a);
        checkBox23a =  (RadioButton) findViewById(R.id.checkBox23a);
        checkBox24a =  (RadioButton) findViewById(R.id.checkBox24a);
        checkBox25a =  (RadioButton) findViewById(R.id.checkBox25a);
        checkBox26a =  (RadioButton) findViewById(R.id.checkBox26a);
        checkBox27a =  (RadioButton) findViewById(R.id.checkBox27a);
        checkBox28a =  (RadioButton) findViewById(R.id.checkBox28a);
        checkBox29a =  (RadioButton) findViewById(R.id.checkBox29a);
        checkBox30a =  (RadioButton) findViewById(R.id.checkBox30a);
        checkBox31a =  (RadioButton) findViewById(R.id.checkBox31a);
        checkBox32a =  (RadioButton) findViewById(R.id.checkBox32a);
        checkBox33a =  (RadioButton) findViewById(R.id.checkBox33a);
        checkBox34a =  (RadioButton) findViewById(R.id.checkBox34a);
        checkBox35a =  (RadioButton) findViewById(R.id.checkBox35a);
        checkBox36a =  (RadioButton) findViewById(R.id.checkBox36a);
        checkBox37a =  (RadioButton) findViewById(R.id.checkBox37a);
        checkBox38a =  (RadioButton) findViewById(R.id.checkBox38a);
        checkBox39a =  (RadioButton) findViewById(R.id.checkBox39a);
        checkBox40a =  (RadioButton) findViewById(R.id.checkBox40a);



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
            lista = new ArrayList<Paciente>();
        }
    }

    public void Fim(){
        RH = RH_in.getText().toString();
        resultados.put("RH",RH);

        Data = Data_in.getText().toString();
        resultados.put("Data",Data);

        Idade = Idade_in.getText().toString();
        resultados.put("Idade",Idade);

        Diagnostico = Diagnostico_in.getText().toString();
        resultados.put("Diagnostico",Diagnostico);

        Alta = Alta_in.getText().toString();
        resultados.put("Alta",Alta);

        Nome = Nome_in.getText().toString();
        resultados.put("Nome",Nome);

        Queixa = Queixa_in.getText().toString();
        resultados.put("Queixa",Queixa);

        Outros = Outros_in.getText().toString();
        resultados.put("Outros",Outros);

        Medicamentos_casa = Medicamentos_casa_in.getText().toString();
        resultados.put("Medicamentos_casa",Medicamentos_casa);

        Medicamentos_hospital = Medicamentos_hospital_in.getText().toString();
        resultados.put("Medicamentos_hospital",Medicamentos_hospital);

        Tratamentos_Anteriores = Tratamentos_Anteriores_in.getText().toString();
        resultados.put("Tratamentos_Anteriores",Tratamentos_Anteriores);

        PA = PA_in.getText().toString();
        resultados.put("PA",PA);

        P = P_in.getText().toString();
        resultados.put("P",P);

        Ri = Ri_in.getText().toString();
        resultados.put("R",Ri);

        Tmax = Tmax_in.getText().toString();
        resultados.put("Tmax",Tmax);

        Dx = Dx_in.getText().toString();
        resultados.put("Dx",Dx);

        paciente = new Paciente(Nome, RH, resultados);
        lista.add(paciente);

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
        //===================================

        ant = "";

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
            resultados.put("Antecedentes Pessoais",ant);

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
