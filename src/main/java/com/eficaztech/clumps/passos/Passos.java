package com.eficaztech.clumps.passos;

import com.eficaztech.clumps.usuario.Usuario;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(schema = "lcmuniz")
@Data
public class Passos {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long passosId;
    @ManyToOne
    @JoinColumn(name = "email")
    private Usuario usuario;
    private Integer passos;
    private LocalDate data;
}
