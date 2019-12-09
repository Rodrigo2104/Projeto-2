package br.edu.insper.al.grupo_8.projeto_2.methods;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.LinkedList;

import br.edu.insper.al.grupo_8.projeto_2.R;
import br.edu.insper.al.grupo_8.projeto_2.TestsActivity;

public class MethodVIIIActivity extends AppCompatActivity {
    private String rh;
    private int total;
    private LinkedList <CheckBox> checked;

    private void startMethodActivity(Class classe) {
        Intent intent = new Intent(this, classe);
        intent.putExtra("rh", rh);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_viii);

        Bundle extras = getIntent().getExtras();
        assert extras != null;
        rh = extras.getString("rh");

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("Pacientes");

        Button buttonGoMenu = findViewById(R.id.button_goMenu);
        buttonGoMenu.setOnClickListener((view) -> startMethodActivity(TestsActivity.class));

        Button buttonNext = findViewById(R.id.button_goMethodIX);

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
            box.setOnClickListener(v -> {
                if (box.isChecked()){
                    total ++;
                }

                if (!box.isChecked()){
                    total --;
                }
                resultado.setText(String.valueOf(total));
            });
        }

        buttonNext.setOnClickListener((view) -> {
            ref.child(rh).child("Testes").child("t08").setValue(resultado.getText().toString());
            startMethodActivity(MethodIXActivity.class);
        });
    }
}