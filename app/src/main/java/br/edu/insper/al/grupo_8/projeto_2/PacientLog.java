package br.edu.insper.al.grupo_8.projeto_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class PacientLog extends AppCompatActivity {


    private void startMethodActivity(Class classe) {
        Intent intent = new Intent(this, classe);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pacient_log);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference pacientesReference = database.getReference("Pacientes");

        Button buttonGoHome = findViewById(R.id.button_goPacientLog);
        buttonGoHome.setOnClickListener((view) -> startMethodActivity(HomeActivity.class));

        TextView getPacient = findViewById(R.id.nome_paciente);

        Bundle extras = getIntent().getExtras();
        String rh = extras.getString("rh");

        Button buttonGoActualPacientActivity = findViewById(R.id.button3);
        buttonGoActualPacientActivity.setOnClickListener((view) -> {
            Intent intent = new Intent(PacientLog.this, MethodsActivity.class);
            intent.putExtra("rh", rh);
            startActivity(intent);
        });


        getPacient.setText("PACIENTE "+ rh);
    }

}

