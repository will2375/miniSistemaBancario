package com.controleConta.saqueEdeposito.repository;

import com.controleConta.saqueEdeposito.Model.ContaModel;
import com.controleConta.saqueEdeposito.Model.SaldoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SaldoRepository extends JpaRepository<SaldoModel, Long> {

    public List<SaldoModel> findByOperacao (String operacao);

}
