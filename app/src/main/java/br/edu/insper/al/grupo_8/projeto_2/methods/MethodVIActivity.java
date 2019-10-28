package br.edu.insper.al.grupo_8.projeto_2.methods;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import org.w3c.dom.Text;

import java.util.HashMap;

import br.edu.insper.al.grupo_8.projeto_2.R;
import br.edu.insper.al.grupo_8.projeto_2.TestsActivity;

public class MethodVIActivity extends AppCompatActivity {
    private HashMap<String, String> testes = new HashMap<String, String>();

    private EditText Nome;
    private EditText Quantos_Dias;
    private EditText Quantos_Vezes;
    private EditText Quantos_Comprimidos;
    private EditText Como_Funciona;

    private EditText Medicacao;
    private EditText Muito;
    private EditText UmPouco;
    private EditText Pouco;
    private EditText Nunca;
    private EditText Comentario;

    private EditText AbrirFechar;
    private EditText AbrirFecharMuito;
    private EditText AbrirFecharPouco;
    private EditText AbrirFecharNaoMuito;
    private EditText AbrirFecharComentario;


    private void startMethodActivity(Class classe) {
        Intent intent = new Intent(this, classe);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_vi);

        Button buttonGoBack = findViewById(R.id.button_goTests);
        buttonGoBack.setOnClickListener((view) -> startMethodActivity(MethodVActivity.class));

        Button buttonGoMenu = findViewById(R.id.button_goMenu);
        buttonGoMenu.setOnClickListener((view) -> startMethodActivity(TestsActivity.class));

        Button buttonNext = findViewById(R.id.button_goMethodIII);
        buttonNext.setOnClickListener((view) -> startMethodActivity(MethodVIIActivity.class));


        //===================================================================================
        //===================================================================================

        Nome = (EditText) findViewById(R.id.ultima_semana_a1);
        testes.put("Nome da medicação e dosagem", Nome.toString());
        Quantos_Dias = (EditText) findViewById(R.id.ultima_semana_b1);
        testes.put("Nome da medicação e dosagem", Nome.toString());
        Quantos_Vezes = (EditText) findViewById(R.id.ultima_semana_c1);
        testes.put("Quantos dias você tomou esse remédio", Quantos_Vezes.toString());
        Quantos_Comprimidos = (EditText) findViewById(R.id.ultima_semana_d1);
        testes.put("Quantas vezes por dia você tomou esse remédio", Quantos_Comprimidos.toString());
        Como_Funciona = (EditText) findViewById(R.id.ultima_semana_e1);
        testes.put("Quantas vezes por dia você tomou esse remédio", Quantos_Comprimidos.toString());
        Como_Funciona = (EditText) findViewById(R.id.ultima_semana_e1);
        testes.put("Quantas vezes por dia você tomou esse remédio", Quantos_Comprimidos.toString());

        Medicacao = (EditText) findViewById(R.id.quanto_essa_medicacao_a1);
        testes.put("Medicação", Medicacao.toString());
        Muito = (EditText) findViewById(R.id.quanto_essa_medicacao_b1);
        testes.put("Encomoda", Muito.toString());
        UmPouco = (EditText) findViewById(R.id.quanto_essa_medicacao_c1);
        testes.put("Encomoda", UmPouco.toString());
        Pouco = (EditText) findViewById(R.id.quanto_essa_medicacao_d1);
        testes.put("Encomoda", Pouco.toString());
        Nunca = (EditText) findViewById(R.id.quanto_essa_medicacao_e1);
        testes.put("Encomoda", Nunca.toString());
        Comentario = (EditText) findViewById(R.id.quanto_essa_medicacao_f1);
        testes.put("Encomoda", Comentario.toString());


        AbrirFecharMuito = (EditText) findViewById(R.id.Abrir_ou_fechar_a_embalagem_Muito);
        testes.put("Problemas", AbrirFecharMuito.toString());

        AbrirFecharPouco = (EditText) findViewById(R.id.Abrir_ou_fechar_a_embalagem_UmPouco);
        testes.put("Problemas", AbrirFecharPouco.toString());

        AbrirFecharNaoMuito = (EditText) findViewById(R.id.Abrir_ou_fechar_a_embalagem_NaoMuito);
        testes.put("Problemas", AbrirFecharNaoMuito.toString());

        AbrirFecharComentario = (EditText) findViewById(R.id.Abrir_ou_fechar_a_embalagem_Comentario);
        testes.put("Problemas", AbrirFecharComentario.toString());

    }

}
