import java.io.Serializable;

public class Filme implements Serializable {
    public static final long serialVersionUID = 1L;
    public String nome;
    public int anoDeLancamento;
    public boolean incluidoNoPlano;
    public double somaDasAvaliacoes;
    public int totalDeAvaliacoes;
    public int duracaoEmMinutos;

    public int quantidadeAvaliacoes = 0;


    public void exibeFichaTecnica() {
        System.out.println(Filme.this);
    }

    public void avalia (double nota) {
        this.somaDasAvaliacoes += nota;
        quantidadeAvaliacoes++;
    }

    public double calculaMedia() {
        return somaDasAvaliacoes/quantidadeAvaliacoes;
    }

    @Override
    public String toString() {
        return String.format("""
                        Nome: %s
                        Ano: %d
                        Incluído no plano: %b
                        Avaliação: %.1f
                        Total de avaliações: %d
                        Duração em minutos: %d
                        """,
                nome,
                anoDeLancamento,
                incluidoNoPlano,
                somaDasAvaliacoes,
                totalDeAvaliacoes,
                duracaoEmMinutos
        );
    }
}
