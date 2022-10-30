package com.eficaztech.clumps.passos;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("passos")
@RequiredArgsConstructor
public class PassosController {

    private final PassosService passosService;

    @PostMapping("save-all")
    public void saveAll(@RequestBody List<Passos> passos) {
        passosService.savelAll(passos);
    }

}
