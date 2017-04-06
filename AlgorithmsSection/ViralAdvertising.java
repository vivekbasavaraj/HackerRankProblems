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
public class ViralAdvertising {
    
     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), res = 0, d = 5;
        sc.close();
        while(n-- > 0){
            int t = (int)Math.floor(d/2);
            res += t;
            d=t*3;
        }
        System.out.println(res);
    }
}
