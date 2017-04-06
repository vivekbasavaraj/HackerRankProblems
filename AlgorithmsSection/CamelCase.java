
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
public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        in.close();
        int count =1;
        for(int i=0; i<s.length(); ++i){
            Character t = s.charAt(i);
            if(Character.isUpperCase(t)){
                ++count;
            }
        }
        System.out.println(count);
    }

}
