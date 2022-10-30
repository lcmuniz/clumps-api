package com.eficaztech.clumps.desafiorealizado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DesafioRealizadoRepository extends JpaRepository<DesafioRealizado, Long> {

    @Query("select dr from DesafioRealizado dr where dr.desafio.usuario.email = :email")
    List<DesafioRealizado> findAllByEmail(String email);

}
