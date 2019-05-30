package br.edu.insper.al.grupo_8.projeto_2;

public class UnitQuestion {
    private boolean activated;
    private int value;

    public UnitQuestion(int value) {
        this.value = value;
        this.activated = false;
    }

    public int getValue() {
        return value;
    }

    public boolean getActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
