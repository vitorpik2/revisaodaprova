
package revisãodaprova5;

import java.util.Arrays;


public class RevisãoDaProva5 {

    public static void teste(){
        
        int[] vetor1 = {1,2,3,4,5};
        int[] vetor2 = {1,2,6,4,5};
        
        for (int i = 0; i < vetor1.length; i++) {
            
            
            
            System.out.println("vetor1: "+vetor1[i] + " ");
            
            System.out.println("vetor2: "+vetor2[i]);
            System.out.println("");
            
            
        }
        boolean iguais = Arrays.equals(vetor1, vetor2);
        
        System.out.println(iguais);
        
        
        
    } 
    
    
    
    public static void main(String[] args) {
        
        teste();
    }
    
}
