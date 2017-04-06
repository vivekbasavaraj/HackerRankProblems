/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmsSection;

/**
 *
 * @author vivek.basavaraj123
 */
import java.util.*;

public class JumpingOnTheClouds {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c[] = new int[n];
        for(int i=0; i<n; i++){
            c[i] = sc.nextInt();
        }
        sc.close();
        int count = 0, j = 0;
        while(j<n-1){
            if((j+2<n)&&(c[j+2]==0)){
                j += 2;
                ++count;
            }else{
                j += 1;
                ++count;
            }
        }
        System.out.println(count);
    }
}
