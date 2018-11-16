
package fibofactodemo;
import java.util.*;


public class FiboFactoDemo {
public static int input;

    public static void main(String[] args) {
        input ();
        
        factorial();
    }
    
    public static void input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to be factored: ");
        input = scan.nextInt();
    }
    
    public static int fibonacci(int x){
        if(x ==0){
        return 0;    
        }
        else if (x == 1){
            return 1;
        }
        else{
            return (fibonacci(x-1) + fibonacci(x-2));
        }
    }
    public static void factorial(){
        for (int i = 0; i <= input; i++){
            System.out.print("f(" + i + ")\t");
        }
        for (int i = 0; i <= input; i++){
            System.out.println("");
            for(int p = 0; p <=i; p++){
                System.out.print("" + fibonacci(p) + "\t" );
            }
        }
        System.out.println("");
    
}
}