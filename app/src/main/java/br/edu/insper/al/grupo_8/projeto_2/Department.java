package br.edu.insper.al.grupo_8.projeto_2;

import java.util.HashMap;


public class Department {
    private String nome;
    private HashMap<Integer, Paciente> pacientes;
    public Department(String nome){
        this.nome=nome;
        this.pacientes = new HashMap<>();
    }

    public void addPaciente(Paciente paciente){
        this.pacientes.put(paciente.getNum(),paciente);
    }

    public HashMap<Integer, Paciente> getPacientes(){
        return this.pacientes;
    }

    public void delPaciente(Paciente paciente){
        this.pacientes.remove(paciente.getNum());
    }
}
