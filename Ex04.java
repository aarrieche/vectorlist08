import java.util.Scanner;

public class Ex04 {
    
    public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    int tam = 10;
    int tamX = 10;
    int s = 10;
    int [] vector;
    vector = new int[s];
    int [] vectorPair;
    vectorPair = new int [tam];
    int [] vectorOdd;
    vectorOdd = new int [tamX];

    for (int i=0; i < vector.length; i++ ) {
        int v = in.nextInt();
        vector[i] = v;
        if (vector[i] % 2 == 0) {
            vectorPair[i] = vector[i];
        }
        else {
            vectorOdd[i] = vector[i];
        }
        
       
    }

    for (int i=0; i < vectorPair.length; i++ ) {
        if (vectorPair[i] != 0){
        System.out.println(vectorPair[i] + " par");
        }

    }

    for (int i=0; i < vectorOdd.length; i++ ) {
        if (vectorOdd[i] != 0){
        System.out.println(vectorOdd[i] + " impar");
        }
    }
    
    }

}