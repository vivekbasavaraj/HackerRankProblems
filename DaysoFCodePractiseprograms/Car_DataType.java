
package DaysoFCodePractiseprograms;

/**
 *
 * @author vivek.basavaraj123
 */
public class Car_DataType {

    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn = false;
    char condition = 'A';
    
    public void printVariables(){
        System.out.println("This is the Maximum speed "+maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
    }
    
    public void wreck(){
        condition = 'C';
    }
    public void upgradeMinSpeed(){
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed +1;
    }
    public static void main(String[] args){
        Car_DataType alto = new Car_DataType();
        alto.printVariables();
        Car_DataType altoXl = alto;
        alto.wreck();
        altoXl.printVariables();
        alto.upgradeMinSpeed();
        alto.printVariables();
        
    }
}
