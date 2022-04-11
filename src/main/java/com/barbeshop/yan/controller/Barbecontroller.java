package com.barbeshop.yan.controller;

import com.barbeshop.yan.model.Pessoa;
import com.barbeshop.yan.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Barbecontroller {

    @Autowired
    PessoaRepository pessoaRepository;

    @GetMapping(path = "/barshop/api")
    public String check(){
        return "Bem vindo a Barberia Reis";
    }

    @GetMapping("/pessoas")
    public List<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }

    @PostMapping("/pessoa")
    public Pessoa savePessoa(@RequestBody Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }
}
