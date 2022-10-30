package com.eficaztech.clumps.usuario;

import com.eficaztech.clumps.enums.Sexo;
import com.eficaztech.clumps.enums.SituacaoConjugal;
import com.eficaztech.clumps.nivel.Nivel;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(schema = "lcmuniz")
@Data
public class Usuario {
    @Id
    private String email;
    private String avatar;
    private String altura;
    private Integer anosEstudo;
    private String cep;
    private String cpf;
    private LocalDate dataNascimento;
    @ManyToOne
    @JoinColumn(name = "nivel_id")
    private Nivel nivel;
    private String nome;
    private String numeroEndereco;
    private Boolean perfilCompleto;
    private String peso;
    private Sexo sexo;
    private SituacaoConjugal situacaoConjugal;
    private String telefone;
    private Boolean temFilhos;
    private String versao = "COMPLETA";
    private Boolean questionarioPreenchido = false;
    private String expoToken;
}
