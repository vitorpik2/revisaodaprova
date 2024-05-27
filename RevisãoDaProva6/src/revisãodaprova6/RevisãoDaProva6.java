package revisãodaprova6;

public class RevisãoDaProva6 {

    public static void teste() {

        int[] vetor = {1, 2, 3, 4, 5};
        int[] copia = vetor.clone();
        int a = vetor.length;
        for (int i = 0; i < vetor.length; i++) {

            System.out.println("vetor[" + i + "] original: " + vetor[i]);
            a--;

            

            System.out.println("vetor[" + i + "] inverso: " + copia[a]);
            System.out.println(" ");
        }

    }

    public static void main(String[] args) {

        teste();
    }

}
