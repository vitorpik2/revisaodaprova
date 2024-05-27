package revisãodaprova9;

import java.util.Arrays;

public class RevisãoDaProva9 {

    public static void teste() {

        int[] vetor = {50, 2, 7, 4, 10};

        int a = 0;
System.out.println("ordem original");
        while (a < vetor.length) {
            
            System.out.println("vetor["+ a +"] = " + vetor[a]);
            a++;

        }
        Arrays.sort(vetor);
        System.out.println("--------------------------");
        
        System.out.println("ordem organizada");
        for (int i = 0; i < vetor.length; i++) {

            System.out.println("vetor["+ i +"] = " + vetor[i]);

        }

    }

    public static void main(String[] args) {

        teste();
    }

}
