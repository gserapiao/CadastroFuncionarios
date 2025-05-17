package com.gustavo.CadastroDeFuncionarios;

import jakarta.persistence.*;

// JPA = Java Persistence API
@Entity // Entity ele transforma uma classe em uma entidade do BD
@Table(name = "tb_cadastro")
public class FuncionarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO.IDENTITY)
    Long id;
    String nome;
    String cargo;
    String email;
    String telefone;

    public FuncionarioModel() {
    }

    public FuncionarioModel(String nome, String cargo, String email, String telefone) {
        this.nome = nome;
        this.cargo = cargo;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmail() {
        return email;
    }

    public void setEndereco(String endereco) {
        this.email = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
