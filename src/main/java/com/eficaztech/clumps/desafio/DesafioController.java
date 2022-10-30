package com.eficaztech.clumps.desafio;

import com.eficaztech.clumps.usuario.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("desafio")
@RequiredArgsConstructor
public class DesafioController {

    private final DesafioService desafioService;

    @GetMapping("find-all-by-email/{email}")
    public List<Desafio> findByEmail(@PathVariable String email) {
        val usuario = new Usuario();
        usuario.setEmail(email);
        return  desafioService.findAllByUsuario(usuario);
    }

    @PostMapping("save-all")
    public void saveAll(@RequestBody List<Desafio> desafios) {
        desafioService.savelAll(desafios);
    }

    @PostMapping("save")
    public void save(@RequestBody Desafio desafio) {
        desafioService.save(desafio);
    }
}
