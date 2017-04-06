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
public class LonelyInteger {
     private static int lonelyInteger(int[] a) {
        return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        int[] a = new int[n];
        ArrayList<Integer> lst = new ArrayList<Integer>();
//        for (int i = 0; i < n; i++) {
//            a[i] = in.nextInt();
//        }
        while(n-- >0){
            Integer ele = in.nextInt();
            if(!lst.contains(ele)){
                lst.add(ele);
            }else{
                lst.remove(ele);
            }
        }
       // System.out.println(lonelyInteger(a));
       System.out.println(lst.get(0));
    }
}
