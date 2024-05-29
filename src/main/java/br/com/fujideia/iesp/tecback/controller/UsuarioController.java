package br.com.fujideia.iesp.tecback.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.com.fujideia.iesp.tecback.model.Usuario;
import br.com.fujideia.iesp.tecback.service.UsuarioService;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public Usuario cadastrarUsuario(@RequestBody Usuario usuario) { // O @RequestBody indica que o objeto usuário será preenchido com os dados do corpo da requisição HTTP POST.
        return usuarioService.cadastrarUsuario(usuario);
    }

    @GetMapping // Listar todos usuarios
    public List<Usuario> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> atualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
        // Verificar se o usuário existe
        if (!usuarioService.usuarioRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        // Atualizar usuário
        usuario.setId(id); // Certificar que o ID do caminho está usado
        Usuario usuarioAtualizado = usuarioService.atualizarUsuario(usuario);
        return ResponseEntity.ok(usuarioAtualizado);
    }

}

