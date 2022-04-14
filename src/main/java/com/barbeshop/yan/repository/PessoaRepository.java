package com.barbeshop.yan.repository;

import com.barbeshop.yan.model.Pessoa;
import org.hibernate.sql.Delete;
import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
