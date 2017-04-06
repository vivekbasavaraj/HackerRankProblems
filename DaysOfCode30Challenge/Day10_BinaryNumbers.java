
package DaysOfCode30Challenge;
import java.io.*;
import java.util.*;

/**
 *
 * @author vivek.basavaraj123
 */
public class Day10_BinaryNumbers {

     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        Boolean flag = false;
        int count = 1, temp = 1; 
        while(n>0){
            if(n%2 == 1){
                if(flag == true){
                    count++;
                    if(count >= temp){
                        temp = count;
                    }
                }
                flag = true;
            }else{
                count = 1; 
                flag = false;
            }
            n /= 2;
        }
        System.out.println(temp);
     }
}
