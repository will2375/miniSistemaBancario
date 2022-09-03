package com.controleConta.saqueEdeposito.Model.CalcularSaldo;



public class ContaFactory {
    public Calculo alterarSaldo(String metodo){
        if(metodo.equalsIgnoreCase("saque")){
            return new Saque();
        } else if (metodo.equalsIgnoreCase("deposito")) {
            return new Deposito();
        }
        return null;
    }
}
