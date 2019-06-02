package br.edu.insper.al.grupo_8.projeto_2.Methods;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.HashMap;

import br.edu.insper.al.grupo_8.projeto_2.R;

public class MethodPaciente2 extends AppCompatActivity {
    private HashMap<String, String> resultados = new HashMap<String, String>();
    private String ant;
    private EditText RH_in, Queixa_in, Outros_in, Medicamentos_casa_in, Medicamentos_hospital_in,Tratamentos_Anteriores_in, Exame_Fisico_in, Diagnostico_in;
    private EditText PA_in, P_in,Dx_in,Tmax_in,Ri_in;

    private RadioButton checkBox1;
    private RadioButton checkBox2;
    private RadioButton checkBox3;
    private CheckBox checkBox4;
    private CheckBox checkBox5;
    private CheckBox checkBox6;
    private CheckBox checkBox7;
    private CheckBox checkBox8;
    private CheckBox checkBox9;
    private CheckBox checkBox10;
    private CheckBox checkBox11;
    private CheckBox checkBox12;
    private CheckBox checkBox13;
    private CheckBox checkBox14;
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

    private String RH, Queixa, Outros, Medicamentos_casa, Medicamentos_hospital,Tratamentos_Anteriores, Exame_Fisico, Diagnostico;
    private String PA, P,Dx,Tmax,Ri;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_paciente2);


        RH_in = (EditText) findViewById(R.id.editText1);
        Queixa_in = (EditText) findViewById(R.id.editText6);
        Diagnostico_in = (EditText) findViewById(R.id.editText5);
        Outros_in = (EditText) findViewById(R.id.editText22);
        Medicamentos_casa_in = (EditText) findViewById(R.id.textView40);
        Medicamentos_hospital_in = (EditText) findViewById(R.id.textView41);
        Tratamentos_Anteriores_in = (EditText) findViewById(R.id.textView31);
        Exame_Fisico_in = (EditText) findViewById(R.id.textView32);
        PA_in = (EditText) findViewById(R.id.editText8);
        P_in = (EditText) findViewById(R.id.editText2);
        Dx_in = (EditText) findViewById(R.id.editText4);
        Tmax_in = (EditText) findViewById(R.id.editText);
        Ri_in = (EditText) findViewById(R.id.editText3);


        checkBox1 = (RadioButton) findViewById(R.id.checkBox1);
        checkBox2 = (RadioButton) findViewById(R.id.checkBox2);
        checkBox3 =  (RadioButton) findViewById(R.id.checkBox3);
        checkBox4 =  (CheckBox) findViewById(R.id.checkBox4);
        checkBox5 =  (CheckBox) findViewById(R.id.checkBox5);
        checkBox6 =  (CheckBox) findViewById(R.id.checkBox6);
        checkBox7 =  (CheckBox) findViewById(R.id.checkBox7);
        checkBox8 =  (CheckBox) findViewById(R.id.checkBox8);
        checkBox9 =  (CheckBox) findViewById(R.id.checkBox9);
        checkBox10 =  (CheckBox) findViewById(R.id.checkBox10);
        checkBox11 =  (CheckBox) findViewById(R.id.checkBox11);
        checkBox12 =  (CheckBox) findViewById(R.id.checkBox12);
        checkBox13 =  (CheckBox) findViewById(R.id.checkBox13);
        checkBox14 =  (CheckBox) findViewById(R.id.checkBox14);
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



    }



    public void checkone(View v){
        RH = RH_in.getText().toString();
        resultados.put("RH",RH);

        Diagnostico = Diagnostico_in.getText().toString();
        resultados.put("Diagnostico",Diagnostico);

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





    }

    public void checkRad(View v) {
        ant = "";

        if (checkBox1.isChecked()) {
            resultados.put("Procedencia", checkBox1.getText().toString());
        }
        if (checkBox2.isChecked()){
            resultados.put("Procedencia",checkBox2.getText().toString());
        }
        if (checkBox3.isChecked()){
            resultados.put("Procedencia",checkBox3.getText().toString());
        }
        //============================
        if (checkBox4.isChecked()){
            ant += checkBox4.getText().toString();
            ant += " ";

        }
        if (checkBox5.isChecked()){
            ant += checkBox5.getText().toString();
            ant += " ";
        }
        if (checkBox6.isChecked()){
            ant += checkBox6.getText().toString();
            ant += " ";

        }
        if (checkBox7.isChecked()){
            ant += checkBox7.getText().toString();
            ant += " ";

        }
        if (checkBox8.isChecked()){
            ant += checkBox8.getText().toString();
            ant += " ";

        }
        if (checkBox9.isChecked()){
            ant += checkBox9.getText().toString();
            ant += " ";

        }
        if (checkBox10.isChecked()){
            ant += checkBox10.getText().toString();
            ant += " ";

        }
        if (checkBox11.isChecked()){
            ant += checkBox11.getText().toString();
            ant += " ";

        }
        if (checkBox12.isChecked()){
            ant += checkBox12.getText().toString();
            ant += " ";

        }

        if (checkBox13.isChecked()){
            ant += checkBox13.getText().toString();
            ant += " ";

        }
        if (checkBox14.isChecked()){
            ant += checkBox14.getText().toString();
            ant += " ";
            resultados.put("Antecedentes Pessoais",ant);

        }
        //======================================
        if (checkBox39.isChecked()){
            resultados.put("Anti-coagulação",checkBox39.getText().toString());

        }
        if (checkBox40.isChecked()){
            resultados.put("Anti-coagulação",checkBox40.getText().toString());

        }
        //======================================
        if (checkBox15.isChecked()){
            resultados.put("Dor",checkBox15.getText().toString());

        }
        if (checkBox16.isChecked()){
            resultados.put("Dor",checkBox16.getText().toString());

        }
        if (checkBox17.isChecked()){
            resultados.put("Dor",checkBox17.getText().toString());

        }
        if (checkBox18.isChecked()){
            resultados.put("Dor",checkBox18.getText().toString());

        }
        if (checkBox19.isChecked()){
            resultados.put("Dor",checkBox19.getText().toString());

        }
        //======================================
        if (checkBox20.isChecked()){
            resultados.put("Nível de Consciência",checkBox20.getText().toString());

        }
        if (checkBox21.isChecked()){
            resultados.put("Nível de Consciência",checkBox21.getText().toString());

        }
        if (checkBox22.isChecked()){
            resultados.put("Nível de Consciência",checkBox22.getText().toString());

        }
        if (checkBox23.isChecked()){
            resultados.put("Nível de Consciência",checkBox23.getText().toString());

        }
        if (checkBox24.isChecked()){
            resultados.put("Nível de Consciência",checkBox24.getText().toString());

        }
        if (checkBox25.isChecked()){
            resultados.put("Nivel de Consciência",checkBox25.getText().toString());

        }
        if (checkBox26.isChecked()){
            resultados.put("Nivel de Consciência",checkBox26.getText().toString());

        }
        //=================================
        if (checkBox27.isChecked()){
            resultados.put("Avaliação Pulmonar",checkBox27.getText().toString());
        }
        if (checkBox28.isChecked()){
            resultados.put("Avaliação Pulmonar",checkBox28.getText().toString());

        }
        //=====================================
        if (checkBox29.isChecked()){
            resultados.put("Avaliação Cardiovascular",checkBox29.getText().toString());

        }
        if (checkBox30.isChecked()){
            resultados.put("Avaliação Cardiovascular",checkBox30.getText().toString());

        }
        //====================================
        if (checkBox31.isChecked()){
            resultados.put("Avaliação Gastrointestinal",checkBox31.getText().toString());

        }

        if (checkBox32.isChecked()){
            resultados.put("Avaliação Gastrointestinal",checkBox32.getText().toString());

        }
        //====================================
        if (checkBox33.isChecked()){
            resultados.put("Avaliação Geniturinario",checkBox33.getText().toString());

        }
        if (checkBox34.isChecked()){
            resultados.put("Avaliação Geniturinario",checkBox34.getText().toString());

        }
        //===================================
        if (checkBox35.isChecked()){
            resultados.put("Extremidades",checkBox35.getText().toString());

        }

        if (checkBox36.isChecked()){
            resultados.put("Extremidades",checkBox36.getText().toString());

        }
        //=================================
        if (checkBox37.isChecked()){
            resultados.put("Pele e Anexos",checkBox37.getText().toString());

        }
        if (checkBox38.isChecked()){
            resultados.put("Pele e Anexos",checkBox38.getText().toString());

        }

    }







}

