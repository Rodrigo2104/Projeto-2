package br.edu.insper.al.grupo_8.projeto_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private void startMethodsActivity() {
        Intent intent = new Intent(this, MethodsActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button buttonGoMethods = findViewById(R.id.button_goMethods);

        buttonGoMethods.setOnClickListener((view -> {
            startMethodsActivity();
        }));
    }
}
