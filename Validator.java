
/**
 * This software validates 
 */
import java.util.Scanner;
public class Validator
{
    public static void main(String [] args){
    String first = getCode();
    gradeChecker(first);
    
    }
    
    public static String getCode(){
     Scanner kb = new Scanner(System.in);
     System.out.println("Enter code");
     String num = kb.next();
     return num;
    } 
    public static void gradeChecker(String first){
     
        if(first.length() == 6){
            if(first.charAt(3) == '-'){
               System.out.println("VALID");
            } 
        } else{
          System.out.println("INVALID");
        }
    }
}
