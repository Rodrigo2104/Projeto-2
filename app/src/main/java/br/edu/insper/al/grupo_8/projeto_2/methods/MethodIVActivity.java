package br.edu.insper.al.grupo_8.projeto_2.methods;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.TextView;

import br.edu.insper.al.grupo_8.projeto_2.R;

public class MethodIVActivity extends AppCompatActivity{
    private int soma1, soma2, soma3, soma4, soma5, soma6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_iv);

        TextView resultadoSoma = findViewById(R.id.resultado);

        RadioButton cb1 = findViewById(R.id.radioButton1);
        RadioButton cb2 = findViewById(R.id.radioButton2);
        RadioButton cb3 = findViewById(R.id.radioButton3);
        RadioButton cb4 = findViewById(R.id.radioButton4);
        RadioButton cb5 = findViewById(R.id.radioButton5);
        RadioButton cb6 = findViewById(R.id.radioButton6);
        RadioButton cb7 = findViewById(R.id.radioButton7);
        RadioButton cb8 = findViewById(R.id.radioButton8);
        RadioButton cb9 = findViewById(R.id.radioButton9);
        RadioButton cb10 = findViewById(R.id.radioButton10);
        RadioButton cb11 = findViewById(R.id.radioButton11);
        RadioButton cb12 = findViewById(R.id.radioButton12);

        cb1.setOnClickListener(v -> {
            if (cb1.isChecked()) {
                soma1 = 0;
            } resultadoSoma.setText(String.valueOf(soma1 + soma2 + soma3 + soma4 + soma5 + soma6));
        });

        cb2.setOnClickListener(v -> {
            if (cb2.isChecked()) {
                soma1 = 1;
            } resultadoSoma.setText(String.valueOf(soma1 + soma2 + soma3 + soma4 + soma5 + soma6));
        });

        cb3.setOnClickListener(v -> {
            if (cb3.isChecked()) {
                soma2 = 0;
            } resultadoSoma.setText(String.valueOf(soma1 + soma2 + soma3 + soma4 + soma5 + soma6));
        });

        cb4.setOnClickListener(v -> {
            if (cb4.isChecked()) {
                soma2 = 1;
            } resultadoSoma.setText(String.valueOf(soma1 + soma2 + soma3 + soma4 + soma5 + soma6));
        });

        cb5.setOnClickListener(v -> {
            if (cb5.isChecked()) {
                soma3 = 0;
            } resultadoSoma.setText(String.valueOf(soma1 + soma2 + soma3 + soma4 + soma5 + soma6));
        });

        cb6.setOnClickListener(v -> {
            if (cb6.isChecked()) {
                soma3 = 1;
            } resultadoSoma.setText(String.valueOf(soma1 + soma2 + soma3 + soma4 + soma5 + soma6));
        });

        cb7.setOnClickListener(v -> {
            if (cb7.isChecked()) {
                soma4 = 0;
            } resultadoSoma.setText(String.valueOf(soma1 + soma2 + soma3 + soma4 + soma5 + soma6));
        });

        cb8.setOnClickListener(v -> {
            if (cb8.isChecked()) {
                soma4 = 1;
            } resultadoSoma.setText(String.valueOf(soma1 + soma2 + soma3 + soma4 + soma5 + soma6));
        });

        cb9.setOnClickListener(v -> {
            if (cb9.isChecked()) {
                soma5 = 0;
            } resultadoSoma.setText(String.valueOf(soma1 + soma2 + soma3 + soma4 + soma5 + soma6));
        });

        cb10.setOnClickListener(v -> {
            if (cb10.isChecked()) {
                soma5 = 1;
            } resultadoSoma.setText(String.valueOf(soma1 + soma2 + soma3 + soma4 + soma5 + soma6));
        });

        cb11.setOnClickListener(v -> {
            if (cb11.isChecked()) {
                soma6 = 0;
            } resultadoSoma.setText(String.valueOf(soma1 + soma2 + soma3 + soma4 + soma5 + soma6));
        });

        cb12.setOnClickListener(v -> {
            if (cb12.isChecked()) {
                soma6 = 1;
            }
            resultadoSoma.setText(String.valueOf(soma1 + soma2 + soma3 + soma4 + soma5 + soma6));
        });
    }
}
