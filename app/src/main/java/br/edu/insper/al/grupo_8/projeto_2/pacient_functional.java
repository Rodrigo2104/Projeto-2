package br.edu.insper.al.grupo_8.projeto_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class pacient_functional extends AppCompatActivity {
    TextView nome;

    private void startMethodActivity(Class classe) {
        Intent intent = new Intent(this, classe);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actual_pacient_funcional);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference pacientesReference = database.getReference("Pacientes");

        Button buttonGoHome = findViewById(R.id.button_goHome);
        buttonGoHome.setOnClickListener((view) -> startMethodActivity(HomeActivity.class));

        Button buttonGoActualPacientActivity = findViewById(R.id.button);
        buttonGoActualPacientActivity.setOnClickListener((view) -> startMethodActivity(ActualPacientActivity.class));

        Bundle extras = getIntent().getExtras();
        String rh = extras.getString("rh");

    }

}

