package br.edu.insper.al.grupo_8.projeto_2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseUser;

import java.util.Objects;


public class MainActivity extends AppCompatActivity {

    private void startHomeActivity() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    private void startProfileActivity() {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_login = findViewById(R.id.button_login);
        Button button_new_profile = findViewById(R.id.button_add);
        TextView userPass = findViewById(R.id.text_password);
        TextView userLogin = findViewById(R.id.text_login);
        ProgressBar progress = findViewById(R.id.progressBar);
        FirebaseAuth authentication = FirebaseAuth.getInstance();

        button_new_profile.setOnClickListener((view -> startProfileActivity()));

        button_login.setOnClickListener(v -> {
            progress.setVisibility(View.VISIBLE);
            if(!userPass.getText().toString().isEmpty() && !userLogin.getText().toString().isEmpty()) {
                authentication.signInWithEmailAndPassword(userLogin.getText().toString(), userPass.getText().toString()).addOnCompleteListener(task -> {
                    progress.setVisibility(View.GONE);
                    if (task.isSuccessful()) {
                        startHomeActivity();
                    } else {
                        Toast.makeText(MainActivity.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
                    }
                });
            } else if(userPass.getText().toString().isEmpty() && userLogin.getText().toString().isEmpty()){
                Toast.makeText(MainActivity.this, "Authentication login and password fields are empty", Toast.LENGTH_LONG).show();
                progress.setVisibility(View.GONE);
            } else if(userPass.getText().toString().isEmpty()){
                Toast.makeText(MainActivity.this, "Authentication password field is empty", Toast.LENGTH_LONG).show();
                progress.setVisibility(View.GONE);
            } else if(userLogin.getText().toString().isEmpty()){
                Toast.makeText(MainActivity.this, "Authentication login field is empty", Toast.LENGTH_LONG).show();
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
