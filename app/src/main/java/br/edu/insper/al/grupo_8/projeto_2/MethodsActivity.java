package br.edu.insper.al.grupo_8.projeto_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import br.edu.insper.al.grupo_8.projeto_2.Methods.MethodIActivity;
import br.edu.insper.al.grupo_8.projeto_2.Methods.MethodIIActivity;
import br.edu.insper.al.grupo_8.projeto_2.Methods.MethodIIIActivity;
import br.edu.insper.al.grupo_8.projeto_2.Methods.MethodIVActivity;
import br.edu.insper.al.grupo_8.projeto_2.Methods.MethodIXActivity;
import br.edu.insper.al.grupo_8.projeto_2.Methods.MethodPaciente;
import br.edu.insper.al.grupo_8.projeto_2.Methods.MethodVActivity;
import br.edu.insper.al.grupo_8.projeto_2.Methods.MethodVIActivity;
import br.edu.insper.al.grupo_8.projeto_2.Methods.MethodVIIActivity;
import br.edu.insper.al.grupo_8.projeto_2.Methods.MethodVIIIActivity;
import br.edu.insper.al.grupo_8.projeto_2.Methods.MethodXActivity;
import br.edu.insper.al.grupo_8.projeto_2.Methods.MethodXIActivity;
import br.edu.insper.al.grupo_8.projeto_2.Methods.MethodXIIActivity;


public class MethodsActivity extends AppCompatActivity {

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
        buttonGoMethodI.setOnClickListener((view) -> startMethodActivity(MethodIActivity.class));

        Button buttonGoMethodII = findViewById(R.id.button_goMethodII);
        buttonGoMethodII.setOnClickListener((view) -> startMethodActivity(MethodIIActivity.class));

        Button buttonGoMethodIII = findViewById(R.id.button_goMethodIII);
        buttonGoMethodIII.setOnClickListener((view) -> startMethodActivity(MethodIIIActivity.class));

        Button buttonGoMethodIV = findViewById(R.id.button_goMethodIV);
        buttonGoMethodIV.setOnClickListener((view) -> startMethodActivity(MethodIVActivity.class));

        Button buttonGoMethodV = findViewById(R.id.button_goMethodV);
        buttonGoMethodV.setOnClickListener((view) -> startMethodActivity(MethodVActivity.class));

        Button buttonGoMethodVI = findViewById(R.id.button_goMethodVI);
        buttonGoMethodVI.setOnClickListener((view) -> startMethodActivity(MethodVIActivity.class));

        Button buttonGoMethodVII = findViewById(R.id.button_goMethodVII);
        buttonGoMethodVII.setOnClickListener((view) -> startMethodActivity(MethodVIIActivity.class));

        Button buttonGoMethodVIII = findViewById(R.id.button_goMethodVIII);
        buttonGoMethodVIII.setOnClickListener((view) -> startMethodActivity(MethodVIIIActivity.class));

        Button buttonGoMethodIX = findViewById(R.id.button_goMethodIX);

        buttonGoMethodIX.setOnClickListener((view) -> startMethodActivity(MethodIXActivity.class));

        Button buttonGoMethodX = findViewById(R.id.button_goMethodX);
        buttonGoMethodX.setOnClickListener((view) -> startMethodActivity(MethodXActivity.class));

        Button buttonGoMethodXI = findViewById(R.id.button_goMethodXI);
        buttonGoMethodXI.setOnClickListener((view) -> startMethodActivity(MethodXIActivity.class));

//        Button buttonGoMethodXII = findViewById(R.id.button_goMethodXII);
//        buttonGoMethodXII.setOnClickListener((view) -> startMethodActivity(MethodXIIActivity.class));

        Button buttonGoMethodXIII = findViewById(R.id.button_goMethodXII);
        buttonGoMethodXIII.setOnClickListener((view) -> startMethodActivity(MethodPaciente.class));

    }
}
