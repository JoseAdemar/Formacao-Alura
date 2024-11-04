package med.voll.api.endereco;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(DadosEndereco endereco) {
        this.logradouro = endereco.logradouro();
        this.bairro = endereco.bairro();
        this.cep = endereco.cep();
        this.numero = endereco.numero();
        this.complemento = endereco.complemento();
        this.cidade = endereco.cidade();
        this.uf = endereco.uf();
    }

    public void atualizarInformacaoes(DadosEndereco dados) {
        if (dados.logradouro() != null) {
            this.logradouro = dados.logradouro();
        }
        if (dados.logradouro() != null) {
            this.bairro = dados.bairro();
        }
        if (dados.logradouro() != null) {
            this.cep = dados.cep();
        }
        if (dados.logradouro() != null) {
            this.numero = dados.numero();
        }
        if (dados.logradouro() != null) {
            this.complemento = dados.complemento();
        }
        if (dados.logradouro() != null) {
            this.cidade = dados.cidade();
        }
        if (dados.logradouro() != null) {
            this.uf = dados.uf();
        }
    }
}
