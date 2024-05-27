package revisãodaprova2;

public class RevisãoDaProva2 {

    public static void teste() {
        int[] vetor = {0, 5, 4, 20, 1};
        int a = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("elementos: " + vetor[i]);
            if (a < vetor[i]) {
                a = vetor[i];
            }

        }
        System.out.println("maior elemento: " + a);
    }

    public static void main(String[] args) {

        teste();
        
    }

}
