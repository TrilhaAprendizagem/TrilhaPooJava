package com.br.rp.escola;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "aluno")
public class Aluno extends Pessoa {

    @Id
    @Column(name = "matricula")
    private String matricula;

    @Column(name = "curso")
    private String curso;

    // Construtor padrão
    public Aluno() {
    }

    // Construtor com todos os atributos de Pessoa e Aluno
    public Aluno(String nome, String email, String telefone, String rua, String bairro,
                 String cidade, String estado, String matricula, String curso) {
        super(nome, email, telefone, rua, bairro, cidade, estado);
        this.matricula = matricula;
        this.curso = curso;
    }

    // Getter e Setter para a matrícula
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Getter e Setter para o curso
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Método toString para Aluno
    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + getNome() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", rua='" + getRua() + '\'' +
                ", bairro='" + getBairro() + '\'' +
                ", cidade='" + getCidade() + '\'' +
                ", estado='" + getEstado() + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }
}
