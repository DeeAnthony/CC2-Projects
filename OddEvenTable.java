package arraysort;

import java.io.*;
import java.util.*;
public class ArraySort {


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of numbers: ");
        int length = sc.nextInt();
        System.out.println("Enter set of numbers: ");
        
        int arrayNum []= new int[length];
        ArrayList even = new ArrayList();
        ArrayList odd = new ArrayList();
        for(int a =0; a < arrayNum.length; a++){
            System.out.println("index" + "[" + a + "]: ");
            int index = sc.nextInt();
            arrayNum[a] = index;
        }
        for(int a = 0; a < arrayNum.length; a++){
            if(arrayNum[a] % 2 == 0){
                
                even.add(arrayNum[a]);
                
            }
            else if(arrayNum[a] % 2 != 0){
               odd.add(arrayNum[a]);
               
        }
        }
            System.out.println("Set of Numbers (UNSORTED)");
            System.out.println(Arrays.toString(arrayNum));
            System.out.println("Even\tOdd");
        for (int a = 0; a < even.size() && a <= odd.size(); a++){
            System.out.println(even.get(a) +"\t"+odd.get(a));
        }
        
        
            
        
    }
    
}
