package com.vendas.vendas.rest;

import com.vendas.vendas.model.Cliente;
import com.vendas.vendas.model.Funcionario;
import com.vendas.vendas.service.ClienteService;
import com.vendas.vendas.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteRest {
    @Autowired
    ClienteService clienteService;
    @PostMapping("/salvar")
    public Object salvar(@RequestBody Cliente cliente){return clienteService.salvar(cliente);}

    @GetMapping
    public List<Cliente> getCliente() { return clienteService.getCliente(); }

    @GetMapping("/{id}")
    public Optional<Cliente> getClienteById(@PathVariable Long id){
        return clienteService.getClienteById(id);
    }

    @DeleteMapping("/{id}")
    public String delete (@PathVariable Long id)throws Exception {
        return clienteService.delete(id);
    }
}
