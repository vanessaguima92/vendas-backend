package com.vendas.vendas.rest;

import com.vendas.vendas.model.Funcionario;
import com.vendas.vendas.model.Produtos;
import com.vendas.vendas.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioRest {
    @Autowired
    FuncionarioService funcionarioService;
    @PostMapping("/salvar")
    public Object salvar(@RequestBody Funcionario f){
        return funcionarioService.salvar(f);
    }

    @GetMapping
    public List<Funcionario> getFuncionario(){
        return funcionarioService.getFuncionarios();
    }

    @GetMapping("/{id}")
    public Optional<Funcionario> getFuncionarioById(@PathVariable Long id){
        return funcionarioService.getFuncionariosById(id);
    }

    @DeleteMapping("/{id}")
    public String delete (@PathVariable Long id)throws Exception {
        return funcionarioService.delete(id);
    }
}
