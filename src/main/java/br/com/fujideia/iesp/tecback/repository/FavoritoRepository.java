package br.com.fujideia.iesp.tecback.repository;

import br.com.fujideia.iesp.tecback.model.Favorito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoritoRepository extends JpaRepository<Favorito, Integer> {
}
