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
public class FairRationsBetter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Br[] = new int[N];
        for(int i = 0 ; i<N ; i++){
            int lo = sc.nextInt();
            if(lo%2==0){
                Br[i] = 0;
            }else{
                Br[i] = 1;
            }
        }
        sc.close();
        int bl = 0 ;
        for(int i = 0 ; i<N-1 ; i++){
            if(Br[i]==1){
                Br[i] = 0;
                if(Br[i+1]==0){
                    Br[i+1] = 1;
                }else{
                    Br[i+1] = 0;
                }
                bl += 2;
            }
        }
        if(Br[N-1]==0){
            System.out.println(bl);
        }else{
            System.out.println("NO");
        }
    }
}
