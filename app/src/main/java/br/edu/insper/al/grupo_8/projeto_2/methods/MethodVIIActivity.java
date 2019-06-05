package br.edu.insper.al.grupo_8.projeto_2.methods;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.LinkedList;

import br.edu.insper.al.grupo_8.projeto_2.R;

public class MethodVIIActivity extends AppCompatActivity {

    private int total;
    private LinkedList <CheckBox> checkedAusente;
    private LinkedList <CheckBox> checkedLeve;
    private LinkedList <CheckBox> checkedModerado;
    private LinkedList <CheckBox> checkedGrave;

    private void startMethodActivity(Class classe) {
        Intent intent = new Intent(this, classe);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_vii);

        Button buttonGoMethodVIII = findViewById(R.id.button_goMethodVIII);
        buttonGoMethodVIII.setOnClickListener((view) -> startMethodActivity(MethodVIIIActivity.class));

        checkedAusente = new LinkedList<>();
        checkedLeve = new LinkedList<>();
        checkedModerado = new LinkedList<>();
        checkedGrave = new LinkedList<>();

        // AUSENTE
        // ausente (0)

        // imc < 20,5
        CheckBox cb1 = findViewById(R.id.cb1);
        checkedAusente.add(cb1);

        // perda de peso nos ultimos 3 meses
        CheckBox cb2 = findViewById(R.id.cb2);
        checkedAusente.add(cb2);

        // redução de ingestão na última semana
        CheckBox cb3 = findViewById(R.id.cb3);
        checkedAusente.add(cb3);

        // saúde gravemente comprometida
        CheckBox cb4 = findViewById(R.id.cb4);
        checkedAusente.add(cb4);


        //ESTADO NUTRICIONAL : LEVE
        // leve (1)

        // perda de peso maior que 5% em 3 meses
        CheckBox cb5 = findViewById(R.id.cb5);
        checkedLeve.add(cb5);

        // 50 a 75% das necessidades energéticas
        CheckBox cb6 = findViewById(R.id.cb6);
        checkedLeve.add(cb6);


        // GRAVIDADE DA DOENÇA : LEVE
        // leve (1)

        // complicações agudas de doenças crônicas
        CheckBox cb7 = findViewById(R.id.cb7);
        checkedLeve.add(cb7);

        // DPOC
        CheckBox cb8 = findViewById(R.id.cb8);
        checkedLeve.add(cb8);

        // hd (hermodiálise)
        CheckBox cb9 = findViewById(R.id.cb9);
        checkedLeve.add(cb9);

        // câncer
        CheckBox cb10 = findViewById(R.id.cb10);
        checkedLeve.add(cb10);


        // ESTADO NUTRICIONAL : MODERADO
        // moderado (2)

        // perda de peso maior que 5% em 2 meses
        CheckBox cb11 = findViewById(R.id.cb11);
        checkedModerado.add(cb11);

        // imc entre 18,5 e 20,5 kg/m²
        CheckBox cb12 = findViewById(R.id.cb12);
        checkedModerado.add(cb12);

        // 25 a 50% das necessidades energéticas
        CheckBox cb13 = findViewById(R.id.cb13);
        checkedModerado.add(cb13);


        // GRAVIDADE DA DOENÇA : MODERADO
        // moderado (2)

        // avc
        CheckBox cb14 = findViewById(R.id.cb14);
        checkedModerado.add(cb14);

        // BCP Severa
        CheckBox cb15 = findViewById(R.id.cb15);
        checkedModerado.add(cb15);

        // cirurgia no TGI ou absominais
        CheckBox cb16 = findViewById(R.id.cb16);
        checkedModerado.add(cb16);

        // infecções graves
        CheckBox cb17 = findViewById(R.id.cb17);
        checkedModerado.add(cb17);


        // ESTADO NUTRICIONAL : GRAVE
        // grave(3)

        // perda de peso maior que 5% em 1 meses
        CheckBox cb18 = findViewById(R.id.cb18);
        checkedGrave.add(cb18);

        // imc menor que 18,5 kg/m²
        CheckBox cb19 = findViewById(R.id.cb19);
        checkedGrave.add(cb19);

        // 0 a 25% das necessidades energéticas
        CheckBox cb20 = findViewById(R.id.cb20);
        checkedGrave.add(cb20);


        // GRAVIDADE DA DOENÇA : GRAVE
        // grave (3)

        // Neurocirurgia
        CheckBox cb21 = findViewById(R.id.cb21);
        checkedGrave.add(cb21);

        // TMO
        CheckBox cb22 = findViewById(R.id.cb22);
        checkedGrave.add(cb22);

        // UTI (apache > 10)
        CheckBox cb23 = findViewById(R.id.cb23);
        checkedGrave.add(cb23);

        TextView result = findViewById(R.id.result);
        TextView numTotal = findViewById(R.id.total);

        for (CheckBox box : checkedLeve){
            box.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (box.isChecked()){
                        total ++;
                    }

                    if (!box.isChecked()){
                        total --;
                    }
                    numTotal.setText(String.valueOf(total));


                    if (total >= 3){

                        result.setText("Com risco");
                    }else {

                        result.setText("Sem risco");;
                    }
                }

            });
        }
        for (CheckBox box : checkedModerado){
            box.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (box.isChecked()){
                        total += 2;
                    }

                    if (!box.isChecked()){
                        total -= 2;
                    }
                    numTotal.setText(String.valueOf(total));


                    if (total >= 3){

                        result.setText("Com risco");
                    }else {

                        result.setText("Sem risco");;
                    }
                }
            });
        }
        for (CheckBox box : checkedGrave){
            box.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (box.isChecked()){
                        total += 3;
                    }

                    if (!box.isChecked()){
                        total -= 3;
                    }
                    numTotal.setText(String.valueOf(total));


                    if (total >= 3){

                        result.setText("Com risco");
                    }else {

                        result.setText("Sem risco");;
                    }
                }
            });
        }
    }
}
