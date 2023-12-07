package com.vendas.vendas.service;

import com.vendas.vendas.model.Cliente;
import com.vendas.vendas.model.Cliente;
import com.vendas.vendas.model.Funcionario;
import com.vendas.vendas.repository.ClienteRepository;
import com.vendas.vendas.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> getCliente() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> getClienteById(Long id) {
        return clienteRepository.findById(id);
    }

    public String delete(Long id) throws Exception {
        clienteRepository.deleteById(id);
        if (getClienteById(id).isEmpty()) {
            return "Usuario Deletado com sucesso";
        } else {
            throw new Exception("falha ao deletar");
        }

    }
}
