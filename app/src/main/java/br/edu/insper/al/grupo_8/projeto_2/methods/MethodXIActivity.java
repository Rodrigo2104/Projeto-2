package br.edu.insper.al.grupo_8.projeto_2.methods;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import br.edu.insper.al.grupo_8.projeto_2.R;

public class MethodXIActivity extends AppCompatActivity {

    private void startMethodActivity(Class classe) {
        Intent intent = new Intent(this, classe);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_xi);

        Button buttonGoMethodXII = findViewById(R.id.button_goMethodXII);
        buttonGoMethodXII.setOnClickListener((view) -> startMethodActivity(MethodXIIActivity.class));

    }

}
