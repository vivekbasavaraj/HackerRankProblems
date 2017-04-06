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
public class CavityMap {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
         int[][] Mp = new int[N][N];
         for(int i = 0; i<N ; i++){
             String str = sc.next();
             for(int j = 0; j<N ; j++){
                 
                 Mp[i][j] = Character.getNumericValue(str.charAt(j));
             }
         }
         sc.close();
         for(int i = 1; i<N-1; i++ ){
             for(int j = 1; j<N-1; j++){
                 int t = Mp[i][j];
                 if(Mp[i][j-1]<t && Mp[i][j+1]<t && Mp[i-1][j]<t && Mp[i+1][j]<t){
                     Mp[i][j]=999;
                 }
             }
         }
         for(int i = 0; i<N ; i++){
             for(int j = 0; j<N ; j++){
                 if(Mp[i][j]==999){
                    System.out.print('X');
                 }else{
                    System.out.print(Mp[i][j]);
                 }
             }
             System.out.println();
         }
        /* while(N-->0){
         System.out.println(sc.next());
     }*/
     }
}
