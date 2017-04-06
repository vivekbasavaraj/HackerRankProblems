
package DaysOfCode30Challenge;
import java.io.*;
import java.util.*;

/**
 *
 * @author vivek.basavaraj123
 */


interface AdvancedArithmetic{
   int divisorSum(int n);
}
class NCalculator implements AdvancedArithmetic{
    
    public int divisorSum(int n){
        int d = n, res = 0;
        do{
            if(d%n==0){
                res +=n;
            }
        }while(--n > 0);
        return res;
    }
}
public class Day19_Interfaces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new NCalculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
