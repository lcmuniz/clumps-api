package com.eficaztech.clumps.resposta;

import com.eficaztech.clumps.usuario.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RespostaService {

    private final RespostaRepository respostaRepository;

    public List<Resposta> findAllByUsuario(Usuario usuario) {
        return respostaRepository.findAllByUsuario(usuario);
    }

    public List<Resposta> savelAll(List<Resposta> respostas) {
        return respostaRepository.saveAll(respostas);
    }

    public Resposta save(Resposta resposta) {
        return respostaRepository.save(resposta);
    }

}
