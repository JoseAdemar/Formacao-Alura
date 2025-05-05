package med.voll.api.testes.memoria;

import med.voll.api.domain.paciente.Paciente;

public class Principal {
    public static void main(String[] args) {

        Paciente paciente1 = new Paciente();

        Paciente paciente2 = new Paciente();
        paciente2 = paciente1;

        System.out.println(paciente1 == paciente2);



    }
}
