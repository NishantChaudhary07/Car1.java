/*Q6. Suppose you have a Piggie Bank with an initial amount of 50 and you have to add some more amount to it.
Create a class 'AddAmount' with a data member named 'amount' with an initial value of 50.
 Now make two constructors of this class as follows:
1 - without any parameter - no amount will be added to the Piggie Bank
2 - having a parameter which is the amount that will be added to Piggie Bank
Create object of the 'AddAmount' class and display the final amount in Piggie Bank.*/
import java.util.*;
public class AddAmount {
    int amount=50; // Creating an instance variable with initial amount 50
    AddAmount(){
        amount=50; //Constructor without parameter that do not add any amount to Piggie bank
    }
    AddAmount(int add_amount) //Parameterised constructor to add amount to Piggie bank
    {
        amount+=add_amount;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);  //Creating Scanner class object
        AddAmount obj=new AddAmount(in.nextInt());  // Creating object of the class
        System.out.print("Final Amount="+obj.amount); //Printing final amount in the Piggie bank
    }
}
