package br.com.fujideia.iesp.tecback.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.fujideia.iesp.tecback.model.Usuario;
import br.com.fujideia.iesp.tecback.repository.UsuarioRepository;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario cadastrarUsuario(Usuario usuario) { return usuarioRepository.save(usuario); }

    public List<Usuario> listarUsuarios() { return usuarioRepository.findAll(); }

    public Usuario buscarUsuarioPorId(Long id) { return usuarioRepository.findById(id).get(); }

    public Usuario atualizarUsuario(Usuario usuario) { return usuarioRepository.save(usuario); }

    public void excluirUsuario(Long id) { usuarioRepository.deleteById(id); }
}

