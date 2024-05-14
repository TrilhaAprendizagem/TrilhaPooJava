package com.br.rp.escola;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Pessoa {

    private String nome;
    private String email;
    private String telefone;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;

    // Construtor padrão
    public Pessoa() {
    }

    // Construtor com todos os atributos
    public Pessoa(String nome, String email, String telefone, String rua, String bairro, String cidade, String estado) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
