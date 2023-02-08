import java.util.Random;
import java.util.Scanner;

import javax.xml.transform.Source;

public class Main{
    public static void main(String[] args) {
        /*
         * 
         * Rules
         * 
         * 12 cells
         * thrown die and move according to the value
         * 
         * intitial value = 1000
         * 
         * in jail give 200
         * house give 50 as rent
         * if treasure get 1000
         * 
         * Throw die N time and see the balance amount
        */

        String cells[] = {
            "Treasure", "Nothing", 
            "Jail", "Nothing", 
            "House", "Nothing",
            "Nothing", "House", 
            "Jail", "Treasure",
            "House", "Nothing"
        };

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        boolean playAgain = true;
        int amount = 0, index =0;

        

        do{
            System.out.println("Enter an initial amount: ");
            amount = s.nextInt();

            for (int i = 0; i < 5; i++) {
                index = r.nextInt(12);
                
                switch(cells[index]){
                    case "Nothing":
                    System.out.println("Nothing happens.");
                    break;

                    case "Treasure":
                    System.out.println("You found treasure. You get 1000 more");
                    amount+=1000;
                    break;

                    case "House":
                    System.out.println("You are in a house. You loose 50");
                    amount-=50;
                    break;

                    case "Jail":
                    System.out.println("You are in jail. You loose 200");
                    amount-=200;
                    break;
                }
            }

            System.out.println("Amount remaining is: "+amount);


            System.out.println("Do you want to play again?");
            playAgain = s.nextBoolean();
        }while(playAgain);

        System.out.println("Game over");


    }
}