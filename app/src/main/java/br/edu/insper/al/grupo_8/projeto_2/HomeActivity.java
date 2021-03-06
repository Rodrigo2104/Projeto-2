package br.edu.insper.al.grupo_8.projeto_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.util.ArrayList;
import java.util.Objects;

public class HomeActivity extends AppCompatActivity {
    private ListView listView;

    private void startGoTo(Class classe){
        Intent intent = new Intent(this, classe);
        startActivity(intent);
    }

    private void logOutMainActivity() {
        Intent intent = new Intent(this, LogInActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button buttonGoOut = findViewById(R.id.button_goOut);
        Button add = findViewById(R.id.add_pacient);
        listView = findViewById(R.id.pacients);

        buttonGoOut.setOnClickListener(view -> logOutMainActivity());
        add.setOnClickListener(view -> startGoTo(MethodPacienteActivity.class));

//      =============== Firebase ===============
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference pacientesReference = database.getReference("Pacientes");

        pacientesReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                showData(dataSnapshot);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(HomeActivity.this, PacientLog.class);
            intent.putExtra("rh", parent.getItemAtPosition(position).toString());
            startActivity(intent);
        });
    }

    private void showData(DataSnapshot dataSnapshot) {
        ArrayList<String> listaPacientes = new ArrayList<>();
        for (DataSnapshot ds : dataSnapshot.getChildren()){
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaPacientes);

            Paciente pac = new Paciente();
            pac.setRh(Objects.requireNonNull(ds.child("Info").getValue(Paciente.class)).getRh());

            listaPacientes.add(pac.getRh());
            listView.setAdapter(arrayAdapter);
        }
    }
}
