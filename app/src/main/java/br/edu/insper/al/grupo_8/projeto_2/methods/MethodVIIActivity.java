package br.edu.insper.al.grupo_8.projeto_2.methods;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.LinkedList;

import br.edu.insper.al.grupo_8.projeto_2.R;

public class MethodVIIActivity extends AppCompatActivity {

    private int total;
    private LinkedList <CheckBox> checked;

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

        checked = new LinkedList<>();

        CheckBox cb1 = findViewById(R.id.cb1);
        checked.add(cb1);

        CheckBox cb2 = findViewById(R.id.cb2);
        checked.add(cb2);

        CheckBox cb3 = findViewById(R.id.cb3);
        checked.add(cb3);

        CheckBox cb4 = findViewById(R.id.cb4);
        checked.add(cb4);

        CheckBox cb5 = findViewById(R.id.cb5);
        checked.add(cb5);

        CheckBox cb6 = findViewById(R.id.cb6);
        checked.add(cb6);

        CheckBox cb7 = findViewById(R.id.cb7);
        checked.add(cb7);

        CheckBox cb8 = findViewById(R.id.cb8);
        checked.add(cb8);

        CheckBox cb9 = findViewById(R.id.cb9);
        checked.add(cb9);

        CheckBox cb10 = findViewById(R.id.cb10);
        checked.add(cb10);

        CheckBox cb11 = findViewById(R.id.cb11);
        checked.add(cb11);

        CheckBox cb12 = findViewById(R.id.cb12);
        checked.add(cb12);

        CheckBox cb13 = findViewById(R.id.cb13);
        checked.add(cb13);

        CheckBox cb14 = findViewById(R.id.cb14);
        checked.add(cb14);

        CheckBox cb15 = findViewById(R.id.cb15);
        checked.add(cb15);

        CheckBox cb16 = findViewById(R.id.cb16);
        checked.add(cb16);

        CheckBox cb17 = findViewById(R.id.cb17);
        checked.add(cb17);

        CheckBox cb18 = findViewById(R.id.cb18);
        checked.add(cb18);

        CheckBox cb19 = findViewById(R.id.cb19);
        checked.add(cb19);

        CheckBox cb20 = findViewById(R.id.cb20);
        checked.add(cb20);

        CheckBox cb21 = findViewById(R.id.cb21);
        checked.add(cb21);

        CheckBox cb22 = findViewById(R.id.cb22);
        checked.add(cb22);

        CheckBox cb23 = findViewById(R.id.cb23);
        checked.add(cb23);

        TextView resultado = findViewById(R.id.result);

//        for (CheckBox box : checked){
//            box.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    if (box.isChecked()){
//                        total ++;
//                    }
//
//                    if (!box.isChecked()){
//                        total --;
//                    }
//                    resultado.setText("TOTAL : " + String.valueOf(total));
//                }
//            });
//        }

    }
}
