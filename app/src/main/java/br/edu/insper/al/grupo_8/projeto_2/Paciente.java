package br.edu.insper.al.grupo_8.projeto_2;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

public class Paciente {
    private String nome;
    private int num;
    private Date dataDeEntrada;
    private HashMap <String, LinkedList<String>> resultados;

    public void Paciente(String nome, int num){
        this.nome = nome;
        this.num = num;
        this.resultados = new HashMap <String, LinkedList<String>>();
        dataDeEntrada = new Date();
    }

    public String getNome(){
        return nome;
    }
    public int getNum(){
        return num;
    }
    public Date getDataDeEntrada(){
        return dataDeEntrada;
    }
    public HashMap getResultados(){
        return resultados;
    }

    public void addToResultados(String teste, LinkedList<String> resultado){
        resultados.put(teste, resultado);
    }

}
