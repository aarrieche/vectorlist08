import java.util.Scanner;

public class Ex06 {
    
    public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    int s = 20;
    char [] vector;
    vector = new char[s];


    for (int i=0; i < vector.length; i++ ) {
        char v = in.next().charAt(0);
        vector[i] = v;

    }

    for (int i=0; i < vector.length; i++ ) {
        System.out.print (vector[i]);

}

    }

}