import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Random rand = new Random();
        int num = rand.nextInt(100)+1;
        Scanner read = new Scanner(System.in);


        System.out.println("Guess number between 1 and 100 : ");
        while (true) {
            int guss=read.nextInt();
            if (guss==num) {

                System.out.println("Correct number");
                break;
            } else if (guss > num) {
                System.out.println("Guess a number less than " +guss);
            } else if (guss < num) {
                System.out.println("Guess a number larger than " +guss);
            } else {

                System.out.println("wrong" + " " + rand);

            }


        }
    }
}