package com.controleConta.saqueEdeposito.Model.CalcularSaldo;

import java.math.BigDecimal;

public class Saque implements Calculo{

    @Override
    public BigDecimal calculo(BigDecimal saldo, BigDecimal valor) {
        BigDecimal resultado= saldo.subtract(valor);
        return resultado;
    }
}
