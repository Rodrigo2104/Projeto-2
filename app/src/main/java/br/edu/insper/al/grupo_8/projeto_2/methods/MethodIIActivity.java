package br.edu.insper.al.grupo_8.projeto_2.methods;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

import br.edu.insper.al.grupo_8.projeto_2.R;
import br.edu.insper.al.grupo_8.projeto_2.TestsActivity;

public class MethodIIActivity extends AppCompatActivity {
    private HashMap<RadioButton, Integer> testes = new HashMap<RadioButton, Integer>();
    private HashMap<CheckBox, Integer> testes_checkBox = new HashMap<CheckBox, Integer>();
    private HashMap<CheckBox, Integer> testes_meio = new HashMap<CheckBox, Integer>();

    private int Resultados;
    private String rh;
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

    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private CheckBox checkBox3;
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
    private CheckBox checkBox15;


    private void startMethodActivity(Class classe) {
        Intent intent = new Intent(this, classe);
        intent.putExtra("rh", rh);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_ii);

        Bundle extras = getIntent().getExtras();
        assert extras != null;
        rh = extras.getString("rh");

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("Pacientes");

        Button buttonGoMenu = findViewById(R.id.button_goMenu);
        buttonGoMenu.setOnClickListener((view) -> startMethodActivity(TestsActivity.class));

        Button buttonNext = findViewById(R.id.button_goMethodIII);
        buttonNext.setOnClickListener((view) ->{
            ref.child(rh).child("Testes").child("t02").setValue(resultado.getText().toString());
            startMethodActivity(MethodIIIActivity.class);
        });

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
        resultado = (TextView) findViewById(R.id.textView46);
        //=============================================================
        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 =  (CheckBox) findViewById(R.id.checkBox3);
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
        checkBox15 =  (CheckBox) findViewById(R.id.checkBox15);

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
        //==============================
        if (checkBox1.isChecked()){
            testes_checkBox.put(checkBox1,1);

        }else {
            testes_checkBox.put(checkBox1,0);
        }
        //===========================================
        if (checkBox10.isChecked()){
            testes_checkBox.put(checkBox10,1);

        }else {
            testes_checkBox.put(checkBox10,0);
        }
        if (checkBox11.isChecked()){
            testes_checkBox.put(checkBox11,1);

        }else {
            testes_checkBox.put(checkBox11,0);
        }
        if (checkBox12.isChecked()){
            testes_checkBox.put(checkBox12,1);

        }else {
            testes_checkBox.put(checkBox12,0);
        }
        if (checkBox13.isChecked()){
            testes_checkBox.put(checkBox13,1);

        }else {
            testes_checkBox.put(checkBox13,0);
        }
        //=========================================
        if (checkBox2.isChecked()){
            testes_meio.put(checkBox2,1);

        }else {
            testes_meio.put(checkBox2,0);
        }
        if (checkBox3.isChecked()){
            testes_meio.put(checkBox3,1);

        }else {
            testes_meio.put(checkBox3,0);
        }
        if (checkBox4.isChecked()){
            testes_meio.put(checkBox4,1);

        }else {
            testes_meio.put(checkBox4,0);
        }
        if (checkBox5.isChecked()){
            testes_meio.put(checkBox5,1);

        }else {
            testes_meio.put(checkBox5,0);
        }
        if (checkBox6.isChecked()){
            testes_meio.put(checkBox6,1);

        }else {
            testes_meio.put(checkBox6,0);
        }
        if (checkBox7.isChecked()){
            testes_meio.put(checkBox7,1);

        }else {
            testes_meio.put(checkBox7,0);
        }
        if (checkBox8.isChecked()){
            testes_meio.put(checkBox8,1);

        }else {
            testes_meio.put(checkBox8,0);
        }
        if (checkBox9.isChecked()){
            testes_meio.put(checkBox9,1);

        }else {
            testes_meio.put(checkBox9,0);
        }
        resultados();
//        int radio = rg.getCheckedRadioButtonId();
//        RadioButton radioButton1 = (RadioButton)findViewById(radio);

    }

    @SuppressLint("SetTextI18n")
    public void resultados(){
        this.Resultados = 0;
        int meio = 0;
        for (int e : testes.values()){

            this.Resultados += e;
        }
        for (int e : testes_checkBox.values()){

            this.Resultados += e;
        }

        for (int e : testes_meio.values()){

            meio += e;
        }
        if (meio>=2){
            this.Resultados += 1;
        }
        if (meio>=5){
            this.Resultados += 1;
        }

        resultado.setText(String.valueOf(Resultados));


    }


}
