/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaysOfCode30Challenge;

import java.util.Scanner;

/**
 *
 * @author vivek.basavaraj123
 */
public class Day00_HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        sc.close();
        System.out.println("Hello World");
        System.out.println(inputString);
    }
    
}
