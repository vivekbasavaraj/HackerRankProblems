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
public class LibararyFine {
    
     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int AD = sc.nextInt();
        int AM = sc.nextInt();
        int AY = sc.nextInt();
        int ED = sc.nextInt();
        int EM = sc.nextInt();
        int EY = sc.nextInt();
        sc.close();
        int res = 0;
        if(AY>EY){
            res = 10000;
        }else if(AY==EY){
            if(AM==EM && AD>ED){
                res = 15*(AD-ED);
            }else if(AM>EM){
                res = 500*(AM-EM);
            }else{
                res = 0;
            }
        }
        System.out.println(res);
    }
}
