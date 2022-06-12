import java.util.Scanner;

public class Ex05 {
    
    public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    int s = 20;
    int [] vector;
    int [] vectorX;
    vector = new int[s];
    vectorX = new int[s];

    for (int i=0; i < vector.length; i++ ) {
        int v = in.nextInt();
        vector[i] = v;
        vectorX[i] = vector[i];
        if (i>=10 && i<=18) {
        vector[i] = vectorX[i-10];
        }
        if (i<=9) {
            int x = i + 10;
            vector[i] = x;
            System.out.println (x);
            
        }

        
       
    }
    for (int i=0; i < vector.length; i++ ) {
        System.out.println("Vector: " + vector[i]);
        }
}

}