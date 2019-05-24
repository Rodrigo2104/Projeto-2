package br.edu.insper.al.grupo_8.projeto_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

//import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

import java.lang.reflect.Method;

public class MethodsActivity extends AppCompatActivity {

    private Class MethodVActivity;

    private void startMethodActivity(Class oi){
        Intent intent = new Intent(this, oi);
        startActivity(intent);
    }
    private void startMetodo1(){
        Intent intent = new Intent(this, metodo1.class);
        startActivity(intent);
    }

    private void startMetodo2(){
        Intent intent = new Intent(this, metodo2.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_methods);

        // LEMBRE-SE DE CRIAR UM ATRIBUTO DO TIPO CLASS PARA A ACTIVITY DO SEU MÉTODO

        Button buttonGoMethodI = findViewById(R.id.button_goMethodI);
        buttonGoMethodI.setOnClickListener((view) -> startMetodo1());

        Button buttonGoMethodII = findViewById(R.id.button_goMethodII);
        buttonGoMethodII.setOnClickListener((view) -> startMetodo2());

        Button buttonGoMethodIII = findViewById(R.id.button_goMethodIII);
        //buttonGoMethodIII.setOnClickListener((view) -> startMethodActivity(NOME_DA_CLASSE));

        Button buttonGoMethodIV = findViewById(R.id.button_goMethodIV);
        //buttonGoMethodIV.setOnClickListener((view) -> startMethodActivity(NOME_DA_CLASSE));

        Button buttonGoMethodV = findViewById(R.id.button_goMethodV);
        buttonGoMethodV.setOnClickListener((view) -> startMethodActivity(MethodVActivity));

        Button buttonGoMethodVI = findViewById(R.id.button_goMethodVI);
        //buttonGoMethodVI.setOnClickListener((view) -> startMethodActivity(NOME_DA_CLASSE));

        Button buttonGoMethodVII = findViewById(R.id.button_goMethodVII);
        //buttonGoMethodVII.setOnClickListener((view) -> startMethodActivity(NOME_DA_CLASSE));

        Button buttonGoMethodVIII = findViewById(R.id.button_goMethodVIII);
        //buttonGoMethodVIII.setOnClickListener((view) -> startMethodActivity(NOME_DA_CLASSE));

        Button buttonGoMethodIX = findViewById(R.id.button_goMethodIX);
        //buttonGoMethodIX.setOnClickListener((view) -> startMethodActivity(NOME_DA_CLASSE));

        Button buttonGoMethodX = findViewById(R.id.button_goMethodX);
        //buttonGoMethodX.setOnClickListener((view) -> startMethodActivity(NOME_DA_CLASSE));

    }
}
