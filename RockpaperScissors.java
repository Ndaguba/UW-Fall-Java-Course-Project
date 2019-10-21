
/**
 * Write a description of class RandomGenerator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class RockpaperScissors
{
   public static void main (String [] args){
    
       Random rand = new Random();
       //nextint(3) produces values from (0,1,2)- three possible outcomes.
       
      switch(rand.nextInt(3)) {
        case 0:
            System.out.println("Rock");
            break;
         case 1:
            System.out.println("paper");
            break;
            
          case 2:
           System.out.println("Scissors");
           break;
        }
        
        
        
        
        
        
        }
       
    
    
    
    
    
    
    
    
    }

