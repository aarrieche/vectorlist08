import java.util.Random;
import java.util.Scanner;

public class E07 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        
        int[][] matriz = new int [5][5];
        int auxiliar = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(1,10);
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("Informe o valor");
        int pesquisa = in.nextInt();
        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {
            auxiliar = 0;
            for (int j = 0; j < matriz.length; j++) {
                auxiliar = auxiliar + matriz[i][j];
                if (auxiliar >= 10) {
                    if (auxiliar == pesquisa) {
                        System.out.println(pesquisa + " tem na linha " + i);
                        contador ++;
                    }
                }
                
            }
        }

        if (contador == 0) {
            System.out.println("Nehuma linha soma o valor informado");
        }

    }
    
}