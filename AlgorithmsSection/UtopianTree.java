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
public class UtopianTree {
    public static int utopian(int cycle){
        int res = 1, i =0;
        while(++i <= cycle){
            if(i%2 == 1){
                res = res*2;
            }else{
                res += 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            System.out.println(utopian(in.nextInt()));
        }
        in.close();
    }
}
