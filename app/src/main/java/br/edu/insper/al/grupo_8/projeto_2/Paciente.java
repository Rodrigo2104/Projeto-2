package br.edu.insper.al.grupo_8.projeto_2;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

public class Paciente {
    private String nome;

    private HashMap<String, String> resultados;
    private HashMap <String, String> dados;
    private String RH;

    public Paciente(String nome, String num, HashMap<String, String> resultados) {
        this.nome = nome;
        this.RH = num;
        this.resultados = resultados;

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
