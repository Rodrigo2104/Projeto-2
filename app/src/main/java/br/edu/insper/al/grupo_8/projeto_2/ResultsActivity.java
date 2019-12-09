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

        Button buttonGoLog = findViewById(R.id.button_goBack);
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
                TextView provedor = findViewById(R.id.provedor);
                TextView renda_idoso = findViewById(R.id.renda_idoso);
                TextView renda_familiar = findViewById(R.id.renda_familiar);
                TextView nPessoas = findViewById(R.id.nPessoas);
                TextView religiao = findViewById(R.id.religiao);
                TextView habitos = findViewById(R.id.habitos);
                TextView alta = findViewById(R.id.alta);
                TextView procedencia = findViewById(R.id.procedencia);
                TextView queixa = findViewById(R.id.queixa);
                TextView pa = findViewById(R.id.pa);
                TextView p = findViewById(R.id.p);
                TextView r = findViewById(R.id.r);
                TextView tmax = findViewById(R.id.tmax);
                TextView dx = findViewById(R.id.dx);
                TextView antecedentes = findViewById(R.id.antecedentes);
                TextView outros = findViewById(R.id.outros);
                TextView medicamentos_casa = findViewById(R.id.medicamentos_casa);
                TextView medicamentos_hospital = findViewById(R.id.medicamentos_hospital);
                TextView anti_coagulacao = findViewById(R.id.anti_coagulacao);
                TextView dor = findViewById(R.id.dor);
                TextView tratamentos_anteriores = findViewById(R.id.tratamentos_anteriores);
                TextView exame_fisico = findViewById(R.id.exame_fisico);
                TextView consciencia = findViewById(R.id.consciencia);
                TextView pulmonar = findViewById(R.id.pulmonar);
                TextView cardiovascular = findViewById(R.id.cardiovascular);
                TextView gastrointestinal = findViewById(R.id.gastrointestinal);
                TextView geniturinario = findViewById(R.id.geniturinario);
                TextView extremidades = findViewById(R.id.extremidades);
                TextView pea = findViewById(R.id.pea);

                TextView t01 = findViewById(R.id.t01);
                TextView t02 = findViewById(R.id.t02);
                TextView t03 = findViewById(R.id.t03);
                TextView t04 = findViewById(R.id.t04);
                TextView t05 = findViewById(R.id.t05);
                TextView t07 = findViewById(R.id.t07);
                TextView t08 = findViewById(R.id.t08);
                TextView t09 = findViewById(R.id.t09);
                TextView t10 = findViewById(R.id.t10);
                TextView t11 = findViewById(R.id.t11);
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
                pac.setProvedor(dataSnapshot.child("Info").child("provedor da casa").getValue(String.class));
                pac.setRenda_idoso(dataSnapshot.child("Info").child("renda idoso").getValue(String.class));
                pac.setRenda_familiar(dataSnapshot.child("Info").child("renda familia").getValue(String.class));
                pac.setnPessoas(dataSnapshot.child("Info").child("numero pessoas dependentes").getValue(String.class));
                pac.setReligiao(dataSnapshot.child("Info").child("religiao").getValue(String.class));
                pac.setHabitos(dataSnapshot.child("Info").child("habitos").getValue(String.class));
                pac.setAlta(dataSnapshot.child("Info").child("alta").getValue(String.class));
                pac.setProcedencia(dataSnapshot.child("Info").child("procedencia").getValue(String.class));
                pac.setQueixa(dataSnapshot.child("Info").child("queixa").getValue(String.class));
                pac.setPa(dataSnapshot.child("Info").child("pa").getValue(String.class));
                pac.setP(dataSnapshot.child("Info").child("p").getValue(String.class));
                pac.setR(dataSnapshot.child("Info").child("r").getValue(String.class));
                pac.setTmax(dataSnapshot.child("Info").child("tmax").getValue(String.class));
                pac.setDx(dataSnapshot.child("Info").child("dx").getValue(String.class));
                pac.setOutros(dataSnapshot.child("Info").child("outros").getValue(String.class));
                pac.setMedicamentos_casa(dataSnapshot.child("Info").child("medicamento casa").getValue(String.class));
                pac.setMedicamentos_hospital(dataSnapshot.child("Info").child("medicamento hospital").getValue(String.class));
                pac.setAnti_coagulacao(dataSnapshot.child("Info").child("anti coagulacao").getValue(String.class));
                pac.setDor(dataSnapshot.child("Info").child("dor").getValue(String.class));
                pac.setTratamentos_anteriores(dataSnapshot.child("Info").child("tratamentos anteriores").getValue(String.class));
                pac.setExame_fisico(dataSnapshot.child("Info").child("exame fisico").getValue(String.class));
                pac.setAntecedentes(dataSnapshot.child("Info").child("antecedentes").getValue(String.class));
                pac.setConsciencia(dataSnapshot.child("Info").child("consciencia").getValue(String.class));
                pac.setPulmonar(dataSnapshot.child("Info").child("avaliacao pulmonar").getValue(String.class));
                pac.setCardiovascular(dataSnapshot.child("Info").child("avaliacao cardio").getValue(String.class));
                pac.setGastrointestinal(dataSnapshot.child("Info").child("avaliacao gastro").getValue(String.class));
                pac.setGeniturinario(dataSnapshot.child("Info").child("avaliacao genitu").getValue(String.class));
                pac.setExtremidades(dataSnapshot.child("Info").child("extremidades").getValue(String.class));
                pac.setPea(dataSnapshot.child("Info").child("pea").getValue(String.class));

                pac.setT01(dataSnapshot.child("Testes").child("t01").getValue(String.class));
                pac.setT02(dataSnapshot.child("Testes").child("t02").getValue(String.class));
                pac.setT03(dataSnapshot.child("Testes").child("t03").getValue(String.class));
                pac.setT04(dataSnapshot.child("Testes").child("t04").getValue(String.class));
                pac.setT05(dataSnapshot.child("Testes").child("t05").getValue(String.class));
                pac.setT07(dataSnapshot.child("Testes").child("t07").getValue(String.class));
                pac.setT08(dataSnapshot.child("Testes").child("t08").getValue(String.class));
                pac.setT09(dataSnapshot.child("Testes").child("t09").getValue(String.class));
                pac.setT10(dataSnapshot.child("Testes").child("t10").getValue(String.class));
                pac.setT11(dataSnapshot.child("Testes").child("t11").getValue(String.class));

                nome.setText(pac.getNome());
                data.setText(pac.getData_internacao());
                idade.setText(pac.getIdade());
                sexo.setText(pac.getSexo());
                diagnostico.setText(pac.getDiagnostico());
                pele.setText(pac.getCor());
                estadoCivil.setText(pac.getEstado_civil());
                escolaridade.setText(pac.getEscolaridade());
                ocupacao.setText(pac.getOcupacao());
                provedor.setText(pac.getProvedor());
                renda_idoso.setText(pac.getRenda_idoso());
                renda_familiar.setText(pac.getRenda_familiar());
                nPessoas.setText(pac.getnPessoas());
                religiao.setText(pac.getReligiao());
                habitos.setText(pac.getHabitos());
                alta.setText(pac.getAlta());
                procedencia.setText(pac.getProcedencia());
                queixa.setText(pac.getQueixa());
                pa.setText(pac.getPa());
                p.setText(pac.getP());
                r.setText(pac.getR());
                tmax.setText(pac.getTmax());
                dx.setText(pac.getDx());
                outros.setText(pac.getOutros());
                medicamentos_casa.setText(pac.getMedicamentos_casa());
                medicamentos_hospital.setText(pac.getMedicamentos_hospital());
                anti_coagulacao.setText(pac.getAnti_coagulacao());
                dor.setText(pac.getDor());
                tratamentos_anteriores.setText(pac.getTratamentos_anteriores());
                exame_fisico.setText(pac.getExame_fisico());
                antecedentes.setText(pac.getAntecedentes());
                consciencia.setText(pac.getConsciencia());
                pulmonar.setText(pac.getPulmonar());
                cardiovascular.setText(pac.getCardiovascular());
                gastrointestinal.setText(pac.getGastrointestinal());
                geniturinario.setText(pac.getGeniturinario());
                extremidades.setText(pac.getExtremidades());
                pea.setText(pac.getPea());

                t01.setText(pac.getT01());
                t02.setText(pac.getT02());
                t03.setText(pac.getT03());
                t04.setText(pac.getT04());
                t05.setText(pac.getT05());
                t07.setText(pac.getT07());
                t08.setText(pac.getT08());
                t09.setText(pac.getT09());
                t10.setText(pac.getT10());
                t11.setText(pac.getT11());
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
