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
public class FairRations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt() , noe = 0 , noo = 0 ;
        //HashMap<Integer,Character> Br = new HashMap<Integer,Character>();
        int Br[] = new int[N];
        for(int i = 0 ; i<N ; i++){
            int lo = sc.nextInt();
            if(lo%2==0){
                Br[i] = 0;
                ++noe;
            }else{
                Br[i] = 1;
                ++noo;
            }
           
        }
        sc.close();
        if(noo%2!=0){
            System.out.println("NO");
        }else{
            int j=0, bl = 0 ;
            while(noe!=N){
                if(Br[j]==1){
                    Br[j]=0;
                 ++noe;
                 --noo;
                 ++bl;
                 if((j+1>=0 && j+1<N) && Br[j+1]==1){
                    Br[j+1]=0;
                    ++noe;
                    --noo;
                    ++bl;
                 }else if((j-1>=0 && j-1<N) && Br[j-1]==1){
                    Br[j-1]=0;
                    ++noe;
                    --noo;
                    ++bl;
                }else if((j+1>=0 && j+1<N) && Br[j+1]==0){
                    Br[j+1]=1;
                    --noe;
                    ++noo;
                    ++bl;
                }else if((j-1>=0 && j-1<N) && Br[j-1]==0){
                    Br[j-1]=1;
                    --noe;
                    ++noo;
                    ++bl;
                }
            }
            ++j;
            j = j%N;
        }
        System.out.println(bl);
    
        }
    }
}
