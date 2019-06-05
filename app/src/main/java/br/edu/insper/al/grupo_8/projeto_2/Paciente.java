package br.edu.insper.al.grupo_8.projeto_2;


public class Paciente {
    private String nome;
    private String rh;
    private String data_internacao;
    
    public Paciente() {
    }

    public Paciente(String nome, String rh, String data) {
        this.nome = nome;
        this.rh = rh;
        this.data_internacao = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public String getData_internacao() {
        return data_internacao;
    }

    public void setData_internacao(String data_internacao) {
        this.data_internacao = data_internacao;
    }
}
