package com.controleConta.saqueEdeposito.service;

import com.controleConta.saqueEdeposito.Model.CalcularSaldo.ContaFactory;
import com.controleConta.saqueEdeposito.Model.ContaModel;
import com.controleConta.saqueEdeposito.Model.SaldoModel;
import com.controleConta.saqueEdeposito.repository.SaldoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class SaldoService {

    @Autowired
    SaldoRepository saldoRepository;


    public List<SaldoModel> buscarSaldos(){return saldoRepository.findAll();}

    public Optional<SaldoModel>buscaId(Long codigo){return saldoRepository.findById(codigo);}

    public  List<SaldoModel> buscarOperacao(String operacao){return saldoRepository.findByOperacao(operacao);}


    public SaldoModel alterarConta(SaldoModel saldoModel, ContaFactory contaFactory) {
        BigDecimal servico= contaFactory.alterarSaldo(saldoModel.getOperacao()).calculo(saldoModel.getSaldo(),saldoModel.getValor());
        saldoModel.getCodigo();
        saldoModel.getOperacao();
       saldoModel.getValor();
        saldoModel.setSaldo(servico);
        return saldoRepository.save(saldoModel);
    }
}
