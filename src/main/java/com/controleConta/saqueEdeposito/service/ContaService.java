package com.controleConta.saqueEdeposito.service;

import com.controleConta.saqueEdeposito.Model.CalcularSaldo.ContaFactory;
import com.controleConta.saqueEdeposito.Model.ContaModel;
import com.controleConta.saqueEdeposito.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ContaService {

    @Autowired
    private ContaRepository contaRepository;

    public List<ContaModel> ListaDeContas() {
        return contaRepository.findAll();
    }

    public Optional<ContaModel> buscatId(Long codigo) {
        return contaRepository.findById(codigo);
    }

    public  List<ContaModel> buscarStatus(String status){return contaRepository.findByStatus(status);}

    public ContaModel cadastrar(ContaModel contaModel) {
        contaModel.getCodigo();
        contaModel.getConta();
        contaModel.setStatus("Ativa");
        return contaRepository.save(contaModel);
    }

    public ContaModel alterarStatus(ContaModel contaModel){
        contaModel.getCodigo();
        contaModel.getConta();
        contaModel.getStatus();
        return contaRepository.save(contaModel);
    }
}
