package br.edu.insper.al.grupo_8.projeto_2;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

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
        TextView rh_text = findViewById(R.id.rh);
        Bundle extras = getIntent().getExtras();
        assert extras != null;
        rh = extras.getString("rh");
        rh_text.setText(rh);

        Button buttonGoLog = findViewById(R.id.button_goLog);
        buttonGoLog.setOnClickListener((view) -> startMethodActivity(PacientLog.class));
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference("Pacientes");
        DatabaseReference rhRef = ref.child(rh);

//      PARTE REFERENTE A ADIÇÃO DE NOVAS INFORMAÇÕES AOS RESULTADOS

        rhRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                TextView nome = findViewById(R.id.nome_txt);
                TextView data = findViewById(R.id.data);
                TextView idade = findViewById(R.id.idade);
                TextView sexo = findViewById(R.id.sexo);
                TextView diagnostico = findViewById(R.id.diagnostico);
                TextView pele = findViewById(R.id.pele);
                TextView estadoCivil = findViewById(R.id.estado_civil);
                TextView escolaridade = findViewById(R.id.escolaridade);
                TextView ocupacao = findViewById(R.id.ocupacao);
//               TextView resultTeste_I = findViewById(R.id.resultTeste_I);
//               TextView resultTeste_II = findViewById(R.id.resultTeste_II);
//               TextView resultTeste_III = findViewById(R.id.resultTeste_III);
//               TextView resultTeste_IV = findViewById(R.id.resultTeste_IV);
//               TextView resultTeste_V = findViewById(R.id.resultTeste_V);
//               TextView resultTeste_VIII = findViewById(R.id.resultTeste_VII);
//               TextView resultTeste_IX = findViewById(R.id.resultTeste_IX);
//               TextView resultTeste_X = findViewById(R.id.resultTeste_X);
                Paciente pac = new Paciente();

                pac.setNome(dataSnapshot.child("Info").child("nome").getValue(String.class));
                pac.setData_internacao(dataSnapshot.child("Info").child("data").getValue(String.class));
                pac.setIdade(dataSnapshot.child("Info").child("idade").getValue(String.class));
                pac.setSexo(dataSnapshot.child("Info").child("sexo").getValue(String.class));
                pac.setDiagnostico(dataSnapshot.child("Info").child("diagnostico").getValue(String.class));
                pac.setCor(dataSnapshot.child("Info").child("cor").getValue(String.class));
                pac.setEstado_civil(dataSnapshot.child("Info").child("estado civil").getValue(String.class));
                pac.setEscolaridade(dataSnapshot.child("Info").child("escolaridade").getValue(String.class));
                pac.setOcupacao(dataSnapshot.child("Info").child("ocupacao").getValue(String.class));
//               pac.setT01(ds.child("Info").getValue(Paciente.class).getT01());
//               pac.setT02(ds.child("Info").getValue(Paciente.class).getT02());
//               pac.setT03(ds.child("Info").getValue(Paciente.class).getT03());
//               pac.setT04(ds.child("Info").getValue(Paciente.class).getT04());
//               pac.setT05(ds.child("Info").getValue(Paciente.class).getT05());
//               pac.setT08(ds.child("Info").getValue(Paciente.class).getT08());
//               pac.setT09(ds.child("Info").getValue(Paciente.class).getT09());
//               pac.setT10(ds.child("Info").getValue(Paciente.class).getT10());

                nome.setText(pac.getNome());
                data.setText(pac.getData_internacao());
                idade.setText(pac.getIdade());
                sexo.setText(pac.getSexo());
                diagnostico.setText(pac.getDiagnostico());
                pele.setText(pac.getCor());
                estadoCivil.setText(pac.getEstado_civil());
                escolaridade.setText(pac.getEscolaridade());
                ocupacao.setText(pac.getOcupacao());
//               resultTeste_I.setText(pac.getT01());
//               resultTeste_II.setText(pac.getT01());
//               resultTeste_III.setText(pac.getT01());
//               resultTeste_IV.setText(pac.getT01());
//               resultTeste_V.setText(pac.getT01());
//               resultTeste_VIII.setText(pac.getT01());
//               resultTeste_IX.setText(pac.getT01());
//               resultTeste_X.setText(pac.getT01());
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
