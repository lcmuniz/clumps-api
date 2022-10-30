package com.eficaztech.clumps.desafio;

import com.eficaztech.clumps.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DesafioRepository extends JpaRepository<Desafio, Long> {

    List<Desafio> findAllByUsuario(Usuario usuario);

}
