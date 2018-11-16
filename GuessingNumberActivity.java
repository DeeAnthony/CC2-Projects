
package guessingnumberactivity;

import java.util.*;

public class GuessingNumberActivity {


    public static void main(String[] args) {
        Random rN = new Random();
        Scanner n = new Scanner(System.in);
        int GuessedValue = rN.nextInt(1000);
        int Tries = 0;
        int Guess = 0;
        int Success = 0;
        
        
        while(Success == 0){
            System.out.println("Enter a number between 1 and 1000:");
            Guess = n.nextInt();
            Tries++;
            if(GuessedValue % 2 == 0){
                System.out.println("Remember! the number you are guessing is even.");
            }
            else{
                System.out.println("Remember! the number you are guessing is odd.");
            }
        if(Guess < 1 || Guess > 1000){
            System.out.println("The number you can only provide is between 1 and 1000!");
            
        }
            
        else if(Guess == GuessedValue){
            Success++;
            System.out.println("Congratulations! You have been wasting your time for guessing the number "+GuessedValue+" and your number of tries was:" +Tries);
        }
        else if(Guess < GuessedValue){
            System.out.println("Your guess is too low!");
        }
        else if(Guess > GuessedValue){
            System.out.println("Your guess is too high");
        }
      
        
    }
    }
    
}
