
package nestedifactivity;
import java.io.*;

public class NestedIfActivity {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("What are you taking up in college? ");
        String degree = br.readLine();
        
        if(degree.equals("BSIT")){
            System.out.println("What is your major? ");
            String major = br.readLine();
            if(major.equals("Network Security")){
                System.out.println("So you're taking up BSIT major in Network Security.");
            }
            else if(major.equals("Web Development")){
                System.out.println("So you're taking up BSIT major in Web Development.");
            }
            else if(major.equals("Enterprises Resource Planning")){
                System.out.println("So you're taking up BSIT major in Enterprises Resource Planning");
            }
            else{
                System.out.println("GGWP");
            }
        }
        else if(degree.equals("BSComSci")){
            System.out.println("What is your major? ");
            String major = br.readLine();
                if(major.equals("Mobile Development")){
                    System.out.println("So you're taking up BSComSci major in Mobile Development");
            }
                else if(major.equals("Digital Arts and Animation")){
                    System.out.println("So you're taking up BSComSci major in Digital Arts and Animations");
                }
        }
        else if(degree.equals("BSDA")){
            System.out.println("So you're taking up BSDA");
        }
    }
    
}
