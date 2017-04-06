
package DaysOfCode30Challenge;
import java.lang.reflect.Method;

/**
 *
 * @author vivek.basavaraj123
 */
public class Day21_Generics {
    
    public static <E> void printArray(E[] arr){
        for(E ele: arr){
            System.out.println(ele);
        }
    }
    
    public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        
        printArray( intArray  );
        printArray( stringArray );
        
        if(Day21_Generics.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
    }
}
