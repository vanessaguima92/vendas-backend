package com.vendas.vendas.service;

import com.vendas.vendas.model.Funcionario;
import com.vendas.vendas.model.Produtos;
import com.vendas.vendas.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {
    @Autowired
    FuncionarioRepository funcionarioRepository;

    public Funcionario salvar (Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }

    public List<Funcionario> getFuncionarios(){
        return  funcionarioRepository.findAll();
    }

    public Optional<Funcionario> getFuncionariosById(Long id){
        return funcionarioRepository.findById(id);
    }

    public String delete(Long id) throws Exception {
        funcionarioRepository.deleteById(id);
        if(getFuncionariosById(id).isEmpty()){
            return "Usuario Deletado com sucesso";
        }else {
            throw new Exception("falha ao deletar");
        }
    }
}
