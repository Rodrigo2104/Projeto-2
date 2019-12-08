package br.edu.insper.al.grupo_8.projeto_2;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.util.Calendar;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public class MethodPacienteActivity extends AppCompatActivity {
    private EditText rhIn;
    private DatePickerDialog.OnDateSetListener mDateSetListener;

    private void startGoTo(Class classe){
        Intent intent = new Intent(this, classe);
        intent.putExtra("rh", rhIn.getText().toString());
        startActivity(intent);
    }

    private void justGoTo(Class classe) {
        Intent intent = new Intent(this, classe);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_paciente);

        Button buttonTests = findViewById(R.id.button_goTests);
        Button buttonGoHome = findViewById(R.id.button_goLog);

        TextView dataIn = findViewById(R.id.data_txt);
        EditText nomeIn = findViewById(R.id.nome_txt);
        rhIn = findViewById(R.id.rh_txt);
        EditText idadeIn = findViewById(R.id.idade_txt);
        EditText diagnosticoIn = findViewById(R.id.diagnostico_txt);
        EditText altaIn = findViewById(R.id.alta_txt);
        EditText queixaIn = findViewById(R.id.queixa_txt);
        EditText paIn = findViewById(R.id.PA_txt);
        EditText pIn = findViewById(R.id.P_txt);
        EditText rIn = findViewById(R.id.R_txt);
        EditText tMaxIn = findViewById(R.id.tmax_txt);
        EditText dxIn = findViewById(R.id.DX_txt);
        EditText outrosIn = findViewById(R.id.outros_txt);
        EditText medicamentosCasaIn = findViewById(R.id.med_casa_txt);
        EditText medicamentosHospitalIn = findViewById(R.id.med_hosp_txt);
        EditText tratamentosAnteIn = findViewById(R.id.trat_txt);
        EditText exameFisicoIn = findViewById(R.id.fisico_txt);

        EditText qual01 = findViewById(R.id.qual01_txt);
        EditText qual02 = findViewById(R.id.qual02_txt);
        EditText qual03 = findViewById(R.id.qual03_txt);
        EditText qual04 = findViewById(R.id.qual04_txt);
        EditText qual05 = findViewById(R.id.qual05_txt);
        EditText qual06 = findViewById(R.id.qual06_txt);


        RadioGroup sexoIn = findViewById(R.id.radioS);
        RadioGroup corIn = findViewById(R.id.radioC);
        RadioGroup estCivIn = findViewById(R.id.radioEC);
        RadioGroup escolaridadeIn = findViewById(R.id.radioGroup0);
        RadioGroup ocupacaoIn = findViewById(R.id.radioGroup1);
        RadioGroup provedorIn = findViewById(R.id.radioProv);
        RadioGroup rendaIdosoIn = findViewById(R.id.radioRenIdo);
        RadioGroup rendaFamiliaIn = findViewById(R.id.radioRenFam);
        RadioGroup nPessoaIn = findViewById(R.id.radionPessoa);
        RadioGroup religiaoIn = findViewById(R.id.radioRel);
        RadioGroup habitosIn = findViewById(R.id.radioHab);
        RadioGroup procedenciaIn = findViewById(R.id.radioProc);
        RadioGroup antiCoagIn = findViewById(R.id.radioCoag);
        RadioGroup dorIn = findViewById(R.id.radioDor);
        RadioGroup conscienciaIn = findViewById(R.id.radioGroup4);
        RadioGroup a6 = findViewById(R.id.radioGroup6);
        RadioGroup a7 = findViewById(R.id.radioGroup7);
        RadioGroup a8 = findViewById(R.id.radioGroup8);
        RadioGroup a9 = findViewById(R.id.radioGroup9);
        RadioGroup a10 = findViewById(R.id.radioGroup10);
        RadioGroup a11 = findViewById(R.id.radioGroup11);

        CheckBox CB1 = findViewById(R.id.checkBox1a);
        CheckBox CB2 = findViewById(R.id.checkBox2a);
        CheckBox CB3 = findViewById(R.id.checkBox3a);
        CheckBox CB4 = findViewById(R.id.checkBox4a);
        CheckBox CB5 = findViewById(R.id.checkBox5a);
        CheckBox CB6 = findViewById(R.id.checkBox6a);
        CheckBox CB7 = findViewById(R.id.checkBox7a);
        CheckBox CB8 = findViewById(R.id.checkBox8a);
        CheckBox CB9 = findViewById(R.id.checkBox9a);
        CheckBox CB10 = findViewById(R.id.checkBox10a);

        AtomicReference<String> anteChecks = new AtomicReference<>("");

//      =============================== Calendário ===============================
        dataIn.setOnClickListener(v -> {
            Calendar cal = Calendar.getInstance();
            int dia = cal.get(Calendar.DAY_OF_MONTH);
            int mes = cal.get(Calendar.MONTH);
            int ano = cal.get(Calendar.YEAR);

            DatePickerDialog dialog = new DatePickerDialog(
                    this,
                    android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                    mDateSetListener,
                    ano, mes, dia);

            Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawable((new ColorDrawable(Color.TRANSPARENT)));
            dialog.show();
        });

        mDateSetListener = (view, year, month, dayOfMonth) -> {
            month = month + 1;
            String data = dayOfMonth + "/" + month + "/" + year;
            dataIn.setText(data);
        };

//      ============================== Programação ==============================
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("Pacientes");

        buttonGoHome.setOnClickListener((view) -> justGoTo(HomeActivity.class));
        buttonTests.setOnClickListener(v -> {
//      ============================== Firebase ==============================
            if (rhIn.getText().toString().isEmpty() || nomeIn.getText().toString().isEmpty() ||
                    dataIn.getText().toString().isEmpty() || idadeIn.getText().toString().isEmpty() ||
                    sexoIn.getCheckedRadioButtonId() == -1 || diagnosticoIn.getText().toString().isEmpty() ||
                    corIn.getCheckedRadioButtonId() == -1 || estCivIn.getCheckedRadioButtonId() == -1 ||
                    escolaridadeIn.getCheckedRadioButtonId() == -1 || ocupacaoIn.getCheckedRadioButtonId() == -1 ||
                    provedorIn.getCheckedRadioButtonId() == -1 || rendaIdosoIn.getCheckedRadioButtonId() == -1 ||
                    rendaFamiliaIn.getCheckedRadioButtonId() == -1 || nPessoaIn.getCheckedRadioButtonId() == -1 ||
                    religiaoIn.getCheckedRadioButtonId() == -1 || habitosIn.getCheckedRadioButtonId() == -1 ||
                    altaIn.getText().toString().isEmpty() || procedenciaIn.getCheckedRadioButtonId() == -1 ||
                    queixaIn.getText().toString().isEmpty() || paIn.getText().toString().isEmpty() ||
                    pIn.getText().toString().isEmpty() || rIn.getText().toString().isEmpty() ||
                    tMaxIn.getText().toString().isEmpty() || dxIn.getText().toString().isEmpty() ||
                    outrosIn.getText().toString().isEmpty() || medicamentosCasaIn.getText().toString().isEmpty() ||
                    medicamentosHospitalIn.getText().toString().isEmpty() || antiCoagIn.getCheckedRadioButtonId() == -1 ||
                    dorIn.getCheckedRadioButtonId() == -1 || tratamentosAnteIn.getText().toString().isEmpty() ||
                    exameFisicoIn.getText().toString().isEmpty() || conscienciaIn.getCheckedRadioButtonId() == -1 ||
                    (!CB1.isChecked() && !CB2.isChecked() && !CB3.isChecked() && !CB4.isChecked() &&
                            !CB5.isChecked() && !CB6.isChecked() && !CB7.isChecked() &&
                            !CB8.isChecked() && !CB9.isChecked() && !CB10.isChecked()) ||
                    a6.getCheckedRadioButtonId() == -1 || a7.getCheckedRadioButtonId() == -1 ||
                    a8.getCheckedRadioButtonId() == -1 || a9.getCheckedRadioButtonId() == -1 ||
                    a10.getCheckedRadioButtonId() == -1 || a11.getCheckedRadioButtonId() == -1){

                Toast.makeText(getApplicationContext(), "Faltam Dados", Toast.LENGTH_SHORT).show();
            }
            else {
                int sexId = sexoIn.getCheckedRadioButtonId();
                RadioButton sexSelected = findViewById(sexId);
                int corId = corIn.getCheckedRadioButtonId();
                RadioButton corSelected = findViewById(corId);
                int estCivId = estCivIn.getCheckedRadioButtonId();
                RadioButton estCivSelected = findViewById(estCivId);
                int escolaridadeId = escolaridadeIn.getCheckedRadioButtonId();
                RadioButton escolaridadeSelected = findViewById(escolaridadeId);
                int ocupacaoId = ocupacaoIn.getCheckedRadioButtonId();
                RadioButton ocupacaoSelected = findViewById(ocupacaoId);
                int provedorId = provedorIn.getCheckedRadioButtonId();
                RadioButton provedorSelected = findViewById(provedorId);
                int rendaIdosoId = rendaIdosoIn.getCheckedRadioButtonId();
                RadioButton rendaIdosoSelected = findViewById(rendaIdosoId);
                int rendaFamiliaId = rendaFamiliaIn.getCheckedRadioButtonId();
                RadioButton rendaFamiliaSelected = findViewById(rendaFamiliaId);
                int nPessoaId = nPessoaIn.getCheckedRadioButtonId();
                RadioButton nPessoaSelected = findViewById(nPessoaId);
                int religiaoId = religiaoIn.getCheckedRadioButtonId();
                RadioButton religiaoSelected = findViewById(religiaoId);
                int habitosId = habitosIn.getCheckedRadioButtonId();
                RadioButton habitosSelected = findViewById(habitosId);
                int procedenciaId = procedenciaIn.getCheckedRadioButtonId();
                RadioButton procedenciaSelected = findViewById(procedenciaId);
                int antiCoagId = antiCoagIn.getCheckedRadioButtonId();
                RadioButton antiCoagSelected = findViewById(antiCoagId);
                int dorId = dorIn.getCheckedRadioButtonId();
                RadioButton dorSelected = findViewById(dorId);
                int conscienciaId = conscienciaIn.getCheckedRadioButtonId();
                RadioButton conscienciaSelected = findViewById(conscienciaId);

                ref.child(rhIn.getText().toString()).child("Info").child("nome").setValue(nomeIn.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("rh").setValue(rhIn.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("data").setValue(dataIn.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("idade").setValue(idadeIn.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("sexo").setValue(sexSelected.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("diagnostico").setValue(diagnosticoIn.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("cor").setValue(corSelected.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("estado civil").setValue(estCivSelected.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("escolaridade").setValue(escolaridadeSelected.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("ocupacao").setValue(ocupacaoSelected.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("provedor da casa").setValue(provedorSelected.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("renda idoso").setValue(rendaIdosoSelected.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("renda familia").setValue(rendaFamiliaSelected.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("numero pessoas dependentes").setValue(nPessoaSelected.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("religiao").setValue(religiaoSelected.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("habitos").setValue(habitosSelected.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("alta").setValue(altaIn.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("procedencia").setValue(procedenciaSelected.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("queixa").setValue(queixaIn.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("pa").setValue(paIn.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("p").setValue(pIn.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("r").setValue(rIn.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("tmax").setValue(tMaxIn.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("dx").setValue(dxIn.getText().toString());

                ref.child(rhIn.getText().toString()).child("Info").child("outros").setValue(outrosIn.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("medicamento casa").setValue(medicamentosCasaIn.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("medicamento hospital").setValue(medicamentosHospitalIn.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("anti coagulacao").setValue(antiCoagSelected.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("dor").setValue(dorSelected.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("tratamentos anteriores").setValue(tratamentosAnteIn.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("exame fisico").setValue(exameFisicoIn.getText().toString());
                ref.child(rhIn.getText().toString()).child("Info").child("consciencia").setValue(conscienciaSelected.getText().toString());


                if (CB1.isChecked()){
                    anteChecks.set(anteChecks + CB1.getText().toString() + ", ");
                } if (CB2.isChecked()){
                    anteChecks.set(anteChecks + CB2.getText().toString() + ", ");
                } if (CB3.isChecked()){
                    anteChecks.set(anteChecks + CB3.getText().toString() + ", ");
                } if (CB4.isChecked()){
                    anteChecks.set(anteChecks + CB4.getText().toString() + ", ");
                } if (CB5.isChecked()){
                    anteChecks.set(anteChecks + CB5.getText().toString() + ", ");
                } if (CB6.isChecked()){
                    anteChecks.set(anteChecks + CB6.getText().toString() + ", ");
                } if (CB7.isChecked()){
                    anteChecks.set(anteChecks + CB7.getText().toString() + ", ");
                } if (CB8.isChecked()){
                    anteChecks.set(anteChecks + CB8.getText().toString() + ", ");
                } if (CB9.isChecked()){
                    anteChecks.set(anteChecks + CB9.getText().toString() + ", ");
                } if (CB10.isChecked()){
                    anteChecks.set(anteChecks + CB10.getText().toString() + ", ");
                }
                String x = anteChecks.get();
                anteChecks.set(x.substring(0, anteChecks.get().length() - 2));
                ref.child(rhIn.getText().toString()).child("Info").child("antecedentes").setValue(anteChecks.get());

                int a6Id = a6.getCheckedRadioButtonId();
                RadioButton a6Selected = findViewById(a6Id);
                int a7Id = a7.getCheckedRadioButtonId();
                RadioButton a7Selected = findViewById(a7Id);
                int a8Id = a8.getCheckedRadioButtonId();
                RadioButton a8Selected = findViewById(a8Id);
                int a9Id = a9.getCheckedRadioButtonId();
                RadioButton a9Selected = findViewById(a9Id);
                int a10Id = a10.getCheckedRadioButtonId();
                RadioButton a10Selected = findViewById(a10Id);
                int a11Id = a11.getCheckedRadioButtonId();
                RadioButton a11Selected = findViewById(a11Id);

                if (a6Selected.getText().toString().equals("Sem alterações")){
                    ref.child(rhIn.getText().toString()).child("Info").child("avaliacao pulmonar").setValue("Nenhuma Alteração");
                } else{
                    ref.child(rhIn.getText().toString()).child("Info").child("avaliacao pulmonar").setValue(qual01.getText().toString());
                }
                if (a7Selected.getText().toString().equals("Sem alterações")){
                    ref.child(rhIn.getText().toString()).child("Info").child("avaliacao cardio").setValue("Nenhuma Alteração");
                } else{
                    ref.child(rhIn.getText().toString()).child("Info").child("avaliacao cardio").setValue(qual02.getText().toString());
                }
                if (a8Selected.getText().toString().equals("Sem alterações")){
                    ref.child(rhIn.getText().toString()).child("Info").child("avaliacao gastro").setValue("Nenhuma Alteração");
                } else{
                    ref.child(rhIn.getText().toString()).child("Info").child("avaliacao gastro").setValue(qual03.getText().toString());
                }
                if (a9Selected.getText().toString().equals("Sem alterações")){
                    ref.child(rhIn.getText().toString()).child("Info").child("avaliacao genitu").setValue("Nenhuma Alteração");
                } else{
                    ref.child(rhIn.getText().toString()).child("Info").child("avaliacao genitu").setValue(qual04.getText().toString());
                }
                if (a10Selected.getText().toString().equals("Sem alterações")){
                    ref.child(rhIn.getText().toString()).child("Info").child("extremidades").setValue("Nenhuma Alteração");
                } else{
                    ref.child(rhIn.getText().toString()).child("Info").child("extremidades").setValue(qual05.getText().toString());
                }
                if (a11Selected.getText().toString().equals("Sem alterações")){
                    ref.child(rhIn.getText().toString()).child("Info").child("pea").setValue("Nenhuma Alteração");
                } else{
                    ref.child(rhIn.getText().toString()).child("Info").child("pea").setValue(qual06.getText().toString());
                }

                startGoTo(PacientLog.class);
            }
        });
    }
}
