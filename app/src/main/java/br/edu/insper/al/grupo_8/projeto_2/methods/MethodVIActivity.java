package br.edu.insper.al.grupo_8.projeto_2.methods;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import br.edu.insper.al.grupo_8.projeto_2.R;
import br.edu.insper.al.grupo_8.projeto_2.TestsActivity;

public class MethodVIActivity extends AppCompatActivity {
    private String rh;

    private void startMethodActivity(Class classe) {
        Intent intent = new Intent(this, classe);
        intent.putExtra("rh", rh);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_vi);

        Bundle extras = getIntent().getExtras();
        assert extras != null;
        rh = extras.getString("rh");

        Button buttonGoMenu = findViewById(R.id.button_goMenu);
        buttonGoMenu.setOnClickListener((view) -> startMethodActivity(TestsActivity.class));

        Button buttonNext = findViewById(R.id.button_goMethodVII);
        buttonNext.setOnClickListener((view) -> startMethodActivity(MethodVIIActivity.class));
    }
}
