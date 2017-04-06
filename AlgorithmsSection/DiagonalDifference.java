
package AlgorithmsSection;
import java.io.*;
import java.util.*;

/**
 *
 * @author vivek.basavaraj123
 */
public class DiagonalDifference {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int diag1 = 0, diag2 = 0;
        for(int i=1; i <=n; i++ ){
            for(int j=1; j<=n; j++){
                int t = sc.nextInt();
                if(i==j){
                    diag1 += t;
                }
                if((i+j)==n+1){
                    diag2 += t;
                }
            }
        }
        sc.close();
        System.out.println(Math.abs(diag1-diag2));
    }
}
