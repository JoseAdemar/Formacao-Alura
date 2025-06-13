package com.exemplo.perfil;

import com.exemplo.perfil.model.Usuario;
import com.exemplo.perfil.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PerfilApplication implements CommandLineRunner {

    @Autowired
    private UsuarioRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(PerfilApplication.class, args);
    }

    @Override
    public void run(String... args) {
        repo.save(new Usuario(null, "João Silva", "joao@email.com", "joao.silva", "https://i.pravatar.cc/150?img=1"));
        repo.save(new Usuario(null, "Maria Oliveira", "maria@email.com", "maria.oliveira", "https://i.pravatar.cc/150?img=2"));
    }
}
