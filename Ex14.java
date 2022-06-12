import java.util.Scanner;
import java.util.Random;


public class Ex14 {
    
    public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    Random aleat = new Random();
    int [] vector;
    int s = 10;
    vector = new int [s];
    
    for (int i = 0; i < vector.length; i++) {
        int result;
        result = aleat.nextInt(100);
        vector[i] = result;

    }

    for (int i = 0; i < vector.length; i++) {
        System.out.println ("Vetor: " + vector[i]);
    }

    for (int i = 0; i < 1; i++) {
        int value;
        int valueTwo;
        int p = 0;
        int q = 0;
        int a = 0;
        System.out.println ("Defina a posição 1 a ser trocada: ");
        value = in.nextInt();
        i = value;
        p = vector[i];
        System.out.println("p: " + p);
        System.out.println ("Defina a posição 2 a ser trocada: ");
        valueTwo = in.nextInt();
        i = valueTwo;
        q = vector [i];
        System.out.println("q: " + q);
        vector[i] = p;
        vector[value] = q;


    }

    for (int i = 0; i < vector.length; i++) {
        System.out.println ("Vetor: " + vector[i]);
    }

}

}