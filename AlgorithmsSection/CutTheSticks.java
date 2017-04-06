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
public class CutTheSticks {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<Integer>();
        while(n-- >0){
            arr.add(sc.nextInt());
        }
        sc.close();
        Collections.sort(arr);
        int low,count ;
        while(!arr.isEmpty()){
            System.out.println(arr.size());
            low = arr.get(0);
            count = 0;
            for (int i=0; i<arr.size();i++) {
                int t = arr.get(i) - low;
                if(t==0){
                    ++count;
                }
                arr.set(i, t);
            }
            while(count-- >0){
                arr.remove(0);
            }
            
        }
    }
}
