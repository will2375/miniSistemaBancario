package com.controleConta.saqueEdeposito.Model.CalcularSaldo;

import java.math.BigDecimal;

public interface Calculo {
    BigDecimal calculo(BigDecimal saldo, BigDecimal valor);
}
