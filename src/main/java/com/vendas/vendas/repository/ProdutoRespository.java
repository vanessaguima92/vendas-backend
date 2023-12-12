package com.vendas.vendas.repository;

import com.vendas.vendas.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ProdutoRespository extends JpaRepository<Produtos, Long> {


    Optional<Produtos> findByNome(String nome);
}
