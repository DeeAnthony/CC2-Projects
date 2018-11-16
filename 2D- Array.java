
package multidimentionalactivity;
import java.util.*;

public class MultiDimentionalActivity {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        System.out.println("Input desired row and column: ");
        System.out.println("ROW: ");
        int row = sc.nextInt();
        System.out.println("COLUMN: ");
        int column = sc.nextInt();
        
        int [][] rc = new int[row][column];
        
        for(int i = 0; i < row; i++){
            System.out.println("Row: "+i);
            for(int a = 0; a < column; a++){
                System.out.println("Column: "+ a);
            System.out.println("Element " + (a+1) + ": ");
            rc[i][a] = sc.nextInt();
            sb.append("\n").append(rc[i][a]);
            }

        
        System.out.print(sb);
            }
    }
    
}
