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
public class TaumandBday {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            long r ;
            if(x>z || y>z){
                if(x>z){
                    r = ((z+y)*b) + (w*y);
                }else{
                    r = (b*x) + ((z+x)*w);
                }
            }else{
                r = (b*x) + (w*y);
            }
            System.out.println(r);
        }
        in.close();
    }
}
