package com.controleConta.saqueEdeposito.controller;


import com.controleConta.saqueEdeposito.Model.CalcularSaldo.ContaFactory;
import com.controleConta.saqueEdeposito.Model.ContaModel;
import com.controleConta.saqueEdeposito.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContaController {

    @Autowired
    private ContaService contaService;

    @GetMapping(path = "/contas")
    public List<ContaModel> buscarContas() {return contaService.ListaDeContas();}

    @GetMapping(path = "/contas/{codigo}")
    public Optional<ContaModel> buscarPorId(@PathVariable Long codigo){return contaService.buscatId(codigo);}

    @GetMapping(path = "/contas/status/{status}")
    public List<ContaModel> buscarPorStatus(@PathVariable String status){ return contaService.buscarStatus(status);}

    @PostMapping(path = "/contas")
    @ResponseStatus(HttpStatus.CREATED)
    public ContaModel cadastroConta(@RequestBody ContaModel contaModel){
        return contaService.cadastrar(contaModel);
    }

    @PutMapping(path = "/contas/{codigo}")
    public ContaModel alterarStatusConta(@RequestBody ContaModel contaModel){return contaService.alterarStatus(contaModel);}
}
