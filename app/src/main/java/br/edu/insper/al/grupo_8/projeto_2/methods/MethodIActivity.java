package br.edu.insper.al.grupo_8.projeto_2.methods;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.HashMap;

import br.edu.insper.al.grupo_8.projeto_2.R;

public class MethodIActivity extends AppCompatActivity {
    private HashMap<CheckBox, Integer> testes = new HashMap<CheckBox, Integer>();
    private int Resultados;

    private TextView resultado;


    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private CheckBox checkBox3;
    private CheckBox checkBox4;
    private CheckBox checkBox5;
    private CheckBox checkBox6;
    private CheckBox checkBox7a;
    private CheckBox checkBox7b;
    private CheckBox checkBox8;
    private CheckBox checkBox9;
    private CheckBox checkBox10;
    private CheckBox checkBox11;
    private CheckBox checkBox12;
    private CheckBox checkBox13;
    private CheckBox checkBox14;
    private CheckBox checkBox15;
    private CheckBox checkBox16;
    private CheckBox checkBox17;
    private CheckBox checkBox18;
    private CheckBox checkBox19;
    private CheckBox checkBox20;
    private CheckBox checkBox21;
    private CheckBox checkBox22;
    private CheckBox checkBox23;
    private CheckBox checkBox24;
    private CheckBox checkBox25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_i);


        //=============================

        this.Resultados=0;

        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 =  (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 =  (CheckBox) findViewById(R.id.checkBox4);
        checkBox5 =  (CheckBox) findViewById(R.id.checkBox5);
        checkBox6 =  (CheckBox) findViewById(R.id.checkBox6);
        checkBox7a =  (CheckBox) findViewById(R.id.checkBox7a);
        checkBox7b =  (CheckBox) findViewById(R.id.checkBox7b);
        checkBox8 =  (CheckBox) findViewById(R.id.checkBox8);
        checkBox9 =  (CheckBox) findViewById(R.id.checkBox9);
        checkBox10 =  (CheckBox) findViewById(R.id.checkBox10);
        checkBox11 =  (CheckBox) findViewById(R.id.checkBox11);
        checkBox12 =  (CheckBox) findViewById(R.id.checkBox12);
        checkBox13 =  (CheckBox) findViewById(R.id.checkBox13);
        checkBox14 =  (CheckBox) findViewById(R.id.checkBox14);
        checkBox15 =  (CheckBox) findViewById(R.id.checkBox15);
        checkBox16 =  (CheckBox) findViewById(R.id.checkBox16);
        checkBox17 =  (CheckBox) findViewById(R.id.checkBox17);
        checkBox18 =  (CheckBox) findViewById(R.id.checkBox18);
        checkBox19 =  (CheckBox) findViewById(R.id.checkBox19);
        checkBox20 =  (CheckBox) findViewById(R.id.checkBox20);
        checkBox21 =  (CheckBox) findViewById(R.id.checkBox22);
        checkBox22 =  (CheckBox) findViewById(R.id.checkBox23);
        checkBox23 =  (CheckBox) findViewById(R.id.checkBox24);
        checkBox24 =  (CheckBox) findViewById(R.id.checkBox25);
        checkBox25 =  (CheckBox) findViewById(R.id.checkBox26);

        resultado = (TextView) findViewById(R.id.textView44);




    }

    public void checkone(View v){
        if (checkBox1.isChecked()){

            testes.put(checkBox1,1);

        }else {

            testes.put(checkBox1,0);
        }

        if (checkBox2.isChecked()){
            testes.put(checkBox2,1);

        }else {
            testes.put(checkBox2,0);
        }
        //============================
        if (checkBox3.isChecked()){
            testes.put(checkBox3,1);

        }else {
            testes.put(checkBox3,0);
        }
        //===========================
        if (checkBox4.isChecked()){
            testes.put(checkBox4,1);

        }else {
            testes.put(checkBox4,0);
        }
        //===========================
        //===========================
        if (checkBox6.isChecked()){
            testes.put(checkBox6,1);

        }else {
            testes.put(checkBox6,0);
        }
        //===========================
        if (checkBox7a.isChecked()){
            testes.put(checkBox7a,1);

        }else {
            testes.put(checkBox7a,0);
        }
        //===========================
        if (checkBox7b.isChecked()){
            testes.put(checkBox7b,1);

        }else {
            testes.put(checkBox7b,0);
        }
        //===========================
        if (checkBox8.isChecked()){
            testes.put(checkBox8,1);

        }else {
            testes.put(checkBox8,0);
        }
        //===========================
        if (checkBox9.isChecked()){
            testes.put(checkBox9,1);

        }else {
            testes.put(checkBox9,0);
        }
        //===========================
        if (checkBox10.isChecked()){
            testes.put(checkBox10,1);

        }else {
            testes.put(checkBox10,0);
        }
        //===========================
        if (checkBox11.isChecked()){
            testes.put(checkBox11,1);

        }else {
            testes.put(checkBox11,0);
        }
        //===========================
        if (checkBox12.isChecked()){
            testes.put(checkBox12,1);

        }else {
            testes.put(checkBox12,0);
        }
        //===========================
        if (checkBox13.isChecked()){
            testes.put(checkBox13,1);

        }else {
            testes.put(checkBox13,0);
        }
        //===========================
        if (checkBox14.isChecked()){
            testes.put(checkBox14,1);

        }else {
            testes.put(checkBox14,0);
        }
        //===========================
        if (checkBox15.isChecked()){
            testes.put(checkBox15,1);

        }else {
            testes.put(checkBox15,0);
        }
        //===========================
        if (checkBox16.isChecked()){
            testes.put(checkBox16,1);

        }else {
            testes.put(checkBox16,0);
        }
        //===========================
        if (checkBox17.isChecked()){
            testes.put(checkBox17,1);

        }else {
            testes.put(checkBox17,0);
        }
        //===========================
        if (checkBox18.isChecked()){
            testes.put(checkBox18,1);

        }else {
            testes.put(checkBox18,0);
        }
        //===========================
        if (checkBox19.isChecked()){
            testes.put(checkBox19,1);

        }else {
            testes.put(checkBox19,0);
        }
        //===========================
        if (checkBox20.isChecked()){
            testes.put(checkBox20,1);

        }else {
            testes.put(checkBox20,0);
        }
        //===========================
        if (checkBox21.isChecked()){
            testes.put(checkBox21,1);

        }else {
            testes.put(checkBox21,0);
        }
        //===========================
        if (checkBox22.isChecked()){
            testes.put(checkBox22,1);

        }else {
            testes.put(checkBox22,0);
        }
        //===========================
        if (checkBox23.isChecked()){
            testes.put(checkBox23,1);

        }else {
            testes.put(checkBox23,0);
        }
        //===========================
        if (checkBox24.isChecked()){
            testes.put(checkBox24,1);

        }else {
            testes.put(checkBox24,0);
        }
        //=============================
        if (checkBox25.isChecked()){
            testes.put(checkBox25,1);

        }else {
            testes.put(checkBox25,0);
        }
        //=============================

        resultados();
        System.out.print(Resultados);


    }

    public void resultados(){
        this.Resultados = 0;
        for (int e : testes.values()){

            this.Resultados += e;
        }
        resultado.setText(String.valueOf(Resultados));

    }
}
