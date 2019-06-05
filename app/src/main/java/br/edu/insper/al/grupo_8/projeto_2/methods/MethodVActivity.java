package br.edu.insper.al.grupo_8.projeto_2.methods;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.LinkedList;

import br.edu.insper.al.grupo_8.projeto_2.R;

public class MethodVActivity extends AppCompatActivity {

    private LinkedList<RadioButton> boxes;

    private void startMethodActivity(Class classe) {
        Intent intent = new Intent(this, classe);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_v);

        Button buttonGoMethodVI = findViewById(R.id.button_goMethodVI);
        buttonGoMethodVI.setOnClickListener((view) -> startMethodActivity(MethodVIActivity.class));

        boxes = new LinkedList<>();

        RadioButton[] cblTests = new RadioButton[21];

        // === TESTE A ===

        cblTests[0] = findViewById(R.id.cb_1_testA);
        cblTests[1] = findViewById(R.id.cb_2_testA);
        cblTests[2] = findViewById(R.id.cb_3_testA);

        boxes.add(cblTests[0]);
        boxes.add(cblTests[1]);
        boxes.add(cblTests[2]);

        // ==== TESTE B ===

        cblTests[3] = findViewById(R.id.cb_1_testB);
        cblTests[4] = findViewById(R.id.cb_2_testB);
        cblTests[5] = findViewById(R.id.cb_3_testB);

        boxes.add(cblTests[3]);
        boxes.add(cblTests[4]);
        boxes.add(cblTests[5]);

        // === TESTE C ===

        cblTests[6] = findViewById(R.id.cb_1_testC);
        cblTests[7] = findViewById(R.id.cb_2_testC);
        cblTests[8] = findViewById(R.id.cb_3_testC);

        boxes.add(cblTests[6]);
        boxes.add(cblTests[7]);
        boxes.add(cblTests[8]);

        // === TESTE D ===

        cblTests[9] = findViewById(R.id.cb_1_testD);
        cblTests[10] = findViewById(R.id.cb_2_testD);
        cblTests[11] = findViewById(R.id.cb_3_testD);

        boxes.add(cblTests[9]);
        boxes.add(cblTests[10]);
        boxes.add(cblTests[11]);

        // === TESTE E ===

        cblTests[12] = findViewById(R.id.cb_1_testE);
        cblTests[13] = findViewById(R.id.cb_2_testE);
        cblTests[14] = findViewById(R.id.cb_3_testE);

        boxes.add(cblTests[12]);
        boxes.add(cblTests[13]);
        boxes.add(cblTests[14]);

        // === TESTE F ===

        cblTests[15] = findViewById(R.id.cb_1_testF);
        cblTests[16] = findViewById(R.id.cb_2_testF);
        cblTests[17] = findViewById(R.id.cb_3_testF);

        boxes.add(cblTests[15]);
        boxes.add(cblTests[16]);
        boxes.add(cblTests[17]);

        // === TESTE G ===

        cblTests[18] = findViewById(R.id.cb_1_testG);
        cblTests[19] = findViewById(R.id.cb_2_testG);
        cblTests[20] = findViewById(R.id.cb_3_testG);

        boxes.add(cblTests[18]);
        boxes.add(cblTests[19]);
        boxes.add(cblTests[20]);

        TextView resultSoma = findViewById(R.id.result);

        for (RadioButton box :  boxes){
            box.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int soma = 0;
                    for (RadioButton cblTest: cblTests) {
                        if (cblTest.isChecked()){
                            soma += Integer.parseInt(cblTest.getText().toString().substring(0,1));
                        }
                    }
                    resultSoma.setText("TOTAL : " + String.valueOf(soma));
                }
            });
        }
    }
}
