package com.controleConta.saqueEdeposito.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Table(name = "contas_banco")
public class ContaModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(length = 10, nullable = false)
    private  String conta;
    @Column(length = 10, nullable = false)
    private  String status;
    @Column(length = 50, nullable = false)



    @JsonIgnore
    @OneToMany(mappedBy = "contaModel", cascade = CascadeType.ALL)
    private List<SaldoModel> saldoModel;




}
