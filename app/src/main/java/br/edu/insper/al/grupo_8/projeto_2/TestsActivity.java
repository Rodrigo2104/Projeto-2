package br.edu.insper.al.grupo_8.projeto_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import br.edu.insper.al.grupo_8.projeto_2.methods.*;

public class TestsActivity extends AppCompatActivity {
    private String rh;

    private void startGoToIntent(Class classe) {
        Intent intent = new Intent(this, classe);
        intent.putExtra("rh", rh);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tests);

        Bundle extras = getIntent().getExtras();
        assert extras != null;
        rh = extras.getString("rh");

        // LEMBRE-SE DE CRIAR UM ATRIBUTO DO TIPO CLASS PARA A ACTIVITY DO SEU MÉTODO

        Button goBack = findViewById(R.id.button_goBack);
        goBack.setOnClickListener((view) -> startGoToIntent(PacientLog.class));

        Button buttonGoMethodI = findViewById(R.id.button_goMethodI);
        buttonGoMethodI.setOnClickListener((view) -> startGoToIntent(MethodIActivity.class));

        Button buttonGoMethodII = findViewById(R.id.button_goMethodII);
        buttonGoMethodII.setOnClickListener((view) -> startGoToIntent(MethodIIActivity.class));

        Button buttonGoMethodIII = findViewById(R.id.button_goMethodIII);
        buttonGoMethodIII.setOnClickListener((view) -> startGoToIntent(MethodIIIActivity.class));

        Button buttonGoMethodIV = findViewById(R.id.button_goMethodIV);
        buttonGoMethodIV.setOnClickListener((view) -> startGoToIntent(MethodIVActivity.class));

        Button buttonGoMethodV = findViewById(R.id.button_goMethodV);
        buttonGoMethodV.setOnClickListener((view) -> startGoToIntent(MethodVActivity.class));

        Button buttonGoMethodVI = findViewById(R.id.button_goMethodVI);
        buttonGoMethodVI.setOnClickListener((view) -> startGoToIntent(MethodVIActivity.class));

        Button buttonGoMethodVII = findViewById(R.id.button_goMethodVII);
        buttonGoMethodVII.setOnClickListener((view) -> startGoToIntent(MethodVIIActivity.class));

        Button buttonGoMethodVIII = findViewById(R.id.button_goMethodVIII);
        buttonGoMethodVIII.setOnClickListener((view) -> startGoToIntent(MethodVIIIActivity.class));

        Button buttonGoMethodIX = findViewById(R.id.button_goMethodIX);
        buttonGoMethodIX.setOnClickListener((view) -> startGoToIntent(MethodIXActivity.class));

        Button buttonGoMethodX = findViewById(R.id.button_goMethodX);
        buttonGoMethodX.setOnClickListener((view) -> startGoToIntent(MethodXActivity.class));

        Button buttonGoMethodXI = findViewById(R.id.button_goMethodXI);
        buttonGoMethodXI.setOnClickListener((view) -> startGoToIntent(MethodXIActivity.class));

        Button buttonGoMethodXII = findViewById(R.id.button_goMethodXII);
        buttonGoMethodXII.setOnClickListener((view) -> startGoToIntent(MethodXIIActivity.class));

    }
}
