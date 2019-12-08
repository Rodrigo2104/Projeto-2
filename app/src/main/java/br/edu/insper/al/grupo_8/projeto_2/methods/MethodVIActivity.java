package br.edu.insper.al.grupo_8.projeto_2.methods;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.LinkedHashMap;

import br.edu.insper.al.grupo_8.projeto_2.R;
import br.edu.insper.al.grupo_8.projeto_2.TestsActivity;

public class MethodVIActivity extends AppCompatActivity {
    private String rh;
    private HashMap<String, String> testeF = new HashMap<String, String>();

    //METODO 1
    private LinkedHashMap<Integer, HashMap> TESTE1 = new LinkedHashMap<>();

    private EditText ultima_semana_a1;
    private EditText ultima_semana_b1;
    private EditText ultima_semana_c1;
    private EditText ultima_semana_d1;
    private EditText ultima_semana_e1;
    private EditText ultima_semana_f1;

    private HashMap<String, String> teste1a = new HashMap<String, String>();

    private EditText ultima_semana_a2;
    private EditText ultima_semana_b2;
    private EditText ultima_semana_c2;
    private EditText ultima_semana_d2;
    private EditText ultima_semana_e2;
    private EditText ultima_semana_f2;

    private HashMap<String, String> teste1b = new HashMap<String, String>();

    private EditText ultima_semana_a3;
    private EditText ultima_semana_b3;
    private EditText ultima_semana_c3;
    private EditText ultima_semana_d3;
    private EditText ultima_semana_e3;
    private EditText ultima_semana_f3;

    private HashMap<String, String> teste1c = new HashMap<String, String>();

    private EditText ultima_semana_a4;
    private EditText ultima_semana_b4;
    private EditText ultima_semana_c4;
    private EditText ultima_semana_d4;
    private EditText ultima_semana_e4;
    private EditText ultima_semana_f4;

    private HashMap<String, String> teste1d = new HashMap<String, String>();

    // METODO 2
    private LinkedHashMap<Integer, HashMap> TESTE2 = new LinkedHashMap<>();

    private EditText quanto_essa_medicacao_a1;
    private RadioButton radioButton2a;
    private RadioButton radioButton2b;
    private RadioButton radioButton2c;
    private RadioButton radioButton2d;
    private EditText incomoda2a;

    private HashMap<String, String> teste2a = new HashMap<String, String>();

    private EditText quanto_essa_medicacao_a2;
    private RadioButton radioButton2a1;
    private RadioButton radioButton2b1;
    private RadioButton radioButton2c1;
    private RadioButton radioButton2d1;
    private EditText incomoda2b;

    private HashMap<String, String> teste2b = new HashMap<String, String>();

    private EditText quanto_essa_medicacao_a3;
    private RadioButton radioButton2a2;
    private RadioButton radioButton2b2;
    private RadioButton radioButton2c2;
    private RadioButton radioButton2d2;
    private EditText incomoda2c;

    private HashMap<String, String> teste2c = new HashMap<String, String>();

    private EditText quanto_essa_medicacao_a4;
    private RadioButton radioButton2a3;
    private RadioButton radioButton2b3;
    private RadioButton radioButton2c3;
    private RadioButton radioButton2d3;
    private EditText incomoda2d;

    private HashMap<String, String> teste2d = new HashMap<String, String>();

    // METODO 3
    private RadioButton radioButton3a;
    private RadioButton radioButton3b;
    private RadioButton radioButton3c;
    private EditText comentario;

    private HashMap<String, String> teste3a = new HashMap<String, String>();


    private RadioButton radioButton3a1;
    private RadioButton radioButton3b1;
    private RadioButton radioButton3c1;
    private EditText comentario1;

    private HashMap<String, String> teste3b = new HashMap<String, String>();


    private RadioButton radioButton3a2;
    private RadioButton radioButton3b2;
    private RadioButton radioButton3c2;
    private EditText comentario2;

    private HashMap<String, String> teste3c = new HashMap<String, String>();


    private RadioButton radioButton3a3;
    private RadioButton radioButton3b3;
    private RadioButton radioButton3c3;
    private EditText comentario3;

    private HashMap<String, String> teste3d = new HashMap<String, String>();


    private RadioButton radioButton3a4;
    private RadioButton radioButton3b4;
    private RadioButton radioButton3c4;
    private EditText comentario4;

    private HashMap<String, String> teste3e = new HashMap<String, String>();

    private LinkedHashMap<Integer, HashMap> TESTE3 = new LinkedHashMap<>();
    private LinkedHashMap<Integer, HashMap> TESTEF = new LinkedHashMap<>();

    private void startMethodActivity(Class classe) {
        Intent intent = new Intent(this, classe);
        intent.putExtra("rh", rh);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_vi);

        Bundle extras = getIntent().getExtras();
        assert extras != null;
        rh = extras.getString("rh");

        Button buttonGoMenu = findViewById(R.id.button_goMenu);
        buttonGoMenu.setOnClickListener((view) -> startMethodActivity(TestsActivity.class));

        Button buttonNext = findViewById(R.id.button_goMethodVII);
        buttonNext.setOnClickListener((view) -> startMethodActivity(MethodVIIActivity.class));

        quanto_essa_medicacao_a1 = (EditText) findViewById(R.id.quanto_essa_medicacao_a1);
        incomoda2a = (EditText) findViewById(R.id.incomoda2a);
        radioButton2a = (RadioButton) findViewById(R.id.radioButton2a);
        radioButton2b = (RadioButton) findViewById(R.id.radioButton2b);
        radioButton2c = (RadioButton) findViewById(R.id.radioButton2c);

        radioButton2d = (RadioButton) findViewById(R.id.radioButton2d);

        quanto_essa_medicacao_a2 = (EditText) findViewById(R.id.quanto_essa_medicacao_a2);
        incomoda2b = (EditText) findViewById(R.id.incomoda2b);
        radioButton2a1 = (RadioButton) findViewById(R.id.radioButton2a1);
        radioButton2b1 = (RadioButton) findViewById(R.id.radioButton2b1);
        radioButton2c1 = (RadioButton) findViewById(R.id.radioButton2c1);
        radioButton2d1 = (RadioButton) findViewById(R.id.radioButton2d1);

        quanto_essa_medicacao_a3 = (EditText) findViewById(R.id.quanto_essa_medicacao_a3);
        incomoda2c = (EditText) findViewById(R.id.incomoda2c);
        radioButton2a2 = (RadioButton) findViewById(R.id.radioButton2a2);
        radioButton2b2 = (RadioButton) findViewById(R.id.radioButton2b2);
        radioButton2c2 = (RadioButton) findViewById(R.id.radioButton2c2);
        radioButton2d2 = (RadioButton) findViewById(R.id.radioButton2d2);

        quanto_essa_medicacao_a4 = (EditText) findViewById(R.id.quanto_essa_medicacao_a4);
        incomoda2d = (EditText) findViewById(R.id.incomoda2d);
        radioButton2a3 = (RadioButton) findViewById(R.id.radioButton2a3);
        radioButton2b3 = (RadioButton) findViewById(R.id.radioButton2b3);
        radioButton2c3 = (RadioButton) findViewById(R.id.radioButton2c3);
        radioButton2d3 = (RadioButton) findViewById(R.id.radioButton2d3);

        ultima_semana_a1 = (EditText) findViewById(R.id.ultima_semana_a1);
        ultima_semana_b1 = (EditText) findViewById(R.id.ultima_semana_b1);
        ultima_semana_c1 = (EditText) findViewById(R.id.ultima_semana_c1);
        ultima_semana_d1 = (EditText) findViewById(R.id.ultima_semana_d1);
        ultima_semana_e1 = (EditText) findViewById(R.id.ultima_semana_e1);
        ultima_semana_f1 = (EditText) findViewById(R.id.ultima_semana_f1);

        ultima_semana_a2 = (EditText) findViewById(R.id.ultima_semana_a2);
        ultima_semana_b2 = (EditText) findViewById(R.id.ultima_semana_b2);
        ultima_semana_c2 = (EditText) findViewById(R.id.ultima_semana_c2);
        ultima_semana_d2 = (EditText) findViewById(R.id.ultima_semana_d2);
        ultima_semana_e2 = (EditText) findViewById(R.id.ultima_semana_e2);
        ultima_semana_f2 = (EditText) findViewById(R.id.ultima_semana_f2);

        ultima_semana_a3 = (EditText) findViewById(R.id.ultima_semana_a3);
        ultima_semana_b3 = (EditText) findViewById(R.id.ultima_semana_b3);
        ultima_semana_c3 = (EditText) findViewById(R.id.ultima_semana_c3);
        ultima_semana_d3 = (EditText) findViewById(R.id.ultima_semana_d3);
        ultima_semana_e3 = (EditText) findViewById(R.id.ultima_semana_e3);
        ultima_semana_f3 = (EditText) findViewById(R.id.ultima_semana_f3);

        ultima_semana_a4 = (EditText) findViewById(R.id.ultima_semana_a4);
        ultima_semana_b4 = (EditText) findViewById(R.id.ultima_semana_b4);
        ultima_semana_c4 = (EditText) findViewById(R.id.ultima_semana_c4);
        ultima_semana_d4 = (EditText) findViewById(R.id.ultima_semana_d4);
        ultima_semana_e4 = (EditText) findViewById(R.id.ultima_semana_e4);
        ultima_semana_f4 = (EditText) findViewById(R.id.ultima_semana_f4);

        radioButton3a = (RadioButton) findViewById(R.id.radioButton3a);
        radioButton3b = (RadioButton) findViewById(R.id.radioButton3b);
        radioButton3c = (RadioButton) findViewById(R.id.radioButton3c);
        comentario = (EditText) findViewById(R.id.comentario);

        radioButton3a1 = (RadioButton) findViewById(R.id.radioButton3a1);
        radioButton3b1 = (RadioButton) findViewById(R.id.radioButton3b1);
        radioButton3c1 = (RadioButton) findViewById(R.id.radioButton3c1);
        comentario1 = (EditText) findViewById(R.id.comentario1);

        radioButton3a2 = (RadioButton) findViewById(R.id.radioButton3a2);
        radioButton3b2 = (RadioButton) findViewById(R.id.radioButton3b2);
        radioButton3c2 = (RadioButton) findViewById(R.id.radioButton3c2);
        comentario2 = (EditText) findViewById(R.id.comentario2);

        radioButton3a3 = (RadioButton) findViewById(R.id.radioButton3a3);
        radioButton3b3 = (RadioButton) findViewById(R.id.radioButton3b3);
        radioButton3c3 = (RadioButton) findViewById(R.id.radioButton3c3);
        comentario3 = (EditText) findViewById(R.id.comentario3);

        radioButton3a4 = (RadioButton) findViewById(R.id.radioButton3a4);
        radioButton3b4 = (RadioButton) findViewById(R.id.radioButton3b4);
        radioButton3c4 = (RadioButton) findViewById(R.id.radioButton3c4);
        comentario4 = (EditText) findViewById(R.id.comentario4);


    }
        //===================================================================================
        //Primeiro Teste
        //===================================================================================
    public void checkone(View v){

        teste1a.put("Nome da medicação e dosagem",ultima_semana_a1.getText().toString());
        teste1a.put("Quantos dias você tomou esse remédio",ultima_semana_b1.getText().toString());
        teste1a.put("Quantas vezes por dia você tomou esse remédio",ultima_semana_c1.getText().toString());
        teste1a.put("Quantos comprimidos você tomou em cada vez",ultima_semana_d1.getText().toString());
        teste1a.put("Quantas vezes você esqueceu de tomar algum comprimido",ultima_semana_e1.getText().toString());
        teste1a.put("Como essa medicação funciona para você:1 = Funciona Bem; 2 = Funciona Regular; 3 = Não funciona bem",ultima_semana_f1.getText().toString());

//============
        teste1b.put("Nome da medicação e dosagem",ultima_semana_a2.getText().toString());
        teste1b.put("Quantos dias você tomou esse remédio",ultima_semana_b2.getText().toString());
        teste1b.put("Quantas vezes por dia você tomou esse remédio",ultima_semana_c2.getText().toString());
        teste1b.put("Quantos comprimidos você tomou em cada vez",ultima_semana_d2.getText().toString());
        teste1b.put("Quantas vezes você esqueceu de tomar algum comprimido",ultima_semana_e2.getText().toString());
        teste1b.put("Como essa medicação funciona para você:1 = Funciona Bem; 2 = Funciona Regular; 3 = Não funciona bem",ultima_semana_f2.getText().toString());

//============
        teste1c.put("Nome da medicação e dosagem",ultima_semana_a3.getText().toString());
        teste1c.put("Quantos dias você tomou esse remédio",ultima_semana_b3.getText().toString());
        teste1c.put("Quantas vezes por dia você tomou esse remédio",ultima_semana_c3.getText().toString());
        teste1c.put("Quantos comprimidos você tomou em cada vez",ultima_semana_d3.getText().toString());
        teste1c.put("Quantas vezes você esqueceu de tomar algum comprimido",ultima_semana_e3.getText().toString());
        teste1c.put("Como essa medicação funciona para você:1 = Funciona Bem; 2 = Funciona Regular; 3 = Não funciona bem",ultima_semana_f3.getText().toString());
//============
        teste1d.put("Nome da medicação e dosagem",ultima_semana_a4.getText().toString());
        teste1d.put("Quantos dias você tomou esse remédio",ultima_semana_b4.getText().toString());
        teste1d.put("Quantas vezes por dia você tomou esse remédio",ultima_semana_c4.getText().toString());
        teste1d.put("Quantos comprimidos você tomou em cada vez",ultima_semana_d4.getText().toString());
        teste1d.put("Quantas vezes você esqueceu de tomar algum comprimido",ultima_semana_e4.getText().toString());
        teste1d.put("Como essa medicação funciona para você:1 = Funciona Bem; 2 = Funciona Regular; 3 = Não funciona bem",ultima_semana_f4.getText().toString());

//============
        TESTE1.put(1, teste1a);
        TESTE1.put(2, teste1b);
        TESTE1.put(3, teste1d);
        //============

        teste2a.put("Medicação", quanto_essa_medicacao_a1.getText().toString());

        if (radioButton2a.isChecked()){

            teste2a.put("QUANTO ESSA MEDICAÇÃO INCOMODOU VOCÊ?",radioButton2a.getText().toString());

        }else if (radioButton2b.isChecked()){

            teste2a.put("QUANTO ESSA MEDICAÇÃO INCOMODOU VOCÊ?",radioButton2b.getText().toString());

        }else if (radioButton2c.isChecked()){

            teste2a.put("QUANTO ESSA MEDICAÇÃO INCOMODOU VOCÊ?",radioButton2c.getText().toString());

        }else if (radioButton2d.isChecked()){

            teste2a.put("QUANTO ESSA MEDICAÇÃO INCOMODOU VOCÊ?",radioButton2d.getText().toString());
        }


        teste2a.put("Como ela te encomoda", incomoda2a.getText().toString());
//==========
        teste2b.put("Medicação", quanto_essa_medicacao_a2.getText().toString());

        if (radioButton2a1.isChecked()){

            teste2b.put("QUANTO ESSA MEDICAÇÃO INCOMODOU VOCÊ?",radioButton2a1.getText().toString());

        }else if (radioButton2b1.isChecked()){

            teste2b.put("QUANTO ESSA MEDICAÇÃO INCOMODOU VOCÊ?",radioButton2b1.getText().toString());

        }else if (radioButton2c1.isChecked()){

            teste2b.put("QUANTO ESSA MEDICAÇÃO INCOMODOU VOCÊ?",radioButton2c1.getText().toString());

        }else if (radioButton2d1.isChecked()){

            teste2d.put("QUANTO ESSA MEDICAÇÃO INCOMODOU VOCÊ?",radioButton2d1.getText().toString());
        }

        teste2b.put("Como ela te encomoda", incomoda2b.getText().toString());
        //======

        teste2c.put("Medicação", quanto_essa_medicacao_a3.getText().toString());

        if (radioButton2a2.isChecked()){

            teste2c.put("QUANTO ESSA MEDICAÇÃO INCOMODOU VOCÊ?",radioButton2a2.getText().toString());

        }else if (radioButton2b2.isChecked()){

            teste2c.put("QUANTO ESSA MEDICAÇÃO INCOMODOU VOCÊ?",radioButton2b2.getText().toString());

        }else if (radioButton2c2.isChecked()){

            teste2c.put("QUANTO ESSA MEDICAÇÃO INCOMODOU VOCÊ?",radioButton2c2.getText().toString());
        }else if (radioButton2d2.isChecked()){

            teste2c.put("QUANTO ESSA MEDICAÇÃO INCOMODOU VOCÊ?",radioButton2d2.getText().toString());
        }

        teste2c.put("Como ela te encomoda", incomoda2c.getText().toString());
//=============
        teste2d.put("Medicação", quanto_essa_medicacao_a4.getText().toString());

        if (radioButton2a3.isChecked()){

            teste2d.put("QUANTO ESSA MEDICAÇÃO INCOMODOU VOCÊ?",radioButton2a3.getText().toString());

        }else if (radioButton2b3.isChecked()){

            teste2d.put("QUANTO ESSA MEDICAÇÃO INCOMODOU VOCÊ?",radioButton2b3.getText().toString());

        }else if (radioButton2c3.isChecked()){

            teste2d.put("QUANTO ESSA MEDICAÇÃO INCOMODOU VOCÊ?",radioButton2c3.getText().toString());
        }

        else if (radioButton2d3.isChecked()){

            teste2a.put("QUANTO ESSA MEDICAÇÃO INCOMODOU VOCÊ?",radioButton2d3.getText().toString());
        }

        teste2d.put("Como ela te encomoda", incomoda2d.getText().toString());

        TESTE2.put(1, teste2a);
        TESTE2.put(2, teste2b);
        TESTE2.put(3, teste2c);
        TESTE2.put(4, teste2d);
//==============

        if (radioButton3a.isChecked()){

            teste3a.put("Abrir ou fechar a embalagem",radioButton3a.getText().toString());

        }else if (radioButton3b.isChecked()){

            teste3a.put("Abrir ou fechar a embalagem",radioButton3b.getText().toString());

        }else if (radioButton3c.isChecked()){

            teste3a.put("Abrir ou fechar a embalagem",radioButton3c.getText().toString());

        }

        teste3a.put("Comentario.a", comentario.getText().toString());
        //======

        if (radioButton3a1.isChecked()){

            teste3b.put("Ler o que está escrito na embalagem",radioButton3a1.getText().toString());

        }else if (radioButton3b1.isChecked()){

            teste3b.put("Ler o que está escrito na embalagem",radioButton3b1.getText().toString());

        }else if (radioButton3c1.isChecked()){

            teste3b.put("Ler o que está escrito na embalagem",radioButton3c1.getText().toString());

        }

        teste3b.put("Comentario.b", comentario1.getText().toString());
        //====

        if (radioButton3a2.isChecked()){

            teste3c.put("Lembrar de tomar todo remédio",radioButton3a2.getText().toString());

        }else if (radioButton3b2.isChecked()){

            teste3c.put("Lembrar de tomar todo remédio",radioButton3b2.getText().toString());

        }else if (radioButton3c2.isChecked()){

            teste3c.put("Lembrar de tomar todo remédio",radioButton3c2.getText().toString());

        }

        teste3c.put("Comentario.c", comentario2.getText().toString());

        //====

        if (radioButton3a3.isChecked()){

            teste3d.put("Conseguir o medicamento",radioButton3a3.getText().toString());

        }else if (radioButton3b3.isChecked()){

            teste3d.put("Conseguir o medicamento",radioButton3b3.getText().toString());

        }else if (radioButton3c3.isChecked()){

            teste3d.put("Conseguir o medicamento",radioButton3c3.getText().toString());

        }

        teste3d.put("Comentario.d", comentario3.getText().toString());

        //====

        if (radioButton3a4.isChecked()){

            teste3e.put("Tomar tantos comprimidos ao mesmo tempo",radioButton3a4.getText().toString());

        }else if (radioButton3b4.isChecked()){

            teste3e.put("Tomar tantos comprimidos ao mesmo tempo",radioButton3b4.getText().toString());

        }else if (radioButton3c4.isChecked()){

            teste3e.put("Tomar tantos comprimidos ao mesmo tempo",radioButton3c4.getText().toString());

        }

        teste3e.put("Comentario.e", comentario4.getText().toString());

        TESTE3.put(1,teste3a);
        TESTE3.put(2,teste3b);
        TESTE3.put(3,teste3c);
        TESTE3.put(4,teste3d);
        TESTE3.put(5,teste3e);

        TESTEF.put(1,TESTE1);
        TESTEF.put(2,TESTE2);
        TESTEF.put(3,TESTE3);
        System.out.print(TESTEF);

    }

}


