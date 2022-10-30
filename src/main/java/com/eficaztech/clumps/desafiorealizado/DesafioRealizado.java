package com.eficaztech.clumps.desafiorealizado;

import com.eficaztech.clumps.desafio.Desafio;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(schema = "lcmuniz")
@Data
public class DesafioRealizado {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long desafioRealizadoId;
    @ManyToOne
    @JoinColumn(name = "desafio_id")
    private Desafio desafio;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime realizadoEm;
    private Integer minutos;
    private Integer pontos;
}
