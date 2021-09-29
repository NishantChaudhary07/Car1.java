/*Q7. Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
 then the message "I love programming languages" should be printed. If some String is passed to it,
 then in place of "programming languages" the name of that String variable should be printed.
For example, while creating object if we pass "Java", then "I love Java" should be printed.*/

import java.util.*;
public class Programming {
    Programming(){   //non parameterised constructor
        System.out.println("I love programming languages");
    }
    Programming(String s){  // Parameterised constructor(Constructor overloading)
        System.out.println("I love "+s);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);  //Creating scanner class object
        String s=in.nextLine();  //Taking input from user
        //Calling parameterised constructor if something is passed to s else calling non-parameterised constructor
        if(s=="")
        {
            Programming obj=new Programming();
        }
        else {
            Programming obj = new Programming(s);
        }
    }
}
