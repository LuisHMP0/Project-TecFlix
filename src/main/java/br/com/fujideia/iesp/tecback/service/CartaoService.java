package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Cartao;
import br.com.fujideia.iesp.tecback.repository.CartaoRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CartaoService {

    @Autowired
    private CartaoRepository cartaoRepository;

    public Cartao criar(Cartao cartao){
        return cartaoRepository.save(cartao);
    }

    public Cartao atualizar(Cartao cartao){
        // Verifica se o cartão existe com base no número
        if (cartao.getNumero() == null || !cartaoRepository.existsById(cartao.getNumero())) {
            throw new EntityNotFoundException("Cartão não encontrado ou número de cartão inválido: " + cartao.getNumero());
        }
        return cartaoRepository.save(cartao);
    }

    public List<Cartao> listarTodos(){
        return cartaoRepository.findAll();
    }

    public Cartao buscarPorId(Integer id){
        return cartaoRepository.findById(String.valueOf(id)).get();
    }

    public void deletarCartao(Integer id){
        cartaoRepository.deleteById(String.valueOf(id));
    }

    public void excluir(Integer id) {
    }
}
