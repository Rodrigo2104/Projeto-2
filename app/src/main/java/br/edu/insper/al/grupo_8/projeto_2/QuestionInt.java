package br.edu.insper.al.grupo_8.projeto_2;

import java.util.HashMap;

public class QuestionInt extends Question {
    private int numberOfQuestions;
    private HashMap<String, UnitQuestion> options;

    public QuestionInt(String question, int numberOfQuestions) {
        super(question);
        this.numberOfQuestions = numberOfQuestions;
        options = new HashMap<>();
    }

    public void putQuestion(String question, UnitQuestion option) {
        this.options.put(question, option);
    }

    public HashMap<String, UnitQuestion> getOptions() {
        return options;
    }

    public int getNumberOfQuestions() {
        return numberOfQuestions;
    }
}
