package finalact;
import java.util.*;

public class FinalAct {

    public static void main(String[] args) {
        display();
    }
    public static void display(){
        Scanner s = new Scanner(System.in);
        System.out.println("Your desired array length: ");
        int a = s.nextInt();
        int [] set = new int [a];
        for (int i = 0; i < set.length; i++) {
            System.out.println("Input element for index " + i +" :" );
            int e = s.nextInt();
            set[i] = e;
        }
        System.out.println("Choose operation: Fibonacci(1) or Factorial(2) : ");
        String choice = s.next();
        
        for (int i = 0; i < set.length; i++) {
            System.out.print("f(" + set[i]+") \t");
        }
        System.out.println("");
        if("1".equals(choice)){
            for (int i = 0; i < set.length; i++) {
                System.out.print(fibo(set[i])+ "\t");
            }
        }else if("2".equals(choice)){
            for (int i = 0; i < set.length; i++) {
                System.out.print(fact(set[i]) + "\t");
            }
        }
        else{
            System.out.println("Incorrect Input!");
            display();
        }
    }   
    

    public static int fibo(int f){
        if(f <=1){
            return f;
        }
        else{
            return fibo(f-1)+(f-2);
        }
    }
    public static int fact(int f){
        int a = 1;
        int fact = 1;
        while(a <= f){
            fact*= a;
            a++;
        }
        return fact;
    }
}


   

