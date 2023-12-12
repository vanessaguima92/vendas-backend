package com.vendas.vendas.repository;

import com.vendas.vendas.model.Cliente;
import com.vendas.vendas.model.Vendas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendasRepository extends JpaRepository<Vendas,Long> {
}
