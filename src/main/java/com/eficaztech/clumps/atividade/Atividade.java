package com.eficaztech.clumps.atividade;

import com.eficaztech.clumps.enums.Dominio;
import com.eficaztech.clumps.nivel.Nivel;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(schema = "lcmuniz")
@Data
public class Atividade {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long atividadeId;
    private String titulo;
    private Dominio dominio;
    @ManyToOne
    @JoinColumn(name = "nivel_id")
    private Nivel nivel;
    private Integer imagem;
}
