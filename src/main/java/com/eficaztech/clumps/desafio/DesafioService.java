package com.eficaztech.clumps.desafio;

import com.eficaztech.clumps.usuario.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DesafioService {

    private final DesafioRepository desafioRepository;

    public List<Desafio> findAllByUsuario(Usuario usuario) {
        return desafioRepository.findAllByUsuario(usuario);
    }

    public List<Desafio> savelAll(List<Desafio> desafios) {
        return desafioRepository.saveAll(desafios);
    }

    public Desafio save(Desafio desafio) {
        return desafioRepository.save(desafio);
    }
}
