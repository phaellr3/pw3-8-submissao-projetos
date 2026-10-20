package br.com.etec.joao.raphaelLuis.submissao.projeto.entity;

import br.com.etec.joao.raphaelLuis.submissao.projeto.enums.StatusEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_PROJETO")
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PROJETO")
    private Long id;

    @Column(name = "TX_TITULO")
    private String titulo;

    @Column(name = "TX_AREA_CONHECIMENTO")
    private String areaConhecimento;

    @Column(name = "NR_NOTA_INOVACAO")
    private Double notaInovacao;

    @Column(name = "NR_NOTA_APRESENTACAO")
    private Double notaApresentacao;

    @Column(name = "NR_MEDIA_FINAL")
    private Double mediaFinal;

    @Column(name = "TP_STATUS")
    private StatusEnum status;
}
