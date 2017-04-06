
package AlgorithmsSection;
import java.util.*;

/**
 *
 * @author vivek.basavaraj123
 */
public class MinimaxSum_BetterSoln {
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long sum = 0;
        long min = 1000000000;
        long max = 0;
        int i = 0;
//        while(scan.hasNext()) {
        while(i<5) {
            long n = scan.nextLong();
            sum = sum + n;
            if (min > n) {
                min = n;
            }
            if (max < n) {
                max = n;
            }
            ++i;
        }
        scan.close();
        
        System.out.println((sum - max) + " " + (sum - min));
    }
}
