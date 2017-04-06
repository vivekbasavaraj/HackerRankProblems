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
public class SummingTheNSeries {
    public static long summation(long n){
//        long sum = 0, i = 0;
//        while(++i <= n){
//            sum += (Math.pow(i, 2) - Math.pow(i-1, 2));
//        }
//        return sum%(long)(Math.pow(10, 9)+7);
          return (long)Math.pow(n,2) % (long)(Math.pow(10, 9)+7);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            System.out.println(summation((long)in.nextInt()));
        }
    }
}
