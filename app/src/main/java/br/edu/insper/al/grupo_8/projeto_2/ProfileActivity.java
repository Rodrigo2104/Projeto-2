package br.edu.insper.al.grupo_8.projeto_2;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Button button_add = findViewById(R.id.button_add);
        TextView userNewPass = findViewById(R.id.text_password);
        TextView userNewLogin = findViewById(R.id.text_login);
        ProgressBar progress = findViewById(R.id.progressBar);
        FirebaseAuth newauth = FirebaseAuth.getInstance();

        button_add.setOnClickListener(v -> {
            progress.setVisibility(View.VISIBLE);
           newauth.createUserWithEmailAndPassword(userNewLogin.getText().toString(), userNewPass.getText().toString()).addOnCompleteListener(task -> {
               progress.setVisibility(View.GONE);
               if(task.isSuccessful()){
                   Toast.makeText(this, "Registrado com Sucesso", Toast.LENGTH_LONG).show();
                   userNewLogin.setText("");
                   userNewPass.setText("");
               } else {
                   Toast.makeText(this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
               }
           });
        });
    }
}
