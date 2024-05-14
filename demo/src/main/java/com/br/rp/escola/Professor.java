package com.br.rp.escola;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "professor")
public class Professor extends Pessoa {

    @Id
    @Column(name = "no_contrato")
    private String noContrato;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "data_contratacao")
    private Date dataContratacao;

    @Column(name = "salario")
    private double salario;


    // Construtor padrão
    public Professor() {
    }

    // Construtor com todos os atributos de Pessoa e Professor
    public Professor(String nome, String email, String telefone, String rua, String bairro,
                     String cidade, String estado, String noContrato, String titulo,
                     Date dataContratacao, double salario){
        super(nome, email, telefone, rua, bairro, cidade, estado);
        this.noContrato = noContrato;
        this.titulo = titulo;
        this.dataContratacao = dataContratacao;
        this.salario = salario;
    }

    //  Getters para Professor
    public String getNoContrato() {
        return noContrato;
    }

    public String getTitulo() {
        return titulo;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public double getSalario() {
        return salario;
    }

    // Setters para Professor


    public void setNoContrato(String noContrato) {
        this.noContrato = noContrato;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "noContrato='" + noContrato + '\'' +
                ", titulo='" + titulo + '\'' +
                ", dataContratacao=" + dataContratacao +
                ", salario=" + salario +
                '}';
    }
}

