/*Q5. Create a class 'Student' with three data members which are name, age and address. The constructor of the class assigns default values name as "unknown", age as '0' and address as "not available". It has two member methods with the same name “setInfo”. First method has two parameters for name and age and assigns the same whereas the second method takes three parameters which are assigned to name, age and address respectively. Print the name, age and address of 10 students.*/
import java.util.*;
public class Student1 {
    //Declaring instance variables
    String name,address;
    int age;
    //Constructor to initialise instance variables
    void Student1()
    {
        name="unknown";
        age=0;
        address="not available";
    }
    void setInfo(String name,int age)//Method to initialise data members
    {
        this.name=name;
        this.age=age;
    }
    void setInfo(String name,int age,String address)// Method overloading to initialise data members
    {
        this.name=name;
        this.age=age;
        this.address=address;
    }
    void display()//Method to display data members
    {
        System.out.println(name+"\n"+age+"\n"+address);
    }

    public static void main(String[] args) {
        Student1 arr[]=new Student1[10];  ////Creating an array of class Student1 type to store 10 objects of the class
        for(int i=0;i<10;i++)
        {
            Scanner in=new Scanner(System.in);
            arr[i]=new Student1();  //// Creating and storing objects of class Student in array arr
            arr[i].setInfo(in.nextLine(),in.nextInt(),in.nextLine());//Calling setInfo method to initialise data members
        }
        for(int i=0;i<10;i++) {
            arr[i].display();//Displaying data members
        }
        }
    }


