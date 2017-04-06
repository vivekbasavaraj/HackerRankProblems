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
public class ServiceLane {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int N , T;
        N = sc.nextInt();
        T = sc.nextInt();
        int S[] = new int[N];
        for(int k = 0; k<N ; k++){
            S[k] = sc.nextInt();
        }
        for(int k = 0; k<T ; k++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int min = 4;
            for(int l=i; l<=j; l++){
                if(S[l]<min){
                    min = S[l];
                }
            }
            System.out.println(min);
        }
        sc.close();
    }
}
