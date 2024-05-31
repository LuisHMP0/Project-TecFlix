package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Serie;
import br.com.fujideia.iesp.tecback.repository.SerieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service

public class SerieService {

    private SerieRepository repository;

    public Serie salvar(Serie serie){
        return repository.save(serie);
    }

    public static List<Serie> listarTodos(){
        return SerieService.findAll();
    }

    private static List<Serie> findAll() {
        return null;
    }

    public Serie atualizar(Serie serie){
        if(serie.getId() == null){
            throw new RuntimeException("Serie sem ID");
        }
        return repository.save(serie);
    }

    public Serie buscarPorId(Integer id) {
        return null;
    }

    public void excluir(Integer id){
        SerieRepository.deleteById(id);
    }


}
