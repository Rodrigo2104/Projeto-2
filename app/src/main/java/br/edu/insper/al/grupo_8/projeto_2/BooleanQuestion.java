package br.edu.insper.al.grupo_8.projeto_2;

public class BooleanQuestion extends Question {
    private boolean resposta;

    public BooleanQuestion(String question) {
        super(question);
    }

    public void setResposta(boolean resposta){
        this.resposta = resposta;
    }

    public boolean getResposta(){
        return resposta;
    }
}
