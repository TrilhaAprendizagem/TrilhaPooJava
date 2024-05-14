package com.br.rp.escola;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "aula")
public class Aula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;

    @OneToOne
    @JoinColumn(name = "disciplina_id")
    private Disciplina disciplina;

    @OneToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;

    @Column(name = "sala")
    private String sala;

    @ManyToOne
    @JoinColumn(name = "turma_id")
    private Turma turma;

    @ElementCollection
    @CollectionTable(name = "dias_semana", joinColumns = @JoinColumn(name = "aula_id"))
    @Column(name = "dia")
    private List<String> diasSemana;

    @Column(name = "horario")
    private String horario;

    // Construtor
    public Aula(Curso curso, Disciplina disciplina, Professor professor, String sala, List<String> diasSemana, String horario) {
        this.curso = curso;
        this.disciplina = disciplina;
        this.professor = professor;
        this.sala = sala;
        this.diasSemana = diasSemana;
        this.horario = horario;

        // Adicionar a aula à disciplina
        disciplina.adicionarAula(this);
    }

    // Getters e Setters
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public List<String> getDiasSemana() {
        return diasSemana;
    }

    public void setDiasSemana(List<String> diasSemana) {
        this.diasSemana = diasSemana;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    // Método toString
    @Override
    public String toString() {
        return "Aula{" +
                "curso=" + curso +
                ", disciplina=" + disciplina +
                ", professor=" + professor +
                ", sala='" + sala + '\'' +
                ", diasSemana=" + diasSemana +
                ", horario='" + horario + '\'' +
                '}';
    }
}
