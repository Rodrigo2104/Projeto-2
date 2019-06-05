package br.edu.insper.al.grupo_8.projeto_2;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ActualPacientActivity extends AppCompatActivity {
    TextView nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actual_pacient);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference pacientesReference = database.getReference("Pacientes");

        TextView rh_text = findViewById(R.id.rh);

        Bundle extras = getIntent().getExtras();
        String rh = extras.getString("rh");
        rh_text.setText(rh);

        pacientesReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                showData(dataSnapshot);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    private void showData(DataSnapshot dataSnapshot) {

        for (DataSnapshot ds : dataSnapshot.getChildren()){
            TextView nome = findViewById(R.id.nome_txt);
            Paciente pac = new Paciente();
            pac.setNome(ds.child("Info").getValue(Paciente.class).getNome());
            pac.setRh(ds.child("Info").getValue(Paciente.class).getRh());
            pac.setData_internacao(ds.child("Info").getValue(Paciente.class).getData_internacao());

            nome.setText(pac.getNome());

        }
    }

}
