package br.edu.insper.al.grupo_8.projeto_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class PacientLog extends AppCompatActivity {
    private String rh;

    private void startGoTo(Class classe) {
        Intent intent = new Intent(this, classe);
        startActivity(intent);
    }

    private void startGoToIntent(Class classe) {
        Intent intent = new Intent(this, classe);
        intent.putExtra("rh", rh);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pacient_log);

        TextView nome = findViewById(R.id.nome);
        Button buttonGoHome = findViewById(R.id.button_goLog);
        Button buttonGoActualPacient = findViewById(R.id.button_results);
        Button buttonGoTests = findViewById(R.id.button_tests);
        Button buttonDelete = findViewById(R.id.button_delete);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference pacientesReference = database.getReference("Pacientes");
        buttonDelete.setOnClickListener(v -> {
            pacientesReference.child(rh).removeValue();
            startGoTo(HomeActivity.class);
        });

        Bundle extras = getIntent().getExtras();
        assert extras != null;
        rh = extras.getString("rh");
        nome.setText("Paciente Rh: "+rh);

        buttonGoHome.setOnClickListener((view) -> startGoTo(HomeActivity.class));
        buttonGoTests.setOnClickListener((view) -> startGoToIntent(TestsActivity.class));
        buttonGoActualPacient.setOnClickListener((view) -> startGoToIntent(ResultsActivity.class));
    }
}

