import java.util.*;
public class Car {
    String manufacturer;
    int price;

    Car(){     //Constructor to initialize instance variables
        Scanner in=new Scanner(System.in);
        manufacturer=in.nextLine();
        price=in.nextInt();
    }
    void display(){    //Method to display details of the car
        System.out.println(manufacturer+" "+price);
    }

    public static void main(String[] args) {
        Car arr[]=new Car[3];      // Class Car type array to store three objects of class
        for(int i=0;i<3;i++)
        {
            arr[i]=new Car();           //Storing objects of class Car in array arr
        }
        //sorting array arr according to price of the car
        for(int i=0;i<3;i++)
        {
            for(int j=i+1;j<3;j++)
            {
                if(arr[i].price>arr[j].price)
                {
                    Car temp=arr[i];   // Creating a class Car type variable to store object for swapping purpose
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<3;i++) {
           arr[i].display();//Displaying the sorted array
        }
    }
}
