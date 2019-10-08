package br.edu.insper.al.grupo_8.projeto_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ResultsActivity extends AppCompatActivity {
    private String rh;

    private void startMethodActivity(Class classe) {
        Intent intent = new Intent(this, classe);
        intent.putExtra("rh", rh);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        Button buttonGoLog = findViewById(R.id.button_goLog);
        TextView rh_text = findViewById(R.id.rh);

        buttonGoLog.setOnClickListener((view) -> startMethodActivity(PacientLog.class));
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference pacientesReference = database.getReference("Pacientes");

        Bundle extras = getIntent().getExtras();
        assert extras != null;
        rh = extras.getString("rh");
        rh_text.setText(rh);

//        PARTE REFERENTE A ADIÇÃO DE NOVAS INFORMAÇÕES AOS RESULTADOS

//        pacientesReference.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                for (DataSnapshot ds : dataSnapshot.getChildren()){
//                    TextView nome = findViewById(R.id.nome_txt);
//                    TextView data = findViewById(R.id.data);
//                    TextView idade = findViewById(R.id.idade);
//                    TextView sexo = findViewById(R.id.sexo);
//                    TextView resultTeste_I = findViewById(R.id.resultTeste_I);
//                    TextView resultTeste_II = findViewById(R.id.resultTeste_II);
//                    TextView resultTeste_III = findViewById(R.id.resultTeste_III);
//                    TextView resultTeste_IV = findViewById(R.id.resultTeste_IV);
//                    TextView resultTeste_V = findViewById(R.id.resultTeste_V);
//                    TextView resultTeste_VIII = findViewById(R.id.resultTeste_VII);
//                    TextView resultTeste_IX = findViewById(R.id.resultTeste_IX);
//                    TextView resultTeste_X = findViewById(R.id.resultTeste_X);
//                    Paciente pac = new Paciente();
//
//                    pac.setNome(ds.child("Info").getValue(Paciente.class).getNome());
//                    pac.setRh(ds.child("Info").getValue(Paciente.class).getRh());
//                    pac.setData_internacao(ds.child("Info").getValue(Paciente.class).getData_internacao());
//                    pac.setIdade(ds.child("Info").getValue(Paciente.class).getIdade());
//                    pac.setSexo(ds.child("Info").getValue(Paciente.class).getSexo());
//                    pac.setT01(ds.child("Info").getValue(Paciente.class).getT01());
//                    pac.setT02(ds.child("Info").getValue(Paciente.class).getT02());
//                    pac.setT03(ds.child("Info").getValue(Paciente.class).getT03());
//                    pac.setT04(ds.child("Info").getValue(Paciente.class).getT04());
//                    pac.setT05(ds.child("Info").getValue(Paciente.class).getT05());
//                    pac.setT08(ds.child("Info").getValue(Paciente.class).getT08());
//                    pac.setT09(ds.child("Info").getValue(Paciente.class).getT09());
//                    pac.setT10(ds.child("Info").getValue(Paciente.class).getT10());
//
//                    idade.setText(pac.getIdade());
//                    nome.setText(pac.getNome());
//                    data.setText(pac.getData_internacao());
//                    sexo.setText(pac.getSexo());
//                    resultTeste_I.setText(pac.getT01());
//                    resultTeste_II.setText(pac.getT01());
//                    resultTeste_III.setText(pac.getT01());
//                    resultTeste_IV.setText(pac.getT01());
//                    resultTeste_V.setText(pac.getT01());
//                    resultTeste_VIII.setText(pac.getT01());
//                    resultTeste_IX.setText(pac.getT01());
//                    resultTeste_X.setText(pac.getT01());
//                }
//            }
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });
    }
}
