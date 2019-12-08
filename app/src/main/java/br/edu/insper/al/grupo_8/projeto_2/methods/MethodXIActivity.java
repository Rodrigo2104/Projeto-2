package br.edu.insper.al.grupo_8.projeto_2.methods;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

import br.edu.insper.al.grupo_8.projeto_2.HomeActivity;
import br.edu.insper.al.grupo_8.projeto_2.R;
import br.edu.insper.al.grupo_8.projeto_2.TestsActivity;

public class MethodXIActivity extends AppCompatActivity {
    private String rh;


    private void startMethodActivity(Class classe) {
        Intent intent = new Intent(this, classe);
        intent.putExtra("rh", rh);
        startActivity(intent);
    }

    private HashMap<RadioButton, Integer> testes = new HashMap<RadioButton, Integer>();


    private HashMap<String, String> resultados = new HashMap<String, String>();

    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private RadioButton radioButton4;
    private RadioButton radioButton5;
    private RadioButton radioButton6;
    private RadioButton radioButton7;
    private RadioButton radioButton8;
    private RadioButton radioButton9;
    private RadioButton radioButton10;
    private RadioButton radioButton11;
    private RadioButton radioButton12;
    private RadioButton radioButton13;
    private RadioButton radioButton14;
    private RadioButton radioButton15;
    private RadioButton radioButton16;
    private RadioButton radioButton17;
    private RadioButton radioButton18;
    private RadioButton radioButton19;
    private RadioButton radioButton20;
    private RadioButton radioButton21;
    private RadioButton radioButton22;
    private RadioButton radioButton23;
    private RadioButton radioButton24;
    private RadioButton radioButton25;
    private RadioButton radioButton26;
    private RadioButton radioButton27;
    private RadioButton radioButton28;
    private RadioButton radioButton29;
    private RadioButton radioButton30;
    private RadioButton radioButton31;
    private RadioButton radioButton32;
    private RadioButton radioButton33;
    private RadioButton radioButton34;
    private RadioButton radioButton35;
    private RadioButton radioButton36;
    private RadioButton radioButton37;
    private RadioButton radioButton38;
    private RadioButton radioButton39;
    private RadioButton radioButton40;
    private RadioButton radioButton41;
    private RadioButton radioButton42;
    private RadioButton radioButton43;

    private RadioButton radioButton44;
    private RadioButton radioButton45;
    private RadioButton radioButton46;
    private RadioButton radioButton47;
    private RadioButton radioButton48;
    private RadioButton radioButton49;
    private RadioButton radioButton50;
    private RadioButton radioButton51;
    private RadioButton radioButton52;
    private RadioButton radioButton53;
    private RadioButton radioButton54;
    private RadioButton radioButton55;

    private RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_xi);

        Bundle extras = getIntent().getExtras();
        assert extras != null;
        rh = extras.getString("rh");

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("Pacientes");

        Button buttonGoMenu = findViewById(R.id.button_goMenu);
        buttonGoMenu.setOnClickListener((view) -> startMethodActivity(TestsActivity.class));

        Button buttonNext = findViewById(R.id.button_goMethodXII);
        buttonNext.setOnClickListener((view) -> {
            ref.child(rh).child("Testes").child("t11").setValue(resultados);
            startMethodActivity(MethodXIIActivity.class);
        });

        radioButton1 = (RadioButton) findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        radioButton4 = (RadioButton) findViewById(R.id.radioButton4);
        radioButton5 = (RadioButton) findViewById(R.id.radioButton5);
        radioButton6 = (RadioButton) findViewById(R.id.radioButton6);
        radioButton7 = (RadioButton) findViewById(R.id.radioButton7);
        radioButton8 = (RadioButton) findViewById(R.id.radioButton8);
        radioButton9 = (RadioButton) findViewById(R.id.radioButton9);
        radioButton10 = (RadioButton) findViewById(R.id.radioButton10);
        radioButton11 = (RadioButton) findViewById(R.id.radioButton11);
        radioButton12 = (RadioButton) findViewById(R.id.radioButton12);
        radioButton13 = (RadioButton) findViewById(R.id.radioButton13);
        radioButton14 = (RadioButton) findViewById(R.id.radioButton14);
        radioButton15 = (RadioButton) findViewById(R.id.radioButton15);
        radioButton17 =  (RadioButton) findViewById(R.id.radioButton17);
        radioButton18 =  (RadioButton) findViewById(R.id.radioButton18);
        radioButton19 =  (RadioButton) findViewById(R.id.radioButton19);
        radioButton20 =  (RadioButton) findViewById(R.id.radioButton20);

        radioButton21 = (RadioButton) findViewById(R.id.radioButton21);
        radioButton22 = (RadioButton) findViewById(R.id.radioButton22);
        radioButton23 =  (RadioButton) findViewById(R.id.radioButton23);
        radioButton24 =  (RadioButton) findViewById(R.id.radioButton24);
        radioButton25 =  (RadioButton) findViewById(R.id.radioButton25);
        radioButton26 =  (RadioButton) findViewById(R.id.radioButton26);
        radioButton27 =  (RadioButton) findViewById(R.id.radioButton27);
        radioButton28 =  (RadioButton) findViewById(R.id.radioButton28);
        radioButton29 =  (RadioButton) findViewById(R.id.radioButton29);
        radioButton30 =  (RadioButton) findViewById(R.id.radioButton30);
        radioButton31 =  (RadioButton) findViewById(R.id.radioButton31);
        radioButton32 =  (RadioButton) findViewById(R.id.radioButton32);
        radioButton33 =  (RadioButton) findViewById(R.id.radioButton33);
        radioButton34 =  (RadioButton) findViewById(R.id.radioButton34);
        radioButton35 =  (RadioButton) findViewById(R.id.radioButton35);
        radioButton36 =  (RadioButton) findViewById(R.id.radioButton36);
        radioButton37 =  (RadioButton) findViewById(R.id.radioButton37);
        radioButton38 =  (RadioButton) findViewById(R.id.radioButton38);
        radioButton39 =  (RadioButton) findViewById(R.id.radioButton39);
        radioButton40 =  (RadioButton) findViewById(R.id.radioButton40);
        radioButton41 =  (RadioButton) findViewById(R.id.radioButton41);
        radioButton42 =  (RadioButton) findViewById(R.id.radioButton42);
        radioButton43 =  (RadioButton) findViewById(R.id.radioButton43);
        radioButton44 =  (RadioButton) findViewById(R.id.radioButton44);
        radioButton45 =  (RadioButton) findViewById(R.id.radioButton45);
        radioButton46 =  (RadioButton) findViewById(R.id.radioButton46);
        radioButton47 =  (RadioButton) findViewById(R.id.radioButton47);
        radioButton48 =  (RadioButton) findViewById(R.id.radioButton48);
        radioButton49 =  (RadioButton) findViewById(R.id.radioButton49);
        radioButton50 =  (RadioButton) findViewById(R.id.radioButton50);
        radioButton51 =  (RadioButton) findViewById(R.id.radioButton51);
        radioButton52 =  (RadioButton) findViewById(R.id.radioButton52);
        radioButton53 =  (RadioButton) findViewById(R.id.radioButton53);
        radioButton54 =  (RadioButton) findViewById(R.id.radioButton54);
        radioButton55 =  (RadioButton) findViewById(R.id.radioButton55);


    }

    public void checRad(View v) {

        if (radioButton1.isChecked()) {
            resultados.put("Os profissionais que fazem o atendimento são educados e cordiais? Como o Sr (a) avalia este aspecto?", radioButton1.getText().toString());
        }

        if (radioButton2.isChecked()) {
            resultados.put("Os profissionais que fazem o atendimento são educados e cordiais? Como o Sr (a) avalia este aspecto?", radioButton2.getText().toString());
        }


        if (radioButton3.isChecked()) {
            resultados.put("Os profissionais que fazem o atendimento são educados e cordiais? Como o Sr (a) avalia este aspecto?", radioButton3.getText().toString());
        }
        if (radioButton4.isChecked()) {
            resultados.put("Os profissionais que fazem o atendimento são educados e cordiais? Como o Sr (a) avalia este aspecto?", radioButton4.getText().toString());

        }
        if (radioButton5.isChecked()) {
            resultados.put("Os profissionais que fazem o atendimento são educados e cordiais? Como o Sr (a) avalia este aspecto?", radioButton5.getText().toString());
        }
        //============================
        if (radioButton6.isChecked()) {
            resultados.put("Como o Sr (a) considera a estrutura hospitalar em termos de conforto e privacidade do usuário?", radioButton6.getText().toString());

        }
        if (radioButton7.isChecked()) {
            resultados.put("Como o Sr (a) considera a estrutura hospitalar em termos de conforto e privacidade do usuário?", radioButton7.getText().toString());

        }

        if (radioButton8.isChecked()) {
            resultados.put("Como o Sr (a) considera a estrutura hospitalar em termos de conforto e privacidade do usuário?", radioButton8.getText().toString());

        }
        if (radioButton9.isChecked()) {
            resultados.put("Como o Sr (a) considera a estrutura hospitalar em termos de conforto e privacidade do usuário?", radioButton9.getText().toString());

        }
        if (radioButton10.isChecked()) {
            resultados.put("Como o Sr (a) considera a estrutura hospitalar em termos de conforto e privacidade do usuário?", radioButton10.getText().toString());

        }
        //============================
        if (radioButton11.isChecked()) {
            resultados.put("Como é o estado de conservação do local de atendimento?", radioButton11.getText().toString());

        }

        if (radioButton12.isChecked()) {
            resultados.put("Como é o estado de conservação do local de atendimento?", radioButton12.getText().toString());

        }
        if (radioButton13.isChecked()) {
            resultados.put("Como é o estado de conservação do local de atendimento?", radioButton13.getText().toString());

        }
        if (radioButton14.isChecked()) {
            resultados.put("Como é o estado de conservação do local de atendimento?", radioButton15.getText().toString());

        }
        if (radioButton15.isChecked()) {
            resultados.put("Como é o estado de conservação do local de atendimento?", radioButton15.getText().toString());

        }
        //============================
        if (radioButton16.isChecked()) {
            resultados.put("Como o Sr (a) considera o espaço físico para acolher o acompanhante? (É suficiente?)", radioButton16.getText().toString());

        }
        if (radioButton17.isChecked()) {
            resultados.put("Como o Sr (a) considera o espaço físico para acolher o acompanhante? (É suficiente?)", radioButton17.getText().toString());

        }
        if (radioButton18.isChecked()) {
            resultados.put("Como o Sr (a) considera o espaço físico para acolher o acompanhante? (É suficiente?)", radioButton18.getText().toString());

        }

        if (radioButton19.isChecked()) {
            resultados.put("Como o Sr (a) considera o espaço físico para acolher o acompanhante? (É suficiente?)", radioButton19.getText().toString());

        }
        if (radioButton20.isChecked()) {
            resultados.put("Como o Sr (a) considera o espaço físico para acolher o acompanhante? (É suficiente?)", radioButton20.getText().toString());

        }
        //============================
        if (radioButton21.isChecked()) {
            resultados.put("Como o Sr (a) considera o espaço físico para acolher o acompanhante? (É suficiente?)", radioButton21.getText().toString());

        }
        if (radioButton22.isChecked()) {
            resultados.put("Como o Sr (a) considera o espaço físico para acolher o acompanhante? (É suficiente?)", radioButton22.getText().toString());

        }
        if (radioButton23.isChecked()) {
            resultados.put("Como o Sr (a) considera o espaço físico para acolher o acompanhante? (É suficiente?)", radioButton23.getText().toString());

        }
        if (radioButton24.isChecked()) {
            resultados.put("Como o Sr (a) considera o espaço físico para acolher o acompanhante? (É suficiente?)", radioButton24.getText().toString());

        }

        if (radioButton25.isChecked()) {
            resultados.put("Como o Sr (a) considera o espaço físico para acolher o acompanhante? (É suficiente?)", radioButton25.getText().toString());

        }
        //============================
        if (radioButton26.isChecked()) {
            resultados.put("Os profissionais contribuem para que o (a) Sr (a) se sinta confortável e seguro? Como o Sr (a) avalia este aspecto?", radioButton26.getText().toString());

        }
        if (radioButton27.isChecked()) {
            resultados.put("Os profissionais contribuem para que o (a) Sr (a) se sinta confortável e seguro? Como o Sr (a) avalia este aspecto?", radioButton27.getText().toString());

        }
        if (radioButton28.isChecked()) {
            resultados.put("Os profissionais contribuem para que o (a) Sr (a) se sinta confortável e seguro? Como o Sr (a) avalia este aspecto?", radioButton28.getText().toString());

        }
        if (radioButton29.isChecked()) {
            resultados.put("Os profissionais contribuem para que o (a) Sr (a) se sinta confortável e seguro? Como o Sr (a) avalia este aspecto?", radioButton29.getText().toString());

        }

        if (radioButton30.isChecked()) {
            resultados.put("Os profissionais contribuem para que o (a) Sr (a) se sinta confortável e seguro? Como o Sr (a) avalia este aspecto?", radioButton30.getText().toString());

        }
        //============================
        if (radioButton31.isChecked()) {
            resultados.put("Como o Sr (a) considera a humanização em todas as etapas do atendimento?", radioButton31.getText().toString());

        }
        if (radioButton32.isChecked()) {
            resultados.put("Como o Sr (a) considera a humanização em todas as etapas do atendimento?", radioButton32.getText().toString());

        }

        if (radioButton33.isChecked()) {
            resultados.put("Como o Sr (a) considera a humanização em todas as etapas do atendimento?", radioButton33.getText().toString());

        }
        if (radioButton34.isChecked()) {
            resultados.put("Como o Sr (a) considera a humanização em todas as etapas do atendimento?", radioButton34.getText().toString());

        }
        if (radioButton35.isChecked()) {
            resultados.put("Como o Sr (a) considera a humanização em todas as etapas do atendimento?", radioButton35.getText().toString());

        }
        //===========================
        if (radioButton36.isChecked()) {
            resultados.put("Como o Sr (a) considera as orientações fornecidas pela equipe sobre os procedimentos a serem realizados e seu estado de saúde? (Estas são sempre fornecidas?)", radioButton36.getText().toString());

        }
        if (radioButton37.isChecked()) {
            resultados.put("Como o Sr (a) considera as orientações fornecidas pela equipe sobre os procedimentos a serem realizados e seu estado de saúde? (Estas são sempre fornecidas?)", radioButton37.getText().toString());

        }
        if (radioButton38.isChecked()) {
            resultados.put("Como o Sr (a) considera as orientações fornecidas pela equipe sobre os procedimentos a serem realizados e seu estado de saúde? (Estas são sempre fornecidas?)", radioButton38.getText().toString());

        }
        if (radioButton39.isChecked()) {
            resultados.put("Como o Sr (a) considera as orientações fornecidas pela equipe sobre os procedimentos a serem realizados e seu estado de saúde? (Estas são sempre fornecidas?)", radioButton39.getText().toString());

        }

        if (radioButton40.isChecked()) {
            resultados.put("Como o Sr (a) considera as orientações fornecidas pela equipe sobre os procedimentos a serem realizados e seu estado de saúde? (Estas são sempre fornecidas?)", radioButton40.getText().toString());

        }
        //===========================
        if (radioButton41.isChecked()) {
            resultados.put("Como o Sr (a) avalia a qualidade técnica dos cuidados prestados? ", radioButton41.getText().toString());

        }
        if (radioButton42.isChecked()) {
            resultados.put("Como o Sr (a) avalia a qualidade técnica dos cuidados prestados? ", radioButton42.getText().toString());

        }
        if (radioButton43.isChecked()) {
            resultados.put("Como o Sr (a) avalia a qualidade técnica dos cuidados prestados? ", radioButton43.getText().toString());

        }
        if (radioButton44.isChecked()) {
            resultados.put("Como o Sr (a) avalia a qualidade técnica dos cuidados prestados? ", radioButton44.getText().toString());

        }
        if (radioButton45.isChecked()) {
            resultados.put("Como o Sr (a) avalia a qualidade técnica dos cuidados prestados? ", radioButton45.getText().toString());

        }
        //===========================
        if (radioButton46.isChecked()) {
            resultados.put("Como o Sr (a) avalia a equipe assistencial em termos de demonstrar segurança durante os procedimentos?", radioButton46.getText().toString());

        }
        if (radioButton47.isChecked()) {
            resultados.put("Como o Sr (a) avalia a equipe assistencial em termos de demonstrar segurança durante os procedimentos?", radioButton47.getText().toString());

        }
        if (radioButton48.isChecked()) {
            resultados.put("Como o Sr (a) avalia a equipe assistencial em termos de demonstrar segurança durante os procedimentos?", radioButton48.getText().toString());

        }
        if (radioButton49.isChecked()) {
            resultados.put("Como o Sr (a) avalia a equipe assistencial em termos de demonstrar segurança durante os procedimentos?", radioButton49.getText().toString());

        }
        if (radioButton50.isChecked()) {
            resultados.put("Como o Sr (a) avalia a equipe assistencial em termos de demonstrar segurança durante os procedimentos?", radioButton50.getText().toString());

        }
        //===============================
        if (radioButton51.isChecked()) {
            resultados.put("Como o Sr (a) considera a resolutividade do atendimento?", radioButton51.getText().toString());

        }
        if (radioButton52.isChecked()) {
            resultados.put("Como o Sr (a) considera a resolutividade do atendimento?", radioButton52.getText().toString());

        }
        if (radioButton53.isChecked()) {
            resultados.put("Como o Sr (a) considera a resolutividade do atendimento?", radioButton53.getText().toString());

        }
        if (radioButton54.isChecked()) {
            resultados.put("Como o Sr (a) considera a resolutividade do atendimento?", radioButton54.getText().toString());

        }
        if (radioButton55.isChecked()) {
            resultados.put("Como o Sr (a) considera a resolutividade do atendimento?", radioButton55.getText().toString());

        }
    }

}
