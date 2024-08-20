public class TestaArray {
    public static void main(String[] args) {
        /*
        int[] idades;
        double pesos[];
        long[] numeros;
        long[] tamanhos;
        */

        int[] idades1 = {10,20,30,40,50};

        int[] idades2 = new int[5];

        idades2[0]=10;
        idades2[1]=20;
        idades2[2]=30;
        idades2[3]=40;
        idades2[4]=50;

        for (int i = 0; i < idades2.length; i++) {
            System.out.println(idades2[i] + " anos");
        }

        System.out.println("Tamanho do Array idades1 = " + idades1.length);

    }
}
