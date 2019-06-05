package br.edu.insper.al.grupo_8.projeto_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import br.edu.insper.al.grupo_8.projeto_2.methods.MethodIActivity;
import br.edu.insper.al.grupo_8.projeto_2.methods.MethodPaciente;

public class HomeActivity extends AppCompatActivity {

    private void startMethodsActivity() {
        Intent intent = new Intent(this, MethodsActivity.class);
        startActivity(intent);
    }

    private void startMethodPaciente() {
        Intent intent = new Intent(this, MethodPaciente.class);
        startActivity(intent);
    }

    private void logOutMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button buttonGoMethods = findViewById(R.id.button_goMethods);
        Button singOut = findViewById(R.id.singOut);

        singOut.setOnClickListener(v -> {
            FirebaseAuth.getInstance().signOut();
            logOutMainActivity();
        });

        buttonGoMethods.setOnClickListener((view -> startMethodsActivity()));

        Button buttonGoEvaluation = findViewById(R.id.button_goEvaluation);
        buttonGoEvaluation.setOnClickListener((view -> startMethodPaciente()));
    }

}
