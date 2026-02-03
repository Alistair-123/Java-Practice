import java.util.Scanner;

public class Foorloops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] n = new int[num];

        for(int i = 0; i < n.length; i++){
            System.out.println(i + 1);
        }

        System.out.println();
        System.out.println();

        
        System.out.print("Enter Scores: ");
        int scr = sc.nextInt();


        int[] scores = new int[scr];

        for(int i = 0; i < scores.length; i++){
           System.out.print("Enter Student Score: ");
           scores[i] = sc.nextInt();
        }

        for (int i : scores) {
            System.out.println("You have entered: " + i);
        }
        
        //------------------------------------------------
        System.out.println("Validation Loop - ");

        int num2;
        int countAttempts = 0;

        do {
            System.out.print("Enter a number: ");
            num2 = sc.nextInt();
            
            countAttempts++;

        } while (num2 != 0);

        System.out.println("Total Attempts: " + countAttempts);
    }
}
