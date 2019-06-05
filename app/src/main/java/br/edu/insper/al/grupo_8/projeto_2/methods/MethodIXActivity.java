package br.edu.insper.al.grupo_8.projeto_2.methods;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import br.edu.insper.al.grupo_8.projeto_2.R;

public class MethodIXActivity extends AppCompatActivity {
    private int s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14;

    private void startMethodActivity(Class classe) {
        Intent intent = new Intent(this, classe);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_ix);

        Button buttonGoMethodVIII = findViewById(R.id.button_goMethodVIII);
        buttonGoMethodVIII.setOnClickListener((view) -> startMethodActivity(MethodVIIIActivity.class));

        Button buttonGoMethodX = findViewById(R.id.button_goMethodX);
        buttonGoMethodX.setOnClickListener((view) -> startMethodActivity(MethodXActivity.class));

        TextView resultadoSoma = findViewById(R.id.resultadoix);

        RadioButton cb0 = findViewById(R.id.radioButton20);
        RadioButton cb1 = findViewById(R.id.radioButton21);
        RadioButton cb2 = findViewById(R.id.radioButton22);
        RadioButton cb3 = findViewById(R.id.radioButton23);
        RadioButton cb4 = findViewById(R.id.radioButton40);
        RadioButton cb5 = findViewById(R.id.radioButton41);
        RadioButton cb6 = findViewById(R.id.radioButton42);
        RadioButton cb7 = findViewById(R.id.radioButton43);
        RadioButton cb8 = findViewById(R.id.radioButton60);
        RadioButton cb9 = findViewById(R.id.radioButton61);
        RadioButton cb10 = findViewById(R.id.radioButton62);
        RadioButton cb11 = findViewById(R.id.radioButton63);
        RadioButton cb12 = findViewById(R.id.radioButton80);
        RadioButton cb13 = findViewById(R.id.radioButton81);
        RadioButton cb14 = findViewById(R.id.radioButton82);
        RadioButton cb15 = findViewById(R.id.radioButton83);
        RadioButton cb16 = findViewById(R.id.radioButton100);
        RadioButton cb17 = findViewById(R.id.radioButton101);
        RadioButton cb18 = findViewById(R.id.radioButton102);
        RadioButton cb19 = findViewById(R.id.radioButton103);
        RadioButton cb20 = findViewById(R.id.radioButton120);
        RadioButton cb21 = findViewById(R.id.radioButton121);
        RadioButton cb22 = findViewById(R.id.radioButton122);
        RadioButton cb23 = findViewById(R.id.radioButton123);
        RadioButton cb24 = findViewById(R.id.radioButton140);
        RadioButton cb25 = findViewById(R.id.radioButton141);
        RadioButton cb26 = findViewById(R.id.radioButton142);
        RadioButton cb27 = findViewById(R.id.radioButton143);
        RadioButton cb28 = findViewById(R.id.radioButton160);
        RadioButton cb29 = findViewById(R.id.radioButton161);
        RadioButton cb30 = findViewById(R.id.radioButton162);
        RadioButton cb31 = findViewById(R.id.radioButton163);
        RadioButton cb32 = findViewById(R.id.radioButton180);
        RadioButton cb33 = findViewById(R.id.radioButton181);
        RadioButton cb34 = findViewById(R.id.radioButton182);
        RadioButton cb35 = findViewById(R.id.radioButton183);
        RadioButton cb36 = findViewById(R.id.radioButton200);
        RadioButton cb37 = findViewById(R.id.radioButton201);
        RadioButton cb38 = findViewById(R.id.radioButton202);
        RadioButton cb39 = findViewById(R.id.radioButton203);
        RadioButton cb40 = findViewById(R.id.radioButton220);
        RadioButton cb41 = findViewById(R.id.radioButton221);
        RadioButton cb42 = findViewById(R.id.radioButton222);
        RadioButton cb43 = findViewById(R.id.radioButton223);
        RadioButton cb44 = findViewById(R.id.radioButton240);
        RadioButton cb45 = findViewById(R.id.radioButton241);
        RadioButton cb46 = findViewById(R.id.radioButton242);
        RadioButton cb47 = findViewById(R.id.radioButton243);
        RadioButton cb48 = findViewById(R.id.radioButton260);
        RadioButton cb49 = findViewById(R.id.radioButton261);
        RadioButton cb50 = findViewById(R.id.radioButton262);
        RadioButton cb51 = findViewById(R.id.radioButton263);
        RadioButton cb52 = findViewById(R.id.radioButton280);
        RadioButton cb53 = findViewById(R.id.radioButton281);
        RadioButton cb54 = findViewById(R.id.radioButton282);
        RadioButton cb55 = findViewById(R.id.radioButton283);

        cb0.setOnClickListener(v ->{
            if (cb0.isChecked()){
                s1 = 0;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb1.setOnClickListener(v ->{
            if (cb1.isChecked()){
                s1 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb2.setOnClickListener(v ->{
            if (cb2.isChecked()){
                s1 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb3.setOnClickListener(v ->{
            if (cb3.isChecked()){
                s1 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb4.setOnClickListener(v ->{
            if (cb4.isChecked()){
                s2 = 0;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb5.setOnClickListener(v ->{
            if (cb5.isChecked()){
                s2 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb6.setOnClickListener(v ->{
            if (cb6.isChecked()){
                s2 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb7.setOnClickListener(v ->{
            if (cb7.isChecked()){
                s2 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb8.setOnClickListener(v ->{
            if (cb8.isChecked()){
                s3 = 0;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb9.setOnClickListener(v ->{
            if (cb9.isChecked()){
                s3 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb10.setOnClickListener(v ->{
            if (cb10.isChecked()){
                s3 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb11.setOnClickListener(v ->{
            if (cb11.isChecked()){
                s3 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb12.setOnClickListener(v ->{
            if (cb12.isChecked()){
                s4 = 0;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb13.setOnClickListener(v ->{
            if (cb13.isChecked()){
                s4 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb14.setOnClickListener(v ->{
            if (cb14.isChecked()){
                s4 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb15.setOnClickListener(v ->{
            if (cb15.isChecked()){
                s4 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb16.setOnClickListener(v ->{
            if (cb16.isChecked()){
                s5 = 0;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb17.setOnClickListener(v ->{
            if (cb17.isChecked()){
                s5 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb18.setOnClickListener(v ->{
            if (cb18.isChecked()){
                s5 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb19.setOnClickListener(v ->{
            if (cb19.isChecked()){
                s5 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb20.setOnClickListener(v ->{
            if (cb20.isChecked()){
                s6 = 0;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb21.setOnClickListener(v ->{
            if (cb21.isChecked()){
                s6 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb22.setOnClickListener(v ->{
            if (cb22.isChecked()){
                s6 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb23.setOnClickListener(v ->{
            if (cb23.isChecked()){
                s6 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb24.setOnClickListener(v ->{
            if (cb24.isChecked()){
                s7 = 0;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb25.setOnClickListener(v ->{
            if (cb25.isChecked()){
                s7 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb26.setOnClickListener(v ->{
            if (cb26.isChecked()){
                s7 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb27.setOnClickListener(v ->{
            if (cb27.isChecked()){
                s7 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb28.setOnClickListener(v ->{
            if (cb28.isChecked()){
                s8 = 0;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb29.setOnClickListener(v ->{
            if (cb29.isChecked()){
                s8 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb30.setOnClickListener(v ->{
            if (cb30.isChecked()){
                s8 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb31.setOnClickListener(v ->{
            if (cb31.isChecked()){
                s8 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb32.setOnClickListener(v ->{
            if (cb32.isChecked()){
                s9 = 0;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb33.setOnClickListener(v ->{
            if (cb33.isChecked()){
                s9 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb34.setOnClickListener(v ->{
            if (cb34.isChecked()){
                s9 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb35.setOnClickListener(v ->{
            if (cb35.isChecked()){
                s9 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb36.setOnClickListener(v ->{
            if (cb36.isChecked()){
                s10 = 0;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb37.setOnClickListener(v ->{
            if (cb37.isChecked()){
                s10 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb38.setOnClickListener(v ->{
            if (cb38.isChecked()){
                s10 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb39.setOnClickListener(v ->{
            if (cb39.isChecked()){
                s10 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb40.setOnClickListener(v ->{
            if (cb40.isChecked()){
                s11 = 0;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb41.setOnClickListener(v ->{
            if (cb41.isChecked()){
                s11 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb42.setOnClickListener(v ->{
            if (cb42.isChecked()){
                s11 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb43.setOnClickListener(v ->{
            if (cb43.isChecked()){
                s11 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb44.setOnClickListener(v ->{
            if (cb44.isChecked()){
                s12 = 0;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb45.setOnClickListener(v ->{
            if (cb45.isChecked()){
                s12 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb46.setOnClickListener(v ->{
            if (cb46.isChecked()){
                s12 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb47.setOnClickListener(v ->{
            if (cb47.isChecked()){
                s12 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb48.setOnClickListener(v ->{
            if (cb48.isChecked()){
                s13 = 0;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb49.setOnClickListener(v ->{
            if (cb49.isChecked()){
                s13 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb50.setOnClickListener(v ->{
            if (cb50.isChecked()){
                s13 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb51.setOnClickListener(v ->{
            if (cb51.isChecked()){
                s13 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb52.setOnClickListener(v ->{
            if (cb52.isChecked()){
                s14 = 0;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb53.setOnClickListener(v ->{
            if (cb53.isChecked()){
                s14 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb54.setOnClickListener(v ->{
            if (cb54.isChecked()){
                s14 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });cb55.setOnClickListener(v ->{
            if (cb55.isChecked()){
                s14 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14));
        });



    }}