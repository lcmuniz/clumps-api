package com.eficaztech.clumps.desafiorealizado;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("desafio-realizado")
@RequiredArgsConstructor
public class DesafioRealizadoController {

    private final DesafioRealizadoService desafioRealizadoService;

    @GetMapping("find-all-by-email/{email}")
    public List<DesafioRealizado> findByEmail(@PathVariable String email) {
        return  desafioRealizadoService.findAllByEmail(email);
    }

    @PostMapping("save")
    public void save(@RequestBody DesafioRealizado desafioRealizado) {
        desafioRealizadoService.save(desafioRealizado);
    }
}
