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
public class SaveThePrisoner {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int T, N, M, S, id = 0;
        T = in.nextInt();
        while(T-- > 0){
            N = in.nextInt();
            M = in.nextInt();
            S = in.nextInt();
            id = ((S-1)+ M)% N;
            if(id==0){
                id = N;
            }
            System.out.println(id);
        }
        in.close();
    }
}
