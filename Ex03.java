import java.util.Scanner;

public class Ex03 {
    
    public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    float sum = 0f;
    float average = 0f;
    int s = 10;
    float [] vector;
    vector = new float[s];

    for (int i=0; i < vector.length; i++ ) {
        float v = in.nextFloat();
        vector[i] = v;
        sum = sum + v;
       
    }

    for (int i=0; i < vector.length; i++ ) {
        System.out.println("Vector: " + vector[i]);
    }

    average = sum / s;
    System.out.println ("Average: " + average);
    
    }

}