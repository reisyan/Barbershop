package com.barbeshop.yan.service;

import com.barbeshop.yan.model.Pessoa;
import com.barbeshop.yan.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    private final PessoaRepository repository;

    @Autowired
    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }

    public List<Pessoa> findAll() {
        return repository.findAll();
    }

    public Pessoa findById(Long id) {
        return repository.findById(id).get();
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public Pessoa create(Pessoa pessoa) {
        return repository.saveAndFlush(pessoa);
    }
}
