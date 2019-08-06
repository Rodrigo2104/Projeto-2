package br.edu.insper.al.grupo_8.projeto_2;


public class Paciente {
    private String nome;
    private String rh;
    private String data_internacao;
    private int idade;
    private String sexo;
    private int t01, t02, t03, t04, t05, t08, t09, t10;
    
    public Paciente() {
    }

    public Paciente(String nome, String rh, String data, int idade, String sexo, int t01, int t02, int t03, int t04, int t05, int t08, int t09, int t10) {
        this.nome = nome;
        this.rh = rh;
        this.data_internacao = data;
        this.idade = idade;
        this.sexo = sexo;
        this.t01 = t01;
        this.t02 = t02;
        this.t03 = t03;
        this.t04 = t04;
        this.t05 = t05;
        this.t08 = t08;
        this.t09 = t09;
        this.t10 = t10;
    }

    public int getT01() {
        return t01;
    }

    public void setT01(Integer t01) {
        this.t01 = t01;
    }

    public int getT02() {
        return t02;
    }

    public void setT02(Integer t02) {
        this.t02 = t02;
    }

    public int getT03() {
        return t03;
    }

    public void setT03(Integer t03) {
        this.t03 = t03;
    }

    public int getT04() {
        return t04;
    }

    public void setT04(Integer t04) {
        this.t04 = t04;
    }

    public int getT05() {
        return t05;
    }

    public void setT05(Integer t05) {
        this.t05 = t05;
    }

    public int getT08() {
        return t08;
    }

    public void setT08(Integer t08) {
        this.t08 = t08;
    }

    public int getT09() {
        return t09;
    }

    public void setT09(Integer t09) {
        this.t09 = t09;
    }

    public int getT10() {
        return t10;
    }

    public void setT10(Integer t10) {
        this.t10 = t10;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
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
