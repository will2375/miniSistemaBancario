package com.controleConta.saqueEdeposito.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "extrato")
public class SaldoModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column
    private BigDecimal valor;
    @Column
    private BigDecimal saldo;
    @Column
    private String operacao;


    @ManyToOne
    @JoinColumn(name = "saldo_id", referencedColumnName = "codigo")
    private ContaModel contaModel;
}
