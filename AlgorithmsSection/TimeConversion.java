
package AlgorithmsSection;
import java.io.*;
import java.util.*;

/**
 *
 * @author vivek.basavaraj123
 */
public class TimeConversion {
    
     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String timeBefConv = sc.nextLine();
        sc.close();
        String timeAftConv;
//        String timeAftConv = timeBefConv.substring(0, 8);
        if(timeBefConv.charAt(8) == 'P'){
            int t = Integer.parseInt(timeBefConv.substring(0, 2));
            if(t!=12){
                t = t+12;
            }
            timeAftConv = String.valueOf(t);
            timeAftConv = timeAftConv.concat(timeBefConv.substring(2, 8));
        }else{
            int t = Integer.parseInt(timeBefConv.substring(0, 2));
            if(t==12){
            timeAftConv = "00";
            timeAftConv = timeAftConv.concat(timeBefConv.substring(2, 8));
            }else{
                timeAftConv = "";
                timeAftConv = timeAftConv.concat(timeBefConv.substring(0, 8));
            }
            
        }
        System.out.println(timeAftConv);
    }
}
