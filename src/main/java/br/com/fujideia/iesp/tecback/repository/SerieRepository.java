package br.com.fujideia.iesp.tecback.repository;

import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fujideia.iesp.tecback.model.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SerieRepository extends JpaRepository<Serie, Long> {

    static void deleteById(Integer id) {
    }

    List<Serie> findByTituloAndDescricao(String titulo, String descricao);
    List<Serie> findByTitulo(String titulo);
    List<Serie> findByTituloOrderByTituloAsc(String titulo);




}
