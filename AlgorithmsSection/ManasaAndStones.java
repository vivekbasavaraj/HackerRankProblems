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
public class ManasaAndStones {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         Set<Integer> seta = new HashSet<Integer>();
         Set<Integer> setb = new HashSet<Integer>();
         while(t-- >0){
             int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
             seta.clear();
             setb.clear();
             setb.add(0);
             for(int i = 1; i<n; i++ ){
                 seta = setb;
               //  setb.clear();
                 Iterator<Integer> it = setb.iterator();
                // set.clear();
                 while(it.hasNext()){
                     //System.out.print(it.+" ");
                     int x = it.next();
                     setb.add(x+a);
                     setb.add(x+b);
                 }
                 System.out.println();
             }
             Iterator<Integer> it2 = setb.iterator();
             while(it2.hasNext()){
                 System.out.print(it2.next()+"  ");
             }
         }
    }
}
