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

public class HalloweenParty {
    public static long chocoPieces(int cuts){
        return (long) Math.floor((Math.pow(cuts, 2))/4);
        //https://oeis.org/search?q=1%2C2%2C4%2C6%2C9%2C12%2C16&language=english&go=Search
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- >0){
            System.out.println(chocoPieces(in.nextInt()));
        }
        in.close();
    }
}
