
package basic.calculator;


import java.io.*;

public class BasicCalculator {

    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        
        System.out.println("Enter the value of your first value");
        int n1 = Integer.parseInt(br.readLine());
        System.out.println("Enter the value of your second value");
        int n2 = Integer.parseInt(br.readLine());
       
        System.out.println("What operand do you want to use? \n"
                + "A Plus\n"
                + "B Minus\n"
                + "C Multiply\n"
                + "D Divide\n"
                + "E Modulo\n");

        System.out.println("Enter your desired choice: ");
        String choice = br.readLine();
        if (choice.equals("A") || choice.equals("+")){
            double plus = n1+n2;
            System.out.println("The answer is: " + plus);
        }
        else if (choice.equals("B") || choice.equals("-")){
            double minus = n1-n2;
            System.out.println("The answer is: " + minus);
        }
        else if(choice.equals("C") || choice.equals("*")){
            double multi = n1*n2;
            System.out.println("The answer is: " + multi);
        }
        else if(choice.equals("D") || choice.equals("/")){
            double divide = n1/n2;
            System.out.println("The answer is" +divide );
        }
        else if (choice.equals("E") || choice.equals("%")){
            double mod = n1%n2;
            System.out.println("The answer is"+ mod);
        }
        else{
            System.out.println("Invalid Choice");
        }
        
       
      
        
    }
    
}
