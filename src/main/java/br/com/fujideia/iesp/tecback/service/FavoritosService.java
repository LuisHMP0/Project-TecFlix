package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Favoritos;
import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.model.Serie;
import br.com.fujideia.iesp.tecback.model.Usuario;
import br.com.fujideia.iesp.tecback.repository.FavoritosRepository;
import br.com.fujideia.iesp.tecback.repository.FilmeRepository;
import br.com.fujideia.iesp.tecback.repository.SerieRepository;
import br.com.fujideia.iesp.tecback.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoritosService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private FilmeRepository filmeRepository;

    @Autowired
    private SerieRepository serieRepository;

    @Autowired
    private FavoritosRepository favoritosRepository;

    public Favoritos adicionarFilmeAFavoritos(Long usuarioId, Long filmeId) {
        Usuario usuario = usuarioRepository.findById(usuarioId).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        Filme filme = filmeRepository.findById(Math.toIntExact(filmeId)).orElseThrow(() -> new RuntimeException("Filme não encontrado"));

        Favoritos favorito = new Favoritos();
        favorito.setUsuario(usuario);
        favorito.setFilme(filme);

        return favoritosRepository.save(favorito);
    }

    public Favoritos adicionarSerieAFavoritos(Long usuarioId, Long serieId) {
        Usuario usuario = usuarioRepository.findById(usuarioId).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        Serie serie = serieRepository.findById(Math.toIntExact(serieId)).orElseThrow(() -> new RuntimeException("Série não encontrada"));

        Favoritos favorito = new Favoritos();
        favorito.setUsuario(usuario);
        favorito.setSerie(serie);

        return favoritosRepository.save(favorito);
    }

    public void deletarFavoritoPorId(Integer favoritoId) {
        favoritosRepository.deleteById(Long.valueOf(favoritoId));
    }

    public List<Favoritos> listarTodosFavoritosPorUsuario(Long usuarioId) {
        Usuario usuario = usuarioRepository.findById(usuarioId)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        return favoritosRepository.findByUsuario(usuario);
    }
}
