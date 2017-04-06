
package DaysOfCode30Challenge;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author vivek.basavaraj123
 */
public class Day03_IntroToCondStatements {
    
     public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      scan.close();
      String ans="";
          
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
      if(n%2==1){
         ans = "Weird";
      }
      else{
         // Complete the code 
          if(n<5 || n>20){
              ans = "Not Weird";
          }else{
              ans = "Weird";
          }
      }
      System.out.println(ans);
      System.out.println( ((n & 1) == 1 || (6 <= n && n <= 20)) ? "Weird" : "Not Weird");
   }
}
