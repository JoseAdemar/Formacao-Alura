package com.exemplo.perfil.controller;

import com.exemplo.perfil.model.Usuario;
import com.exemplo.perfil.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("usuarios", usuarioRepository.findAll());
        return "home";
    }

    @GetMapping("/perfil/{username}")
    public String perfil(@PathVariable String username, Model model) {
        Usuario usuario = usuarioRepository.findByUsername(username)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        model.addAttribute("usuario", usuario);
        return "perfil";
    }
}

