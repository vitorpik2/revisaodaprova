package revisãodaprova7;

public class RevisãoDaProva7 {

    public static void teste() {

        int[] vetor = {10, 25, 38, 48, 500};

        for (int i = 0; i < vetor.length; i++) {

            System.out.print("o número " + vetor[i] + " é par? ");

            boolean resposta = (vetor[i] % 2 == 0);

            System.out.println(resposta);

        }

    }

    public static void main(String[] args) {

        teste();
    }

}
