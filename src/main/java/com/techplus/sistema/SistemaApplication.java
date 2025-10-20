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
    public CommandLineRunner inicializarBanco(ProdutoRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                repository.save(new Produto("Notebook", "Notebook com 16GB de RAM", 4500.00, 5));
                repository.save(new Produto("Smartphone", "Smartphone Android 128GB", 2200.00, 10));
                repository.save(new Produto("Impressora", "Impressora a jato de tinta", 750.00, 3));
            }
        };
    }
}