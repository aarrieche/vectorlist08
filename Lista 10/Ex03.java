import java.util.Random;
import java.util.Scanner;


public class Ex03 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Digite um valor");
        int tamanho = in.nextInt();

        int[][] mat = new int [tamanho][tamanho];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                
                if (i==j) {
                    mat[i][j] = 0;
                }
                else {
                    mat[i][j] = 5;
                }
            }
        } 

        // IMPRIMINDO A MATRIZ COM A DIAGONAL PRINCIPAL

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
            
                System.out.print(mat[i][j] + "  ");
                
            }
            System.out.println();
        }

        System.out.println();

        // IMPRIMINDO A MATRIZ SEM A DIAGONAL PRINCIPAL

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i!=j){                                 // SE A LINHA FOR DIFERENTE DA COLUNA , IMPRIME  
                System.out.print(mat[i][j] + "  ");
                }
            }
            System.out.println();
        }

    }
    
}