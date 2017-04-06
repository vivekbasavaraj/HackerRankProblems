
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
public class DesignerPDFViewer {

    public static void main(String[] args){
        HashMap<Character,Integer> alphaMap = new HashMap<Character,Integer>();
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0 ; i<alphabets.length(); i++){
            alphaMap.put(alphabets.charAt(i), i+1);
        }
        Scanner in = new Scanner(System.in);
        int n = 26, maxHt = 0;
        int h[] = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        for(int i=0; i<word.length(); ++i){
            if(h[(alphaMap.get(word.charAt(i)))-1] > maxHt){
                maxHt = h[(alphaMap.get(word.charAt(i)))-1];
            }
        }
        System.out.println(1*word.length()*maxHt);
    }
}
