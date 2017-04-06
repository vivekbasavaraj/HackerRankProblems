
package DaysOfCode30Challenge;
import java.io.*;
import java.util.*;

/**
 *
 * @author vivek.basavaraj123
 */
public class Day06_LetsReview {

     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = Integer.parseInt(sc.nextLine());
       for(int i=0; i<t; ++i){
           String temp = sc.nextLine();
           String even = new String();
           String odd = new String();
           for(int j=0; j<temp.length(); ++j){
               if(j%2 == 0){
                   even = even.concat(String.valueOf(temp.charAt(j)));
               }else{
                   odd = odd.concat(String.valueOf(temp.charAt(j)));
               }
           }
           System.out.println(even+" "+odd);
       }
        sc.close();
    }
}
