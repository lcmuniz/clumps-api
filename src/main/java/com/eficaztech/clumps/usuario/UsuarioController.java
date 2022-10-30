package com.eficaztech.clumps.usuario;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @GetMapping("versao")
    public String versao() {
        return "1.0";
    }

    @GetMapping("find-by-email/{email}")
    public Optional<Usuario> findByEmail(@PathVariable String email) {
        return  usuarioService.findByEmail(email);
    }

    @GetMapping("find-by-email/{email}/{nome}")
    public Optional<Usuario> findByEmail2(@PathVariable String email, @PathVariable String nome) {

        return  usuarioService.findByEmail(email, nome);
    }

    @PostMapping("save")
    public void save(@RequestBody Usuario usuario) {
        usuarioService.save(usuario);
    }

    @GetMapping("posicao/{email}")
    public Posicao posicao(@PathVariable String email) {
        return usuarioService.getPosicao(email);
    }

}
