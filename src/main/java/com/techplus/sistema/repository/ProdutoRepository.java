package com.techplus.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.techplus.sistema.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
