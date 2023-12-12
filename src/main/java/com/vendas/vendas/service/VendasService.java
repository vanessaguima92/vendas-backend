package com.vendas.vendas.service;

import com.vendas.vendas.model.Vendas;
import com.vendas.vendas.repository.ClienteRepository;
import com.vendas.vendas.repository.FuncionarioRepository;
import com.vendas.vendas.repository.ProdutoRespository;
import com.vendas.vendas.repository.VendasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendasService {

    @Autowired
    VendasRepository vendasRepository;

    @Autowired
    FuncionarioRepository funcionarioRepository;
    @Autowired
    ClienteRepository clienteRepository;



    @Autowired
    ProdutoRespository produtoRespository;

    public Vendas salvar(Vendas vendas) throws Exception {
        if (verificaVenda(vendas)) {
            return vendasRepository.save(vendas);
        }
        throw new Exception("Vendas náo efetuada: Campos Funcionario/Cliente/Produto inavalido");
    }

    public List<Vendas> getVendas() {
        return vendasRepository.findAll();
    }

    public Optional<Vendas> getVendasById(Long id) {
        return vendasRepository.findById(id);
    }

    private Boolean verificaVenda (Vendas vendas) {
        return funcionarioRepository.existsById(vendas.getIdFuncionario())
                && clienteRepository.existsById(vendas.getIdCliente())
                && produtoRespository.existsById(vendas.getIdProduto());
    }

}
