package com.controleConta.saqueEdeposito.repository;

import com.controleConta.saqueEdeposito.Model.ContaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContaRepository extends JpaRepository<ContaModel, Long> {

    public List<ContaModel> findByStatus (String status);
}
