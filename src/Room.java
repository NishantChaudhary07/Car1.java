import java.util.*;

public class Room {
    public static void main(String[] args) {

        boolean AC_ON,HOME_THEATRE_ON, FAN_ON, LIGHT_ON;
        int power_cons = 0;
        System.out.println("Enter true for ON and false for OFF \n 1.For Ac \n2.For Home theatre \n3.For Fan \n4.Light");
        Scanner in = new Scanner(System.in);
        AC_ON = in.nextBoolean();
        HOME_THEATRE_ON = in.nextBoolean();
        FAN_ON = in.nextBoolean();
        LIGHT_ON = in.nextBoolean();
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
