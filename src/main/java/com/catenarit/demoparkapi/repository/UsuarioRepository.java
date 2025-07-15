package com.catenarit.demoparkapi.repository;

import com.catenarit.demoparkapi.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


}
