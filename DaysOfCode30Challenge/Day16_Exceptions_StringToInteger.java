
package DaysOfCode30Challenge;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/**
 *
 * @author vivek.basavaraj123
 */
public class Day16_Exceptions_StringToInteger {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
            System.out.println(Integer.parseInt(S));
        }
//         try(Scanner scan = new Scanner(System.in);){
//            System.out.println( Integer.parseInt(scan.nextLine()) );
//        }
        catch(Exception e){
            System.out.println("Bad String");
        }
        
    }
    
}
