package com.registro.usuarios.controller;

import com.registro.usuarios.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistroController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/login")
    public String iniciarSecion(){
        return "login";
    }

    @GetMapping("/")
    public String verPaginaInicioSecion(Model model){
        model.addAttribute("usuarios",usuarioService.listarUsuarios());
        return "index";
    }
}
