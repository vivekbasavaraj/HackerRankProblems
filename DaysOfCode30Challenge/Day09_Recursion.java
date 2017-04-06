
package DaysOfCode30Challenge;
import java.io.*;
import java.util.*;

/**
 *
 * @author vivek.basavaraj123
 */
public class Day09_Recursion {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(factorial(n));
    }
    public static int factorial(int n){
        if(n<=1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}
