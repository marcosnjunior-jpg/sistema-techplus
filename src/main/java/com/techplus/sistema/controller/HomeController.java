package com.techplus.sistema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")           // <- mapeia a raiz "/"
    public String home() {
        return "index";        // <- nome do template sem extensão
    }
}
