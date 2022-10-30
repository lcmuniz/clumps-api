package com.eficaztech.clumps.passos;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PassosRepository extends JpaRepository<Passos, Long> {

    List<Passos> findAllByUsuario_Email(String email);

}
