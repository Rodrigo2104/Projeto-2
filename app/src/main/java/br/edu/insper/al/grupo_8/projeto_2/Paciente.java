package br.edu.insper.al.grupo_8.projeto_2;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

public class Paciente {

    private String nome;
    private HashMap<String, String> resultados;
    private HashMap <String, String> dados;

    public void Paciente(String nome, int num) {
        this.nome = nome;

        this.resultados = new HashMap<String, String>();

    }

    public String getNome() {
        return nome;
    }


    public HashMap getResultados() {
        return resultados;
    }

    public void addToResultados(String teste, String resultado) {
        resultados.put(teste, resultado);
    }

    public void addToDados(HashMap<String, String> DADOS){
        this.dados = DADOS;
    }

}
