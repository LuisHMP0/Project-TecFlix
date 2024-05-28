package br.com.fujideia.iesp.tecback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fujideia.iesp.tecback.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
