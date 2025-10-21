package com.techplus.sistema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")  // Mapeia a URL raiz (ex: https://sistema-techplus.onrender.com/)
    public String home() {
        return "index"; // Retorna o template "index.html" da pasta templates
    }
}
