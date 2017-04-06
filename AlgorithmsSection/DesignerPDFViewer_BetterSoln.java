
package AlgorithmsSection;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author vivek.basavaraj123
 */
public class DesignerPDFViewer_BetterSoln {
     public static void main(String args[] ) throws Exception {
        Scanner br = new Scanner(System.in);

        int ans = 0;
        int heights [] = new int[26];

        for (int i = 0; i < 26; i++) 
            heights[i] = br.nextInt();

		String word = br.next();
		int rect_height = 0;

		for(int j = 0; j < word.length(); j++) 
			rect_height = Math.max(rect_height,
			heights[(int)word.charAt(j) - (int)'a']);

		ans += 1 * word.length() * rect_height;

        System.out.println(ans);
    }
}
