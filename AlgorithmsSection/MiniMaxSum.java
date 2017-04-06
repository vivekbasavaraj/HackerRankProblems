
package AlgorithmsSection;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author vivek.basavaraj123
 */
public class MiniMaxSum {

        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] n = new long[5];
        long min = 0, max = 0;
        for(int i = 0; i < 5; i++){
            n[i] = in.nextLong();
            min += n[i];
        }
        int j = 0;
        for(int i=0; i<5 ; i++){
            long sum = 0;
            for(int k=0 ; k<5 ; ++k){
                if(k!=j){
                    sum += n[k];
                }
            }
            if(sum > max){
                max = sum;
            }
            if(sum < min){
                min = sum;
            }
            ++j;
        }
        System.out.println(min+" "+max);
    }

    
}
