package com.barbeshop.yan.controller;

import com.barbeshop.yan.model.Pessoa;
import com.barbeshop.yan.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaController {

    private final PessoaService service;

    @Autowired
    public PessoaController(PessoaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Pessoa> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Pessoa findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }

    @PostMapping
    public Pessoa create(@RequestBody Pessoa pessoa) {
        return service.create(pessoa);
    }
}
