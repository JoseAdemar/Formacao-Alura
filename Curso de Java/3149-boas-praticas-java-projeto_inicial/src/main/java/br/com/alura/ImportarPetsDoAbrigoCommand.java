package br.com.alura;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.service.AbrigoService;
import br.com.alura.service.PetService;

import java.io.IOException;

public class ImportarPetsDoAbrigoCommand implements Command{
    @Override
    public void execute() {
        try {
            AbrigoService abrigoService = new AbrigoService(new ClientHttpConfiguration());
            PetService petService = new PetService(new ClientHttpConfiguration());

            petService.importarPetsDoAbrigo();
        }catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
