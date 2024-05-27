package revisãodaprova10;

import java.util.Arrays;

public class RevisãoDaProva10 {

    public static void teste() {

        int[] vetor = {1, 5, 7, 10, 20};
        int indice = Arrays.binarySearch(vetor, 7);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("valor do vetor[" + i + "]: " + vetor[i]);

            System.out.print("indice do vetor[" + i + "]: ");
            if (indice == i) {
                System.out.println(indice);
            } else {
                System.out.println("-1");
            }

            System.out.println("-----------------");

        }

    }

    public static void main(String[] args) {

        teste();
    }

}
