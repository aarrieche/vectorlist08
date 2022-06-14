import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int principal = 0;
        int secundaria = 0;
        int linha_1 = 0;
        int linha_2 = 0;
        int linha_3 = 0;
        int coluna_1 = 0;
        int coluna_2 = 0;
        int coluna_3 = 0;
        int total_linha = 0;

        System.out.println("Informe o valor");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == 0) {
                    linha_1 += matriz[i][j];
                } else if (i == 1) {
                    linha_2 += matriz[i][j];
                } else if (i == 2) {
                    linha_3 += matriz[i][j];
                }
                if (j == 0) {
                    coluna_1 += matriz[i][j];
                } else if (j == 1) {
                    coluna_2 += matriz[i][j];
                } else if (j == 2) {
                    coluna_3 += matriz[i][j];
                }
                if (i == j) {
                    principal += matriz[i][j];
                }
                if (j + i == 2) {
                    secundaria += matriz[i][j];
                }
            }
        }

        if (linha_1 == 15 && linha_2 == 15 && linha_3 == 15 && coluna_1 == 15 && coluna_2 == 15 && coluna_3 == 15 && principal == 15 && secundaria == 15) {
            System.out.println("essa merda e um quadrado magico");
        }

    }
}