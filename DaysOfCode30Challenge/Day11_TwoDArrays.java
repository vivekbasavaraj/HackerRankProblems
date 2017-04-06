
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
public class Day11_TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int sum = -64, tempSum;
        for(int i=0; i+3 <= 6; i++){
            for(int j=0; j+3 <= 6; j++){
                tempSum = 0;
                tempSum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if(tempSum > sum){
                    sum = tempSum;
                }
            }
        }
        System.out.println(sum);
    }
}
