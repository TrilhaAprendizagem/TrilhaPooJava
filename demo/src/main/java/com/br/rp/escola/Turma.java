package com.br.rp.escola;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "turma")
public class Turma {

    @Id
    private String id;

    @OneToMany(targetEntity = Aluno.class)
    private List<Aluno> alunos;

    // Construtor padrão
    public Turma() {
        this.alunos = new ArrayList<>();
    }

    // Construtor com lista de alunos
    public Turma(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    // Método para adicionar um aluno à turma
    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    // Método para remover um aluno da turma
    public void removerAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    // Getters e Setters
    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Método toString
    @Override
    public String toString() {
        return "Turma{" +
                "id='" + id + '\'' +
                ", alunos=" + alunos +
                '}';
    }
}


