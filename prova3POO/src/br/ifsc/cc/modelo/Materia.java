
package br.ifsc.cc.modelo;

public class Materia {
    private String nomeMateria;
    private String nomeProfessor;

    public Materia(String nomeMateria, String nomeProfessor) {
        this.nomeMateria = nomeMateria;
        this.nomeProfessor = nomeProfessor;
    }

    public String getNomeMateria() {
        return nomeMateria;
    }

    public void setNomeMateria(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    @Override
    public String toString() {
        return "Matérias: " 
                + "Nome da Matéria: " + nomeMateria +
                ", Nome do Professor:" + nomeProfessor + '.';
    }
    
    
}
