package br.edu.insper.al.grupo_8.projeto_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Objects;

public class LogInActivity extends AppCompatActivity {

    private void goActivity(Class classe) {
        Intent intent = new Intent(this, classe);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        Button button_login = findViewById(R.id.button_login);
        Button button_new_profile = findViewById(R.id.button_add);
        TextView userPass = findViewById(R.id.text_password);
        TextView userLogin = findViewById(R.id.text_login);
        ProgressBar progress = findViewById(R.id.progressBar);
        FirebaseAuth authentication = FirebaseAuth.getInstance();

        button_new_profile.setOnClickListener((view -> goActivity(ProfileActivity.class)));

        button_login.setOnClickListener(v -> {
            progress.setVisibility(View.VISIBLE);
            if(!userPass.getText().toString().isEmpty() && !userLogin.getText().toString().isEmpty()) {
                authentication.signInWithEmailAndPassword(userLogin.getText().toString(), userPass.getText().toString()).addOnCompleteListener(task -> {
                    progress.setVisibility(View.GONE);
                    if (task.isSuccessful()) {
                        goActivity(HomeActivity.class);
                    } else {
                        Toast.makeText(LogInActivity.this, Objects.requireNonNull(task.getException()).getMessage(), Toast.LENGTH_LONG).show();
                    }
                });
            } else if(userPass.getText().toString().isEmpty() && userLogin.getText().toString().isEmpty()){
                Toast.makeText(LogInActivity.this, "Authentication login and password fields are empty", Toast.LENGTH_LONG).show();
                progress.setVisibility(View.GONE);
            } else if(userPass.getText().toString().isEmpty()){
                Toast.makeText(LogInActivity.this, "Authentication password field is empty", Toast.LENGTH_LONG).show();
                progress.setVisibility(View.GONE);
            } else if(userLogin.getText().toString().isEmpty()){
                Toast.makeText(LogInActivity.this, "Authentication login field is empty", Toast.LENGTH_LONG).show();
                progress.setVisibility(View.GONE);
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
