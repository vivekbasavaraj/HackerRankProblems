/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmsSection;
import java.io.*;
import java.util.*;

/**
 *
 * @author vivek.basavaraj123
 */
public class BeautifulDaysAtMovie {
    public static int reverse(int n){
        int rev = 0 , temp = 0;
        while(n>0){
            temp = n%10;
            rev = rev * 10 +temp;
            n = n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int i = in.nextInt(), j = in.nextInt(), k = in.nextInt(), count = 0;
        in.close();
        while(i <=j){
            if((Math.abs(i-reverse(i))%k)==0){
                ++count;
            }
            ++i;
        }
        System.out.println(count);
    }
}
