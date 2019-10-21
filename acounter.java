
/**
 * Write a description of class acounter here.
 *
 * @author (Nnaemeka Ndaguba)
 * @version (22nd October)
 */
import java.util.Scanner;
public class acounter
{
   public static void main(String [] args){
       String word;
       Scanner keyboard = new Scanner(System.in);
       word = keyboard.next();
       int count = word.length();
       int aCount = 0;
       
       
       
       for(int i = 0; i<count -1; i++)
        
         if(word.charAt(i) == 'a'){
               aCount++;
              
               
            
            
            }
       
    
    
     System.out.println("there are "+ aCount + " a's");
    
    
    
    }
       


}
