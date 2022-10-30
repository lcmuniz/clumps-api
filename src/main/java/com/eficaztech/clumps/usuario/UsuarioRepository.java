package com.eficaztech.clumps.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    @Query(value = "select row_number() over (order by sum(pontos) desc) posicao, email, sum(pontos) pontos from lcmuniz.desafio_realizado dr join lcmuniz.desafio d on d.desafio_id = dr.desafio_id group by email", nativeQuery = true)
    List<Posicao> getAllByPosicao();

    @Transactional
    @Modifying
    @Query(value = "insert into lcmuniz.usuario (email, nome, anos_estudo, perfil_completo, sexo, situacao_conjugal, tem_filhos, nivel_id, versao, questionario_preenchido) values (:email, :nome, 0, false, 0, 0, false, 1, :versao, false)", nativeQuery = true)
    void insertUsuario(String email, String nome, String versao);

    @Transactional
    @Modifying
    @Query(value = "insert into lcmuniz.desafio (agendado_para, realizado_em, atividade_id, email) select agendado_para, realizado_em, atividade_id, :email from lcmuniz.desafio_branco db", nativeQuery = true)
    void insertDesafios(String email);

    @Transactional
    @Modifying
    @Query(value = "insert into lcmuniz.resposta (email, data_resposta,escolhida01,escolhida02,escolhida03,escolhida04,escolhida05,escolhida06,escolhida07,escolhida08,escolhida09,escolhida10,escolhida11,escolhida12,escolhida13,escolhida14,escolhida15,escolhida16,escolhida17,escolhida18,escolhida19,escolhida20,resposta,pergunta_id) select :email, data_resposta,escolhida01,escolhida02,escolhida03,escolhida04,escolhida05,escolhida06,escolhida07,escolhida08,escolhida09,escolhida10,escolhida11,escolhida12,escolhida13,escolhida14,escolhida15,escolhida16,escolhida17,escolhida18,escolhida19,escolhida20,resposta,pergunta_id from lcmuniz.resposta_branco rb", nativeQuery = true)
    void insertRespostas(String email);

}
