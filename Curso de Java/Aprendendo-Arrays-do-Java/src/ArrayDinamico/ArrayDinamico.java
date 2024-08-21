package ArrayDinamico;

public class ArrayDinamico {
    private int[] array;
    private int tamanhoAtual;

    // Construtor para inicializar o array com uma capacidade inicial
    public ArrayDinamico(int capacidadeInicial) {
        array = new int[capacidadeInicial];
        tamanhoAtual = 0;
    }

    // Método para adicionar um elemento ao array
    public void adicionar(int elemento) {
        // Verifica se o array precisa ser redimensionado
        if (tamanhoAtual == array.length) {
            redimensionar();
        }
        array[tamanhoAtual] = elemento;
        tamanhoAtual++;
    }

    // Método para redimensionar o array
    private void redimensionar() {
        // Cria um novo array com o dobro do tamanho atual
        int novaCapacidade = array.length * 2;
        int[] novoArray = new int[novaCapacidade];

        // Copia os elementos do array antigo para o novo array
        for (int i = 0; i < array.length; i++) {
            novoArray[i] = array[i];
        }

        // Substitui o array antigo pelo novo array
        array = novoArray;
    }

    // Método para exibir o conteúdo do array
    public void exibir() {
        for (int i = 0; i < tamanhoAtual; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Cria um ArrayDinamico com capacidade inicial 2
        ArrayDinamico meuArray = new ArrayDinamico(1);

        // Adiciona elementos ao array
        meuArray.adicionar(10);
        meuArray.adicionar(20);
        meuArray.adicionar(30); // Isso vai causar o redimensionamento do array
        meuArray.adicionar(40);
        meuArray.adicionar(40);
        meuArray.adicionar(50);
        meuArray.adicionar(60);

        // Exibe o conteúdo do array
        meuArray.exibir();
    }
}
