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
import br.edu.insper.al.grupo_8.projeto_2.TestsActivity;

public class MethodVIIIActivity extends AppCompatActivity {

    private int total;
    private LinkedList <CheckBox> checked;

    private void startMethodActivity(Class classe) {
        Intent intent = new Intent(this, classe);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_viii);

        Button buttonGoBack = findViewById(R.id.button_goTests);
        buttonGoBack.setOnClickListener((view) -> startMethodActivity(MethodVIIActivity.class));

        Button buttonGoMenu = findViewById(R.id.button_goMenu);
        buttonGoMenu.setOnClickListener((view) -> startMethodActivity(TestsActivity.class));

        Button buttonNext = findViewById(R.id.button_goMethodIII);
        buttonNext.setOnClickListener((view) -> startMethodActivity(MethodIXActivity.class));

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

        TextView resultado = findViewById(R.id.result);

        for (CheckBox box : checked){
            box.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (box.isChecked()){
                        total ++;
                    }

                    if (!box.isChecked()){
                        total --;
                    }
                    resultado.setText(String.valueOf(total));
                }
            });
        }
    }
}