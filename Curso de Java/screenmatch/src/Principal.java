public class Principal {
    public static void main(String[] args) throws IllegalAccessException {
        Filme filme = new Filme();
        filme.nome = "O podereso chefão";
        filme.anoDeLancamento = 1970;
        filme.incluidoNoPlano = true;
        filme.duracaoEmMinutos = 180;

        filme.exibeFichaTecnica();
        filme.avalia(8);
        filme.avalia(5);
        filme.avalia(10);

        System.out.println("Soma das avaliações = " + filme.somaDasAvaliacoes);
        System.out.println("Quantidade de avaliações =" + filme.quantidadeAvaliacoes);
        System.out.println("Média = " + filme.calculaMedia());

    }
}