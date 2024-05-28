package br.com.fujideia.iesp.tecback.service;

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

    public Usuario cadastrarUsuario(Usuario usuario) {
        // Aqui você pode adicionar lógica de validação, como verificar se o usuário já existe, etc.
        // Por exemplo:
        // if (usuarioRepository.findByEmail(usuario.getEmail()).isPresent()) {
        //    throw new RuntimeException("Usuário com o email fornecido já existe");
        // }
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listarUsuarios() { return usuarioRepository.findAll(); }

    public Usuario buscarUsuarioPorId(Long id) {
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);
        return usuarioOptional.orElse(null); // ou lançar uma exceção caso não encontre
    }

    public Usuario atualizarUsuario(Usuario usuario) {
        // Aqui você pode adicionar lógica para verificar se o usuário existe antes de atualizá-lo
        return usuarioRepository.save(usuario);
    }

    public void excluirUsuario(Long id) { usuarioRepository.deleteById(id); }
}

