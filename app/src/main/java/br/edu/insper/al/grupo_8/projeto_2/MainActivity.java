package br.edu.insper.al.grupo_8.projeto_2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private void startHomeActivity() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SharedPreferences sh = this.getSharedPreferences("perguntas", MODE_PRIVATE);

        Button button_login = findViewById(R.id.button_login);

        button_login.setOnClickListener((view -> startHomeActivity()));
    }
}
