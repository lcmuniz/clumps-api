package com.eficaztech.clumps.resposta;

import com.eficaztech.clumps.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RespostaRepository extends JpaRepository<Resposta, Long> {

    List<Resposta> findAllByUsuario(Usuario usuario);

}
