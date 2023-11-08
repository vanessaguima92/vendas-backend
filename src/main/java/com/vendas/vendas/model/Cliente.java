package com.vendas.vendas.model;

import jakarta.persistence.*;

@Entity
@Table (name="clientes")
public class Cliente {

    @Id
    @GeneratedValue
    @Column (name = "id")
    private Long id;


    @Column(name = "nome")
    private String nome;

    @Column (name = "email")
    private String email;

    @Column (name = "cpf")
    private String cpf;

    @Column (name = "telefone")
    private String telefone;

    @Column (name = "idade")
    private Integer idade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
