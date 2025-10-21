package com.techplus.sistema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("mensagem", "Bem-vindo ao Sistema TechPlus!");
        return "index"; // deve existir src/main/resources/templates/index.html
    }
}
