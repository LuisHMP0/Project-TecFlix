package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.Cartao;
import br.com.fujideia.iesp.tecback.service.CartaoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/cartao")
public class CartaoController {

    @Autowired
    private CartaoService cartaoService;

    //Criando cartão novo
    @PostMapping
    public Cartao criar(@RequestBody Cartao cartao){
        return cartaoService.criar(cartao);
    }

    // Atualizando cartão existente
    @PutMapping
    public Cartao atualizar(@RequestBody Cartao cartao){
        return cartaoService.atualizar(cartao);
    }


    // Listar todos cartões
    @GetMapping
    public List<Cartao> listarTodos(){
        return cartaoService.listarTodos();
    }

    // Buscando por id
    @GetMapping("/{id}")
    public Cartao buscarPorId(@PathVariable Integer id){
        return cartaoService.buscarPorId(id);
    }

    // Deletando cartao por id
    @DeleteMapping("/{id}")
    public void excluirPorId(@PathVariable Integer id){
        cartaoService.excluir(id);
    }
}
