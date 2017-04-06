/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmsSection;
import java.util.*;
/**
 *
 * @author vivek.basavaraj123
 */
public class LonelyInteger_BetterSoln {
    
    public static int lonelyInteger(int[] a) {
        
        int result = 0;
        
        for(int i : a) {
            result = result ^ i;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        scanner.close();
        
        System.out.println(lonelyInteger(a));
        
    }
}
