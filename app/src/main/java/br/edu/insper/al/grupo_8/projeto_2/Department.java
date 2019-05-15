package br.edu.insper.al.grupo_8.projeto_2;

import java.util.LinkedList;

public class Department {
    private String nome;
    private LinkedList<Paciente> pacientes;
    public Department(String nome){
        this.nome=nome;
        this.pacientes = new LinkedList<>();
    }

    public void addPaciente(Paciente paciente){
        this.pacientes.add(paciente);
    }

    public LinkedList<Paciente> getPacientes(){
        return this.pacientes;
    }
}
