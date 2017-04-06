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
public class LisasWorkBook {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NC = sc.nextInt(), P3 = sc.nextInt();
        int nP = 0 , SC = 0;
        
        while(NC > 0){
            int iC = sc.nextInt(), m = 0, x = iC, y = 0 ;
            while(m<iC){
                nP++;
               // y = (((m+P3)%P3==0)? (m+(m%3)): (m+P3));
                y = m ;
                if(x/P3>0){
                    m += P3;
                }else{
                    m += iC%P3;
                }
                x -=P3;
               if(nP>y && nP<=m){
                   ++SC;
               }
               // System.out.println(nP+" "+m+" "+iC);                
            }
            --NC;
        }
        System.out.println(SC);
        sc.close();
    }
}
