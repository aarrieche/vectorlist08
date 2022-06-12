import java.util.Scanner;

public class Ex01 {
    
    public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    int s = in.nextInt();
    
    int[] vector;
    vector = new int[s];

    int[] vectorX;
    vectorX = new int[s];
    
    for(int i=0;i<vector.length;i++)
    {
        vector[i] = in.nextInt();
    }

    for(int i=s-1;i>-1;i--)
    {
        System.out.print(vector[i] + " ");
    }
    
}
}



    
