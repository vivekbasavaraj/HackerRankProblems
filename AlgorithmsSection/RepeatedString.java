/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmsSection;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author vivek.basavaraj123
 */
public class RepeatedString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        in.close();
        long ca = 0, tl = s.length(),tla = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a'){
                ++ca;
            }
        }
        tla = (n/tl)*ca;
        tl = n%tl;
        int j = 0; 
        while(tl-- >0){
            if(s.charAt(j)=='a'){
                ++tla;
            }
            ++j;
        }
        System.out.println(tla);
    }
}
