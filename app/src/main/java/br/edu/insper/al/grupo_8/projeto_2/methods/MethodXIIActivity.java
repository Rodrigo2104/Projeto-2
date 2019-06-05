package br.edu.insper.al.grupo_8.projeto_2.methods;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.HashMap;


import br.edu.insper.al.grupo_8.projeto_2.HomeActivity;
import br.edu.insper.al.grupo_8.projeto_2.R;

public class MethodXIIActivity extends AppCompatActivity {

    private void startMethodActivity(Class classe) {
        Intent intent = new Intent(this, classe);
        startActivity(intent);
    }

    private HashMap<RadioButton, Integer> testes = new HashMap<RadioButton, Integer>();
    private HashMap<CheckBox, Integer> testes_checkBox = new HashMap<CheckBox, Integer>();
    private HashMap<CheckBox, Integer> testes_meio = new HashMap<CheckBox, Integer>();


    private int Resultados;

    private TextView resultado;

    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private RadioButton radioButton4;

    private RadioButton radioButton1a;
    private RadioButton radioButton2a;
    private RadioButton radioButton3a;
    private RadioButton radioButton4a;

    private RadioButton radioButton5;
    private RadioButton radioButton6;
    private RadioButton radioButton7;
    private RadioButton radioButton8;
    private RadioButton radioButton9;
    private RadioButton radioButton9a;
    private RadioButton radioButton10;
    private RadioButton radioButton11;
    private RadioButton radioButton12;
    private RadioButton radioButton13;
    private RadioButton radioButton14;
    private RadioButton radioButton15;
    private RadioButton radioButton16;
    private RadioButton radioButton17;
    private RadioButton radioButton18;
    private RadioButton radioButton19;
    private RadioButton radioButton20;
    private RadioButton radioButton21;
    private RadioButton radioButton22;
    private RadioButton radioButton23;
    private RadioButton radioButton24;
    private RadioButton radioButton25;
    private RadioButton radioButton26;
    private RadioButton radioButton27;
    private RadioButton radioButton28;
    private RadioButton radioButton29;
    private RadioButton radioButton30;
    private RadioButton radioButton31;
    private RadioButton radioButton32;
    private RadioButton radioButton33;
    private RadioButton radioButton34;
    private RadioButton radioButton35;
    private RadioButton radioButton36;
    private RadioButton radioButton37;
    private RadioButton radioButton38;
    private RadioButton radioButton39;
    private RadioButton radioButton40;
    private RadioButton radioButton41;
    private RadioButton radioButton42;
    private RadioButton radioButton43;
    private RadioButton radioButton44;
    private RadioGroup rg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_xii);


        Button buttonGoHome = findViewById(R.id.button_goHome);
        buttonGoHome.setOnClickListener((view) -> startMethodActivity(HomeActivity.class));

        radioButton1 = (RadioButton) findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        radioButton4 = (RadioButton) findViewById(R.id.radioButton4);

        radioButton1a = (RadioButton) findViewById(R.id.radioButton1a);
        radioButton2a = (RadioButton) findViewById(R.id.radioButton2a);
        radioButton3a = (RadioButton) findViewById(R.id.radioButton3a);
        radioButton4a = (RadioButton) findViewById(R.id.radioButton4a);

        radioButton5 = (RadioButton) findViewById(R.id.radioButton5);
        radioButton6 = (RadioButton) findViewById(R.id.radioButton6);
        radioButton7 = (RadioButton) findViewById(R.id.radioButton7);
        radioButton8 = (RadioButton) findViewById(R.id.radioButton8);
        radioButton9 = (RadioButton) findViewById(R.id.radioButton9);
        radioButton9a = (RadioButton) findViewById(R.id.radioButton9a);
        radioButton10 = (RadioButton) findViewById(R.id.radioButton10);
        radioButton11 = (RadioButton) findViewById(R.id.radioButton11);
        radioButton12 = (RadioButton) findViewById(R.id.radioButton12);
        radioButton13 = (RadioButton) findViewById(R.id.radioButton13);
        radioButton14 = (RadioButton) findViewById(R.id.radioButton14);
        radioButton15 = (RadioButton) findViewById(R.id.radioButton15);
        radioButton16 = (RadioButton) findViewById(R.id.radioButton16);
        radioButton17 = (RadioButton) findViewById(R.id.radioButton17);
        radioButton18 = (RadioButton) findViewById(R.id.radioButton18);
        radioButton19 = (RadioButton) findViewById(R.id.radioButton19);
        radioButton20 = (RadioButton) findViewById(R.id.radioButton20);
        radioButton21 = (RadioButton) findViewById(R.id.radioButton21);
        radioButton22 = (RadioButton) findViewById(R.id.radioButton22);
        radioButton23 = (RadioButton) findViewById(R.id.radioButton23);
        radioButton24 = (RadioButton) findViewById(R.id.radioButton24);
        radioButton25 = (RadioButton) findViewById(R.id.radioButton25);
        radioButton26 = (RadioButton) findViewById(R.id.radioButton26);
        radioButton27 = (RadioButton) findViewById(R.id.radioButton27);
        radioButton28 = (RadioButton) findViewById(R.id.radioButton28);
        radioButton29 = (RadioButton) findViewById(R.id.radioButton29);
        radioButton30 = (RadioButton) findViewById(R.id.radioButton30);
        radioButton31 = (RadioButton) findViewById(R.id.radioButton31);
        radioButton32 = (RadioButton) findViewById(R.id.radioButton32);
        radioButton33 = (RadioButton) findViewById(R.id.radioButton33);
        radioButton34 = (RadioButton) findViewById(R.id.radioButton34);
        radioButton35 = (RadioButton) findViewById(R.id.radioButton35);
        radioButton36 = (RadioButton) findViewById(R.id.radioButton36);
        radioButton37 = (RadioButton) findViewById(R.id.radioButton37);
        radioButton38 = (RadioButton) findViewById(R.id.radioButton38);
        radioButton39 = (RadioButton) findViewById(R.id.radioButton39);
        radioButton40 = (RadioButton) findViewById(R.id.radioButton40);
        radioButton41 = (RadioButton) findViewById(R.id.radioButton41);
        radioButton42 = (RadioButton) findViewById(R.id.radioButton42);
        radioButton43 = (RadioButton) findViewById(R.id.radioButton43);
    }



    public void checkone(View v){
        if (radioButton1.isChecked()){

            testes.put(radioButton1,4);

        }else {

            testes.put(radioButton1,0);
        }
        if (radioButton2.isChecked()){
            testes.put(radioButton2,3);

        }else {
            testes.put(radioButton2,0);
        }

        if (radioButton3.isChecked()){
            testes.put(radioButton3,2);

        }else {
            testes.put(radioButton3,0);
        }

        if (radioButton4.isChecked()){
            testes.put(radioButton4,1);

        }else {
            testes.put(radioButton4,0);
        }
        //==============================

        if (radioButton1a.isChecked()){

            testes.put(radioButton1a,4);

        }else {

            testes.put(radioButton1a,0);
        }
        if (radioButton2a.isChecked()){
            testes.put(radioButton2a,3);

        }else {
            testes.put(radioButton2a,0);
        }

        if (radioButton3a.isChecked()){
            testes.put(radioButton3a,2);

        }else {
            testes.put(radioButton3a,0);
        }

        if (radioButton4a.isChecked()){
            testes.put(radioButton4a,1);

        }else {
            testes.put(radioButton4a,0);
        }

        //===========================
        if (radioButton5.isChecked()){
            testes.put(radioButton5,4);

        }else {
            testes.put(radioButton5,0);
        }

        if (radioButton6.isChecked()){
            testes.put(radioButton6,3);

        }else {
            testes.put(radioButton6,0);
        }

        if (radioButton7.isChecked()){
            testes.put(radioButton7,2);

        }else {
            testes.put(radioButton7,0);
        }
        if (radioButton8.isChecked()){
            testes.put(radioButton8,1);

        }else {
            testes.put(radioButton8,0);
        }
//===========================
        if (radioButton9.isChecked()){
            testes.put(radioButton9,4);

        }else {
            testes.put(radioButton8,0);
        }

        if (radioButton9a.isChecked()){
            testes.put(radioButton9a,3);

        }else {
            testes.put(radioButton9a,0);
        }


        if (radioButton10.isChecked()){
            testes.put(radioButton10,2);

        }else {
            testes.put(radioButton10,0);
        }

        if (radioButton11.isChecked()){
            testes.put(radioButton11,1);

        }else {
            testes.put(radioButton11,0);
        }
        //===========================

        if (radioButton12.isChecked()){
            testes.put(radioButton12,4);

        }else {
            testes.put(radioButton12,0);
        }

        if (radioButton13.isChecked()){
            testes.put(radioButton13,3);

        }else {
            testes.put(radioButton13,0);
        }

        if (radioButton14.isChecked()){
            testes.put(radioButton14,2);

        }else {
            testes.put(radioButton14,0);
        }

        if (radioButton15.isChecked()){
            testes.put(radioButton15,1);

        }else {
            testes.put(radioButton15,0);
        }
        //============================
        if (radioButton16.isChecked()){
            testes.put(radioButton16,4);

        }else {
            testes.put(radioButton16,0);
        }
        if (radioButton17.isChecked()){
            testes.put(radioButton17,3);

        }else {
            testes.put(radioButton17,0);
        }

        if (radioButton18.isChecked()){
            testes.put(radioButton18,2);

        }else {
            testes.put(radioButton18,0);
        }

        if (radioButton19.isChecked()){
            testes.put(radioButton19,1);

        }else {
            testes.put(radioButton19,0);
        }
        //============================
        if (radioButton20.isChecked()){
            testes.put(radioButton20,4);

        }else {
            testes.put(radioButton20,0);
        }


        if (radioButton21.isChecked()){
            testes.put(radioButton21,3);

        }else {
            testes.put(radioButton21,0);
        }

        if (radioButton22.isChecked()){
            testes.put(radioButton22,2);

        }else {
            testes.put(radioButton22,0);
        }

        if (radioButton23.isChecked()){
            testes.put(radioButton23,1);

        }else {
            testes.put(radioButton23,0);
        }
        //============================
        if (radioButton24.isChecked()){
            testes.put(radioButton24,4);

        }else {
            testes.put(radioButton24,0);
        }
        if (radioButton25.isChecked()){
            testes.put(radioButton25,3);

        }else {
            testes.put(radioButton25,0);
        }

        if (radioButton26.isChecked()){
            testes.put(radioButton26,2);

        }else {
            testes.put(radioButton26,0);
        }

        if (radioButton27.isChecked()){
            testes.put(radioButton27,1);

        }else {
            testes.put(radioButton27,0);
        }
        //==============================
        if (radioButton28.isChecked()){
            testes.put(radioButton28,4);

        }else {
            testes.put(radioButton28,0);
        }

        if (radioButton29.isChecked()){
            testes.put(radioButton29,3);

        }else {
            testes.put(radioButton29,0);
        }

        if (radioButton30.isChecked()){
            testes.put(radioButton30,2);

        }else {
            testes.put(radioButton30,0);
        }

        if (radioButton31.isChecked()){
            testes.put(radioButton31,1);

        }else {
            testes.put(radioButton31,0);
        }
        //=============================
        if (radioButton32.isChecked()){
            testes.put(radioButton32,4);

        }else {
            testes.put(radioButton32,0);
        }

        if (radioButton33.isChecked()){
            testes.put(radioButton33,3);

        }else {
            testes.put(radioButton33,0);
        }

        if (radioButton34.isChecked()){
            testes.put(radioButton34,2);

        }else {
            testes.put(radioButton34,0);
        }

        if (radioButton35.isChecked()){
            testes.put(radioButton35,1);

        }else {
            testes.put(radioButton35,0);
        }
        //==============================
        if (radioButton36.isChecked()){
            testes.put(radioButton36,4);

        }else {
            testes.put(radioButton36,0);
        }
        if (radioButton37.isChecked()){
            testes.put(radioButton37,3);

        }else {
            testes.put(radioButton37,0);
        }

        if (radioButton38.isChecked()){
            testes.put(radioButton38,2);

        }else {
            testes.put(radioButton38,0);
        }

        if (radioButton39.isChecked()){
            testes.put(radioButton39,1);

        }else {
            testes.put(radioButton39,0);
        }
        //==================================
        if (radioButton40.isChecked()){
            testes.put(radioButton40,4);

        }else {
            testes.put(radioButton40,0);
        }
        //===========================
        if (radioButton41.isChecked()){
            testes.put(radioButton41,3);

        }else {
            testes.put(radioButton41,0);
        }

        if (radioButton42.isChecked()){
            testes.put(radioButton42,2);

        }else {
            testes.put(radioButton42,0);
        }

        if (radioButton43.isChecked()){
            testes.put(radioButton43,1);

        }else {
            testes.put(radioButton43,0);
        }
        resultados();

    }

    public void resultados(){
        this.Resultados = 0;
        for (int e : testes.values()){

            this.Resultados += e;
        }
    }


}


