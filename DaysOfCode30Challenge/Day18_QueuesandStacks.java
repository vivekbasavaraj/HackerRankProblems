
package DaysOfCode30Challenge;
import java.io.*;
import java.util.*;

/**
 *
 * @author vivek.basavaraj123
 */
public class Day18_QueuesandStacks {
        
     Stack<Character> st;
     Queue<Character> qu;
    Day18_QueuesandStacks(){
        this.st = new Stack();
        this.qu = new LinkedList();
        
    }
    public void pushCharacter(char ch){
        this.st.push(ch);
    }
    
     public void enqueueCharacter(char ch){
        this.qu.offer(ch);
    }
     
     public char popCharacter(){
         return this.st.pop();
     }
     
     public char dequeueCharacter(){
        return this.qu.poll();
     }
    
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
//        Solution p = new Solution();
        Day18_QueuesandStacks p = new Day18_QueuesandStacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
