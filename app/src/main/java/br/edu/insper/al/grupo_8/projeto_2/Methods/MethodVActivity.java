package br.edu.insper.al.grupo_8.projeto_2.Methods;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import br.edu.insper.al.grupo_8.projeto_2.R;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;

public class MethodVActivity extends AppCompatActivity{

    private int soma;

    private HashMap<String, CheckBox> boxes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_v);

        boxes = new HashMap<String, CheckBox>();

        // === TESTE A ===

        CheckBox cb1TestA = findViewById(R.id.cb_1_testA);
        boxes.put("A", cb1TestA);
        CheckBox cb2TestA = findViewById(R.id.cb_2_testA);
        boxes.put("A", cb2TestA);
        CheckBox cb3TestA = findViewById(R.id.cb_3_testA);
        boxes.put("A", cb3TestA);

        // ==== TESTE B ===

        CheckBox cb1TestB = findViewById(R.id.cb_1_testB);
        boxes.put("B", cb1TestB);
        CheckBox cb2TestB = findViewById(R.id.cb_2_testB);
        boxes.put("B", cb2TestB);
        CheckBox cb3TestB = findViewById(R.id.cb_3_testB);
        boxes.put("B", cb3TestB);

        // === TESTE C ===

        CheckBox cb1TestC = findViewById(R.id.cb_1_testC);
        boxes.put("C", cb1TestC);
        CheckBox cb2TestC = findViewById(R.id.cb_2_testC);
        boxes.put("C", cb2TestC);
        CheckBox cb3TestC = findViewById(R.id.cb_3_testC);
        boxes.put("C", cb3TestC);

        // === TESTE D ===

        CheckBox cb1TestD = findViewById(R.id.cb_1_testD);
        boxes.put("D", cb1TestD);
        CheckBox cb2TestD = findViewById(R.id.cb_2_testD);
        boxes.put("D", cb2TestD);
        CheckBox cb3TestD = findViewById(R.id.cb_3_testD);
        boxes.put("D", cb3TestD);

        // === TESTE E ===

        CheckBox cb1TestE = findViewById(R.id.cb_1_testE);
        boxes.put("E", cb1TestE);
        CheckBox cb2TestE = findViewById(R.id.cb_2_testE);
        boxes.put("E", cb2TestE);
        CheckBox cb3TestE = findViewById(R.id.cb_3_testE);
        boxes.put("E", cb3TestE);

        // === TESTE F ===

        CheckBox cb1TestF = findViewById(R.id.cb_1_testF);
        boxes.put("F", cb1TestF);
        CheckBox cb2TestF = findViewById(R.id.cb_2_testF);
        boxes.put("F", cb2TestF);
        CheckBox cb3TestF = findViewById(R.id.cb_3_testF);
        boxes.put("F", cb3TestF);

        // === TESTE G ===

        HashMap<String, RadioButton> rb = new HashMap<String, RadioButton>();

        RadioButton cb1TestG = findViewById(R.id.cb_1_testG);
        rb.put("G", cb1TestG);
        RadioButton cb2TestG = findViewById(R.id.cb_2_testG);
        rb.put("G", cb2TestG);
        RadioButton cb3TestG = findViewById(R.id.cb_3_testG);
        rb.put("G", cb3TestG);

        TextView resultSoma = findViewById(R.id.result);

        for(RadioButton box : rb.values()){
            box.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (box.isChecked()){
                        soma += Integer.parseInt(box.getText().toString());
                        resultSoma.setText("TOTAL : " + String.valueOf(soma));
                    }

                    if (!box.isChecked()){
                        soma -= Integer.parseInt(box.getText().toString());
                        resultSoma.setText("TOTAL : " + String.valueOf(soma));
                    }
                }
            });
        }
    }



}
