package com.eficaztech.clumps.passos;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PassosService {

    private final PassosRepository passosRepository;

    public void savelAll(List<Passos> passos) {
        if (passos.isEmpty()) return;
        val passosFrmDb = passosRepository.findAllByUsuario_Email(passos.get(0).getUsuario().getEmail());
        val datasFromDb = passosFrmDb.stream().map(Passos::getData).collect(Collectors.toList());
        val novosPassos = passos.stream().filter(p -> !datasFromDb.contains(p.getData()))
                .filter(p -> p.getPassos() > 0)
                .collect(Collectors.toList());
        passosRepository.saveAll(novosPassos);
    }

}
