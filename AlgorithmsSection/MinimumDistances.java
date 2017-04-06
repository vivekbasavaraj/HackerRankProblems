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
public class MinimumDistances {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), minVal = 2147483647 ;
        HashMap map = new HashMap<Integer, Integer>();
        for(int i =0; i< n; i++){
            int num = in.nextInt();
            if(map.containsKey(num)){
                int t = (Integer) map.get(num);
                if(Math.abs(t-i)<minVal){
                    minVal = Math.abs(t-i);
                }
            }else{
                map.put(num, i);
            }
        }
        in.close();
        if(minVal == 2147483647)
        {
            System.out.println(-1);
        }else{
            System.out.println(minVal);
        }
    }
}
