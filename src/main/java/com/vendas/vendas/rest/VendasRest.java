package com.vendas.vendas.rest;

import com.vendas.vendas.model.Cliente;
import com.vendas.vendas.model.Vendas;
import com.vendas.vendas.service.VendasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vendas")
public class VendasRest {

    @Autowired
    VendasService vendasService;
    @PostMapping("/salvar")
    public Object salvar(@RequestBody Vendas vendas) throws Exception {return vendasService.salvar(vendas);}

    @GetMapping
    public List<Vendas> getVendas() { return vendasService.getVendas(); }

    @GetMapping("/{id}")
    public Optional<Vendas> getVendasById(@PathVariable Long id){
        return vendasService.getVendasById(id);
    }
}
