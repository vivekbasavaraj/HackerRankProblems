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
public class FindDigits {
    public static int dig(int n){
        int m = n, count = 0;
        while(n>0){
            int t = n%10;
            if(t!=0 && m%t==0){
                ++count;
            }
            n = n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println(dig(sc.nextInt()));
        }
        sc.close();
    }
}
