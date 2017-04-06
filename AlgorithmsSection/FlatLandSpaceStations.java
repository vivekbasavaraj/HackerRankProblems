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
public class FlatLandSpaceStations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nc = sc.nextInt(), mss = sc.nextInt();
        int[] ssc = new int[mss];
        for(int i=0; i<mss ; i++){
            ssc[i] = sc.nextInt();
        }
        sc.close();
        int md = 0;
        for(int i=0; i<nc; i++){
            int d = (int)Math.pow(10, 5);
            for(int j = 0; j< mss; j++){
                if(ssc[j]==i){
                    d = 0;
                    break;
                }else if(Math.abs(ssc[j]-i)<d){
                    d = Math.abs(ssc[j]-i);
                }
            }
           
                if(d>md){
                    md = d;
                }
            
        }
        System.out.println(md);
    }
}
