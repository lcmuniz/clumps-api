package com.eficaztech.clumps.resposta;

import com.eficaztech.clumps.usuario.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("resposta")
@RequiredArgsConstructor
public class RespostaController {

    private final RespostaService respostaService;

    @GetMapping("find-all-by-email/{email}")
    public List<Resposta> findByEmail(@PathVariable String email) {
        val usuario = new Usuario();
        usuario.setEmail(email);
        return  respostaService.findAllByUsuario(usuario);
    }

    @PostMapping("save-all")
    public void saveAll(@RequestBody List<Resposta> respostas) {
        respostaService.savelAll(respostas);
    }

    @PostMapping("save")
    public void save(@RequestBody Resposta resposta) {
        respostaService.save(resposta);
    }

}
