package br.edu.insper.al.grupo_8.projeto_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MethodsActivity extends AppCompatActivity {

    private Class MethodVActivity = br.edu.insper.al.grupo_8.projeto_2.MethodVActivity.class;

    private void startMethodActivity(Class classe){
        Intent intent = new Intent(this, classe);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_methods);

        // LEMBRE-SE DE CRIAR UM ATRIBUTO DO TIPO CLASS PARA A ACTIVITY DO SEU MÉTODO

        Button buttonGoMethodI = findViewById(R.id.button_goMethodI);
        //buttonGoMethodI.setOnClickListener((view) -> startMethodActivity(NOME_DA_CLASSE));

        Button buttonGoMethodII = findViewById(R.id.button_goMethodII);
        //buttonGoMethodII.setOnClickListener((view) -> startMethodActivity(NOME_DA_CLASSE));

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
