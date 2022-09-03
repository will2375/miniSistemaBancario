package com.controleConta.saqueEdeposito.controller;

import com.controleConta.saqueEdeposito.Model.CalcularSaldo.ContaFactory;
import com.controleConta.saqueEdeposito.Model.ContaModel;
import com.controleConta.saqueEdeposito.Model.SaldoModel;
import com.controleConta.saqueEdeposito.service.SaldoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SaldoController {

    @Autowired
    SaldoService saldoService;

    @GetMapping(path = "/saldo")
    public List<SaldoModel>buscarTodasOperacoes(){return saldoService.buscarSaldos();}

    @GetMapping(path = "saldo/{codigo}")
    public Optional<SaldoModel>buscarPorId(@PathVariable Long codigo){return saldoService.buscaId(codigo);}

    @GetMapping(path = "/saldo/operacao/{operacao}")
    public List<SaldoModel> buscarPorOperacao(@PathVariable String operacao){ return saldoService.buscarOperacao(operacao);}

    @PostMapping(path = "/saldo")
    @ResponseStatus(HttpStatus.CREATED)
    public SaldoModel mudarSaldo(@RequestBody SaldoModel saldoModel, ContaFactory contaFactory){return saldoService.alterarConta(saldoModel, contaFactory);}
}
