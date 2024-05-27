package revisãodaprova3;

import java.util.Arrays;

public class RevisãoDaProva3 {

    public static double teste(double a) {
        int[] vetor = {3, 2, 3, 4, 5};
        Arrays.sort(vetor);
        for (int i = 0; i < vetor.length; i++) {

            a += vetor[i];
            System.out.println("valores: " + vetor[i]);

        }
        System.out.println("soma dos valores: " + a);
        return a / vetor.length;

    }

    public static void main(String[] args) {

        System.out.println("média dos valores: " + teste(0));

    }

}
