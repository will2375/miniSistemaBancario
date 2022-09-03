package com.controleConta.saqueEdeposito.Model.CalcularSaldo;

import java.math.BigDecimal;

public class Deposito  implements Calculo{
    @Override
    public BigDecimal calculo(BigDecimal saldo, BigDecimal valor) {
        BigDecimal resultado= saldo.add(valor);
        return resultado;
    }
}
