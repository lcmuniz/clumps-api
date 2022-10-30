package com.eficaztech.clumps.usuario;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.Optional;
import java.util.function.Predicate;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public Optional<Usuario> findByEmail(String email) {
        return usuarioRepository.findById(email);
    }

    @Transactional
    public Optional<Usuario> findByEmail(String email, String nome) {
        try {
            val opt = usuarioRepository.findById(email);
            if (opt.isPresent()) return opt;
            val versao = new Date().getTime() % 2 == 0 ? "INTERVENCAO" : "CONTROLE";
            usuarioRepository.insertUsuario(email, nome, versao);
            usuarioRepository.insertDesafios(email);
            usuarioRepository.insertRespostas(email);
            return usuarioRepository.findById(email);
        }
        catch(Exception e) {
            return Optional.empty();
        }
    }

    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Posicao getPosicao(String email) {
        val posicoes = usuarioRepository.getAllByPosicao();

        Predicate<Posicao> filter = posicao -> posicao.getEmail().equals(email);
        val first = posicoes.stream().filter(filter).findFirst();
        return first.orElse(null);

    }

}
