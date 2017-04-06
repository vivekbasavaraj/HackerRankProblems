/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaysOfCode30Challenge;
import java.io.*;
import java.util.*;

/**
 *
 * @author vivek.basavaraj123
 */
public class Day25_RunningTimeAndComplexity {
    
     public static Boolean prime(int n){
         if(n==1){
             return false;
         }
         if(n>2 && n%2==0){
             return false;
         }
         for(int i=3; i*i <= n ;i+=2){
             if(n%i==0){
                 return false;
             }
         }
         return true;
     }
     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- >0){
            if(prime(sc.nextInt())){
                System.out.println("Prime");
            }else{
                System.out.println("Not prime");
            }
        }
        sc.close();
    }
}
