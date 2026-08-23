package io.github.marcos.ridehouse.repository;

import io.github.marcos.ridehouse.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
