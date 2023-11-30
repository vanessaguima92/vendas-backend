package com.vendas.vendas.model;

import jakarta.persistence.*;

@Entity
@Table(name="venda")
public class Vendas {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name="id_produto")
    private Long idProduto;

    @Column(name="id_funcionario")
    private Long idFuncionario;

    @Column(name= "id_cliente")
    private  Long idCliente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public Long getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Long idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }
}
