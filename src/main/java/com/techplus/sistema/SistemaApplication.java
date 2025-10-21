package com.techplus.sistema;

import com.techplus.sistema.model.Produto;
import com.techplus.sistema.repository.ProdutoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SistemaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SistemaApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(ProdutoRepository produtoRepository) {
        return args -> {
            // ✅ Cria produtos usando o construtor de 4 parâmetros
            Produto p1 = new Produto("Notebook", "Notebook Dell i5", 3500.0, 5);
            Produto p2 = new Produto("Teclado", "Teclado mecânico", 250.0, 10);

            produtoRepository.save(p1);
            produtoRepository.save(p2);
        };
    }
}
