package br.edu.insper.al.grupo_8.projeto_2.methods;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.LinkedList;

import br.edu.insper.al.grupo_8.projeto_2.R;

public class MethodVActivity extends AppCompatActivity {

    private int soma;

    private LinkedList<CheckBox> boxes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_v);

        boxes = new LinkedList<>();

        // === TESTE A ===

        CheckBox cb1TestA = findViewById(R.id.cb_1_testA);
        boxes.add(cb1TestA);
        CheckBox cb2TestA = findViewById(R.id.cb_2_testA);
        boxes.add(cb2TestA);
        CheckBox cb3TestA = findViewById(R.id.cb_3_testA);
        boxes.add(cb3TestA);

        // ==== TESTE B ===

        CheckBox cb1TestB = findViewById(R.id.cb_1_testB);
        boxes.add(cb1TestB);
        CheckBox cb2TestB = findViewById(R.id.cb_2_testB);
        boxes.add(cb2TestB);
        CheckBox cb3TestB = findViewById(R.id.cb_3_testB);
        boxes.add(cb3TestB);

        // === TESTE C ===

        CheckBox cb1TestC = findViewById(R.id.cb_1_testC);
        boxes.add(cb1TestC);
        CheckBox cb2TestC = findViewById(R.id.cb_2_testC);
        boxes.add(cb2TestC);
        CheckBox cb3TestC = findViewById(R.id.cb_3_testC);
        boxes.add(cb3TestC);

        // === TESTE D ===

        CheckBox cb1TestD = findViewById(R.id.cb_1_testD);
        boxes.add(cb1TestD);
        CheckBox cb2TestD = findViewById(R.id.cb_2_testD);
        boxes.add(cb2TestD);
        CheckBox cb3TestD = findViewById(R.id.cb_3_testD);
        boxes.add(cb3TestD);

        // === TESTE E ===

        CheckBox cb1TestE = findViewById(R.id.cb_1_testE);
        boxes.add(cb1TestE);
        CheckBox cb2TestE = findViewById(R.id.cb_2_testE);
        boxes.add(cb2TestE);
        CheckBox cb3TestE = findViewById(R.id.cb_3_testE);
        boxes.add(cb3TestE);

        // === TESTE F ===

        CheckBox cb1TestF = findViewById(R.id.cb_1_testF);
        boxes.add(cb1TestF);
        CheckBox cb2TestF = findViewById(R.id.cb_2_testF);
        boxes.add(cb2TestF);
        CheckBox cb3TestF = findViewById(R.id.cb_3_testF);
        boxes.add(cb3TestF);

        // === TESTE G ===

        CheckBox cb1TestG = findViewById(R.id.cb_1_testG);
        boxes.add(cb1TestG);
        CheckBox cb2TestG = findViewById(R.id.cb_2_testG);
        boxes.add(cb2TestG);
        CheckBox cb3TestG = findViewById(R.id.cb_3_testG);
        boxes.add(cb3TestG);

        TextView resultSoma = findViewById(R.id.result);

        for (CheckBox box : boxes) {
            box.setOnClickListener(v -> {
                if (box.isChecked()) {
                    soma += Integer.parseInt(box.getText().toString());
                }

                if (!box.isChecked()) {
                    soma -= Integer.parseInt(box.getText().toString());
                }
                resultSoma.setText("TOTAL : " + String.valueOf(soma));

            });
        }
    }


}
