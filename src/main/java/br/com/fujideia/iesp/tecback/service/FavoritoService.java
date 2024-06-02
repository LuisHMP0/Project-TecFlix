package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Favorito;
import br.com.fujideia.iesp.tecback.repository.FavoritoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class FavoritoService {

    private FavoritoRepository repository;

    public Favorito salvar(Favorito favorito) {
        return repository.save(favorito);
    }

    public List<Favorito> listarTodos() {
        return repository.findAll();
    }
}
