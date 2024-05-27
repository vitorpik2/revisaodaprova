package revisãodaprova8;

public class RevisãoDaProva8 {

    public static void teste() {
        int[] vetor = {1, 2, 3, 4, 5};

        for (int i = 0; i < vetor.length; i++) {

            System.out.println("valor: " + vetor[i]);

            if (vetor[i] == 3) {
                vetor[i] = 0;
            }

            System.out.println("valor atualizado: " + vetor[i]);
            System.out.println("-----------------");

        }
    }

    public static void main(String[] args) {

        teste();
    }

}
