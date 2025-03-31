package br.com.alura;

import br.com.alura.refl.Transformator;

import java.lang.reflect.InvocationTargetException;

public class PessoaService {

    public PessoaDTO list() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Pessoa pessoa = new PessoaRepository().list();
        Transformator transformator = new Transformator();
        PessoaDTO  pessoaDTO = transformator.transform(pessoa);

        return pessoaDTO;
    }
}
