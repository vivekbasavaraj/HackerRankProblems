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
 * @author Vivek
 */
public class ChocolateFeast {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), c =  sc.nextInt() , m = sc.nextInt();
            int Wraps = 0 , NC = 0, ExcWrap = 0;
            Wraps = NC = n/c;
            while(Wraps >= m){
                ExcWrap = Wraps % m;
                Wraps = Wraps / m;
                NC += Wraps;
                Wraps += ExcWrap;
            }
            System.out.println(NC);
        }
        sc.close();
     }
}
