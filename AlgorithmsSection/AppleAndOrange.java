
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
public class AppleAndOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
//        int[] apple = new int[m];
        int aCount = 0;
        for(int apple_i=0; apple_i < m; apple_i++){
//            apple[apple_i] = in.nextInt();
              int aD = in.nextInt();
              if((aD>0) && (a+aD >= s)&& (a+aD <= t)){
                  ++aCount;
              }
        }
//        int[] orange = new int[n];
        int oCount = 0;
        for(int orange_i=0; orange_i < n; orange_i++){
//            orange[orange_i] = in.nextInt();
              int oD = in.nextInt();
              if((oD<0) && (b+oD <= t)&& (b+oD >= s)){
                  ++oCount;
              }
        }
        System.out.println(aCount+"\n"+oCount);
        in.close();
    }
}
