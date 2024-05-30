package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Cartao;
import br.com.fujideia.iesp.tecback.repository.CartaoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CartaoService {

    @Autowired
    private CartaoRepository cartaoRepository;

    //Criar novo cartao
    public Cartao criar(Cartao cartao){
        return cartaoRepository.save(cartao);
    }

    public Cartao atualizar(Cartao cartao){
        //verificando se é um cartão existente
        if (cartao.getId()==null){
            throw new RuntimeException("Cartão não existente ou sem ID");
        }
        return cartaoRepository.save(cartao);
    }

    public List<Cartao> listarTodos(){
        return cartaoRepository.findAll();
    }

}
