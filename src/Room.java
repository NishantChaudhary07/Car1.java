/*Q2. Design a class Room that has properties AC_ON, HOME_THEATRE_ON, FAN_ON and LIGHT_ON that stores Boolean values to indicate whether the appliance is ON or OFF. Design a menu driven program in java that puts ON/OFF the corresponding appliances and gives appropriate message. If the total power consumed is more than 2kW, show a message Overload. Assume AC consumes 1200 watts, Home Theatre consumes 600 watts, Fan consumes 400 watts and light consumes 100 watt.*/
import java.util.*;

public class Room {
    public static void main(String[] args) {

        boolean AC_ON,HOME_THEATRE_ON, FAN_ON, LIGHT_ON; // Declaring instance variable
        int power_cons = 0; //Variable to calculate total power consumption
        System.out.println("Enter true for ON and false for OFF \n 1.For Ac \n2.For Home theatre \n3.For Fan \n4.Light");
        Scanner in = new Scanner(System.in); // Creating scanner class object
        // Taking input of boolean type from user
        AC_ON = in.nextBoolean();
        HOME_THEATRE_ON = in.nextBoolean();
        FAN_ON = in.nextBoolean();
        LIGHT_ON = in.nextBoolean();
        // Calculating total power consumed
        if (AC_ON == true) {
            power_cons+=1200;
        }
        if(HOME_THEATRE_ON==true){
            power_cons+=600;
        }
        if(FAN_ON==true)
        {
            power_cons+=400;
        }
        if(LIGHT_ON==true)
        {
            power_cons+=100;
        }
        //Displaying output
        if(power_cons>2000)
        {
            System.out.println("Overload");
        }
        else
        {
            System.out.println("Not Overloaded");
        }
    }
}
