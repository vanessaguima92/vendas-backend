package com.vendas.vendas.repository;

import com.vendas.vendas.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository <Funcionario,Long> {

}
