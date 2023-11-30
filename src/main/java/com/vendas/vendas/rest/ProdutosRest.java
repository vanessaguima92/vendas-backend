package com.vendas.vendas.rest;

import com.vendas.vendas.model.Produtos;
import com.vendas.vendas.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProdutosRest {

    @Autowired
    ProdutoService produtoService;

    @PostMapping("/salvar")
    public Object salvarProduto(@RequestBody Produtos produtos)throws Exception{
        try {
            return produtoService.salvar(produtos);
        }catch (Exception e){
            return e.getMessage();
        }

    }

    @GetMapping("/produto")
    public List<Produtos> getProduto(){
        return produtoService.getProdutos();
    }

    @GetMapping("produto/{id}")
    public Optional<Produtos> getProdutoById(@PathVariable Long id){
       return produtoService.getProdutosById(id);
    }

    @DeleteMapping("produtos/{id}")
    public String delete (@PathVariable Long id)throws Exception {
        return produtoService.delete(id);
    }
}
