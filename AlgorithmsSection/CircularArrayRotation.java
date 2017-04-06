
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
public class CircularArrayRotation {

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            int t = ((a_i)+k)%n;
            b[t] = a[a_i];
        }
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(b[m]);
        }
        in.close();
        
     }
}
