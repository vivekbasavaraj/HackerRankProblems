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
public class SockMerchant {

        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt() , count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        while(n-- >0){
            int sock = in.nextInt();
            if(map.containsKey(sock)){
                int ns = map.get(sock);
                map.replace(sock, ns+1);
                if((ns+1) % 2 == 0){
                    ++count;
                }
            }else{
                map.put(sock, 1);
            }
        }
        in.close();
        System.out.println(count);
    }

}
