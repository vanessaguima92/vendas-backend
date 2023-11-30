package com.vendas.vendas.service;

import com.vendas.vendas.model.Produtos;
import com.vendas.vendas.repository.ProdutoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRespository produtoRespository;
    public Produtos salvar(Produtos produtos) throws Exception {
        if(produtos.getNome() != null || produtos.getQuantidade() !=null){
            return produtoRespository.save(produtos);
        }else{
            throw new Exception("Produto esta nullo");
        }

    }

    public List<Produtos> getProdutos(){
        return produtoRespository.findAll();
    }

    public Optional<Produtos> getProdutosById(Long id){
        return produtoRespository.findById(id);
    }

    public String delete(Long id) throws Exception {
        produtoRespository.deleteById(id);

        if(getProdutosById(id).isEmpty()){
            return "Usuario Deletado com sucesso";
        }else {
            throw new Exception("falha ao deletar");
        }
    }
}
