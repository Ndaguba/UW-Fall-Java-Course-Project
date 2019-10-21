import java.util.Scanner;
/**
 * ACS-1903
 * Lab4 Q1 Sample Solution
 */
public class Palindrome
{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a word:");        
        String word = kb.next();
        
        String reverse = "";
        for (int i=word.length()-1; i>=0; i--)
            reverse += word.charAt(i);            
        boolean result = reverse.equalsIgnoreCase(word);
        
        if (result)
            System.out.println("The word " +word+ " is a Palindrome.");
        else
            System.out.println("The word " +word+ " is not a Palindrome.");
    }
}