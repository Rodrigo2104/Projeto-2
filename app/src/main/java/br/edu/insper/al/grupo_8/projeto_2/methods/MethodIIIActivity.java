package br.edu.insper.al.grupo_8.projeto_2.methods;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.LinkedList;

import br.edu.insper.al.grupo_8.projeto_2.R;
import br.edu.insper.al.grupo_8.projeto_2.TestsActivity;

public class MethodIIIActivity extends AppCompatActivity {

    private int soma;
    private String rh;
    private LinkedList<CheckBox> boxes;

    private void startMethodActivity(Class classe) {
        Intent intent = new Intent(this, classe);
        intent.putExtra("rh", rh);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_iii);

        Bundle extras = getIntent().getExtras();
        assert extras != null;
        rh = extras.getString("rh");

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("Pacientes");

        boxes = new LinkedList<>();
        TextView resultadoSoma = findViewById(R.id.resultado);

        Button buttonGoMenu = findViewById(R.id.button_goMenu);
        buttonGoMenu.setOnClickListener((view) -> startMethodActivity(TestsActivity.class));

        CheckBox cb1 = findViewById(R.id.checkBox);
        CheckBox cb2 = findViewById(R.id.checkBox1);
        CheckBox cb3 = findViewById(R.id.checkBox2);
        CheckBox cb4 = findViewById(R.id.checkBox3);
        CheckBox cb5 = findViewById(R.id.checkBox4);
        CheckBox cb6 = findViewById(R.id.checkBox5);
        CheckBox cb7 = findViewById(R.id.checkBox6);
        CheckBox cb8 = findViewById(R.id.checkBox7);
        CheckBox cb9 = findViewById(R.id.checkBox8);
        CheckBox cb10 = findViewById(R.id.checkBox9);
        CheckBox cb11 = findViewById(R.id.checkBox10);
        CheckBox cb12 = findViewById(R.id.checkBox11);
        CheckBox cb13 = findViewById(R.id.checkBox12);
        CheckBox cb14 = findViewById(R.id.checkBox13);
        CheckBox cb15 = findViewById(R.id.checkBox14);
        CheckBox cb16 = findViewById(R.id.checkBox15);
        CheckBox cb17 = findViewById(R.id.checkBox16);
        CheckBox cb18 = findViewById(R.id.checkBox17);
        boxes.add(cb1);
        boxes.add(cb2);
        boxes.add(cb3);
        boxes.add(cb4);
        boxes.add(cb5);
        boxes.add(cb6);
        boxes.add(cb7);
        boxes.add(cb8);
        boxes.add(cb9);
        boxes.add(cb10);
        boxes.add(cb11);
        boxes.add(cb12);
        boxes.add(cb13);
        boxes.add(cb14);
        boxes.add(cb15);
        boxes.add(cb16);
        boxes.add(cb17);
        boxes.add(cb18);

        for (CheckBox box : boxes) {
            box.setOnClickListener(v -> {
                if (box.isChecked()) {
                    soma++;
                }

                if (!box.isChecked()) {
                    soma--;
                }
                resultadoSoma.setText(String.valueOf(soma));
            });
        }

        Button buttonNext = findViewById(R.id.button_goMethodIV);
        buttonNext.setOnClickListener((view) -> {
            ref.child(rh).child("Testes").child("t03").setValue(resultadoSoma.getText().toString());
            startMethodActivity(MethodIVActivity.class);
        });
    }
}
