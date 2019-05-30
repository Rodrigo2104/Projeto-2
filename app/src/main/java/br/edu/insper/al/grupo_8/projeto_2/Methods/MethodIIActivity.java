package br.edu.insper.al.grupo_8.projeto_2.Methods;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.HashMap;

import br.edu.insper.al.grupo_8.projeto_2.R;

public class MethodIIActivity extends AppCompatActivity {
    private HashMap<RadioButton, Integer> testes = new HashMap<RadioButton, Integer>();
    private int Resultados;

    private TextView resultado;
    
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private RadioButton radioButton4;
    private RadioButton radioButton5;
    private RadioButton radioButton6;
    private RadioButton radioButton7;
    private RadioButton radioButton8;
    private RadioButton radioButton9;
    private RadioButton radioButton10;
    private RadioButton radioButton11;
    private RadioButton radioButton12;
    private RadioButton radioButton13;
    private RadioButton radioButton14;
    private RadioButton radioButton15;
    private RadioGroup rg;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_ii);
        radioButton1 = (RadioButton) findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        radioButton4 = (RadioButton) findViewById(R.id.radioButton4);
        radioButton5 = (RadioButton) findViewById(R.id.radioButton5);
        radioButton6 = (RadioButton) findViewById(R.id.radioButton6);
        radioButton7 = (RadioButton) findViewById(R.id.radioButton7);
        radioButton8 = (RadioButton) findViewById(R.id.radioButton8);
        radioButton9 = (RadioButton) findViewById(R.id.radioButton9);
        radioButton10 = (RadioButton) findViewById(R.id.radioButton10);
        radioButton11 = (RadioButton) findViewById(R.id.radioButton11);
        radioButton12 = (RadioButton) findViewById(R.id.radioButton12);
        radioButton13 = (RadioButton) findViewById(R.id.radioButton13);
        radioButton14 = (RadioButton) findViewById(R.id.radioButton14);
        radioButton15 = (RadioButton) findViewById(R.id.radioButton15);

    }

    public void checkone(View v){
        if (radioButton1.isChecked()){

            testes.put(radioButton1,0);

        }else {

            testes.put(radioButton1,0);
        }
        if (radioButton2.isChecked()){
            testes.put(radioButton2,1);

        }else {
            testes.put(radioButton2,0);
        }
        //============================
        if (radioButton3.isChecked()){
            testes.put(radioButton3,2);

        }else {
            testes.put(radioButton3,0);
        }
        //===========================
        if (radioButton4.isChecked()){
            testes.put(radioButton4,0);

        }else {
            testes.put(radioButton4,0);
        }
        //===========================
        if (radioButton5.isChecked()){
            testes.put(radioButton5,1);

        }else {
            testes.put(radioButton5,0);
        }
        //===========================
        if (radioButton6.isChecked()){
            testes.put(radioButton6,2);

        }else {
            testes.put(radioButton6,0);
        }
        //===========================
        if (radioButton7.isChecked()){
            testes.put(radioButton7,0);

        }else {
            testes.put(radioButton7,0);
        }
        //===========================
        if (radioButton8.isChecked()){
            testes.put(radioButton8,1);

        }else {
            testes.put(radioButton8,0);
        }
        //===========================
        if (radioButton9.isChecked()){
            testes.put(radioButton9,2);

        }else {
            testes.put(radioButton9,0);
        }
        //===========================
        if (radioButton10.isChecked()){
            testes.put(radioButton10,0);

        }else {
            testes.put(radioButton10,0);
        }
        //===========================
        if (radioButton11.isChecked()){
            testes.put(radioButton11,1);

        }else {
            testes.put(radioButton11,0);
        }
        //===========================
        if (radioButton12.isChecked()){
            testes.put(radioButton12,2);

        }else {
            testes.put(radioButton12,0);
        }
        //===========================
        if (radioButton13.isChecked()){
            testes.put(radioButton13,0);

        }else {
            testes.put(radioButton13,0);
        }
        //===========================
        if (radioButton14.isChecked()){
            testes.put(radioButton14,1);

        }else {
            testes.put(radioButton14,0);
        }
        //===========================
        if (radioButton15.isChecked()){
            testes.put(radioButton15,2);

        }else {
            testes.put(radioButton15,0);
        }
//        int radio = rg.getCheckedRadioButtonId();
//        RadioButton radioButton1 = (RadioButton)findViewById(radio);

    }


}
