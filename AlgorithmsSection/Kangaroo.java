
package AlgorithmsSection;
import java.io.*;
import java.util.*;


/**
 *
 * @author vivek.basavaraj123
2 */
public class Kangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        int[] dis = new int[4];
        dis[0] = x2-x1;
        for(int i=1; i<4; i++){
            x2 += v2;
            x1 += v1;
            dis[i] = (x2)-(x1);
        }
        
    }

}
