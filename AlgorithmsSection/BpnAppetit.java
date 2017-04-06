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
public class BpnAppetit {
 
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt(), sharedCost = 0;
        int[] items = new int[n];
        for(int i=0; i<n; i++){
            items[i] = in.nextInt();
            if(i!=k){
                sharedCost += items[i];
            }
        }
        int p = in.nextInt();
        in.close();
        int fc = p - (sharedCost/2);
        if(fc==0){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(fc);
        }
        
        
    }
}
