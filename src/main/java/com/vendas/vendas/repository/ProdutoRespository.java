package com.vendas.vendas.repository;

import com.vendas.vendas.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRespository extends JpaRepository<Produtos, Long> {
}
