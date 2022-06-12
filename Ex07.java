import java.util.Scanner;

public class Ex07 {
    
    public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    
    int voteOne = 0;
    int voteTwo = 0;
    int voteThree = 0;
    int voteFor = 0;
    int voteFive = 0;
    int ent = 0;
    int s = 500;
    int [] one;
    one = new int[s];

    
        for (int i=0; ent != -1; i++ ) {
        System.out.println("Qual candidato você quer votar?");
        ent = in.nextInt();
        System.out.println("Seu voto é: " + ent);
        if (ent != -1) {
            one[i] = ent;
            if (ent == 1){
                voteOne ++;
            }
            if (ent == 2){
                voteTwo ++;
            }
            if (ent == 3){
                voteThree ++;
            }
            if (ent == 4){
                voteFor ++;
            }
            if (ent == 5){
                voteFive ++;
            }
            
        }
        }
    

    for (int i=0; i < one.length; i++ ) {
        System.out.println ("Vetor inteiro: " + one[i]);
        
    }

    System.out.println ("Votos candidato 1: " + voteOne);
    System.out.println ("Votos candidato 2: " + voteTwo);
    System.out.println ("Votos candidato 3: " + voteThree);
    System.out.println ("Votos candidato 4: " + voteFor);
    System.out.println ("Votos candidato 5: " + voteFive);
}

}