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
public class AngryProfessor {
   
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt(), k = in.nextInt(), count = 0 ;
            while(n-- >0){
                if(in.nextInt() <= 0){
                    count++;
                }
            }
            if(count >= k){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
            
        }
        in.close();
    }
}
