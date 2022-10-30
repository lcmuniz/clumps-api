package com.eficaztech.clumps.desafiorealizado;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DesafioRealizadoService {

    private final DesafioRealizadoRepository desafioRepository;

    public List<DesafioRealizado> findAllByEmail(String email) {
        return desafioRepository.findAllByEmail(email);
    }

    public DesafioRealizado save(DesafioRealizado desafio) {
        return desafioRepository.save(desafio);
    }
}
