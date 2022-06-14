import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Digeite um valor");
        int tamanho = in.nextInt();

        int[][] tabuleiro = new int [tamanho][tamanho];

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 1; j < tabuleiro.length; j++) {
                if (tabuleiro[i][j-1] == 0) {
                    tabuleiro[i][j] = 1;
                }
            }
        } 

        for (int i = 1; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {
                if (tabuleiro[i-1][j] == 0) {
                    tabuleiro[i][j] = 1;
                } else {
                    tabuleiro[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {
                System.out.print(tabuleiro[i][j] + "  ");
            }
            System.out.println();
        }

    }
    
}