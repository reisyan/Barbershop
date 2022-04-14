package com.barbeshop.yan.controller;

import com.barbeshop.yan.model.Pessoa;
import com.barbeshop.yan.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;

@RestController
public class PessoaController {

    @Autowired
    PessoaRepository pessoaRepository;


    @GetMapping("/pessoas")
    public List<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }

    @PostMapping("/pessoa")
    public Pessoa savePessoa(@RequestBody Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @DeleteMapping("/pessoa/{id}")
    public void delete(@PathVariable Long id) {
        pessoaRepository.deleteById(id);
    }
}
