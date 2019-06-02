package br.edu.insper.al.grupo_8.projeto_2.Methods;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.HashMap;

import br.edu.insper.al.grupo_8.projeto_2.R;

public class MethodPaciente extends AppCompatActivity {
    private EditText RH_in;
    private EditText Data_in;
    private EditText Idade_in;
    private EditText Diagnostico_in;
    private EditText Alta_in;
    private EditText Nome_in;

    private HashMap<String, String> resultados = new HashMap<String, String>();

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

    private String RH, Data, Idade, Diagnostico, Alta, Nome;

    private void startMethodActivity(Class classe){
        Intent intent = new Intent(this, classe);
        startActivity(intent);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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

        Proximo.setOnClickListener((view) -> startMethodActivity(MethodPaciente2.class));



    }



    public void checkone(View v){
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

    }

    public void checRad(View v) {

        if (checkBox1.isChecked()){
            resultados.put("Sexo",checkBox1.getText().toString());

        if (checkBox2.isChecked()){
            resultados.put("Sexo",checkBox2.getText().toString());
        }
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

    }







}
