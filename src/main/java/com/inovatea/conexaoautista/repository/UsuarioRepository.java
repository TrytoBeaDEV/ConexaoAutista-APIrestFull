package com.inovatea.conexaoautista.repository;
import com.inovatea.conexaoautista.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {}

