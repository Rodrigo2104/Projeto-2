package br.edu.insper.al.grupo_8.projeto_2;

import android.app.DownloadManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Objects;


import br.edu.insper.al.grupo_8.projeto_2.methods.MethodIActivity;
import br.edu.insper.al.grupo_8.projeto_2.methods.MethodPaciente;

public class HomeActivity extends AppCompatActivity {

    private ListView listView;

    private void startAddActivity() {
        Intent intent = new Intent(this, AddActivity.class);
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


        Button add = findViewById(R.id.add_pacient);
        add.setOnClickListener((view -> startAddActivity()));

//      =============== Firebase ===============
        listView = findViewById(R.id.pacients);

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


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(HomeActivity.this, ActualPacientActivity.class);
                intent.putExtra("rh", parent.getItemAtPosition(position).toString());
                startActivity(intent);
            }
        });
    }

    private void showData(DataSnapshot dataSnapshot) {
        ArrayList<String> listaPacientes = new ArrayList<>();
        for (DataSnapshot ds : dataSnapshot.getChildren()){
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaPacientes);

            Paciente pac = new Paciente();
            pac.setNome(ds.child("Info").getValue(Paciente.class).getNome());
            pac.setRh(ds.child("Info").getValue(Paciente.class).getRh());
            pac.setData_internacao(ds.child("Info").getValue(Paciente.class).getData_internacao());

            listaPacientes.add(pac.getRh());
            listView.setAdapter(arrayAdapter);

        }
    }
}
