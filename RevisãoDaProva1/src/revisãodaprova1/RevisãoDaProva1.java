package revisãodaprova1;

public class RevisãoDaProva1 {

    
    public static void teste(){
        int[] vetor1 = new int[]{10, 20, 30, 40, 50};
        int[] vetor2 = new int[]{5, 17, 40, 55, 70};
        int[] vetor3 = new int[vetor1.length];
        
        
        for (int i = 0; i < vetor1.length; i++){
            
              System.out.println("vetor1[" + i + "] = " + vetor1[i]);
              System.out.println("vetor2[" + i + "] = " + vetor2[i]);
            vetor3[i] = vetor1[i] + vetor2[i];
            System.out.println("soma");
            System.out.println("vetor3[" + i + "] = " + vetor3[i]);
            
            System.out.println("--------------------");
        
        }
    
    
    }
    
    
    public static void main(String[] args) {

        
        
        teste();
        
        }

    }


