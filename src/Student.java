import java.util.Scanner;

public class Student {
    //Declaring instance variables
    String name;
    float percentage;
    //Creating parameterised constructor to initialise instance variables
    Student(String name,float percentage){
        this.name=name;
        this.percentage=percentage;
    }
    //Method to display information of student
    void display(){
        System.out.println(name+"  "+percentage);
    }
}
class Test{
    public static void main(String[] args) {
        Student[] arr =new Student[3]; //Creating an array of class Student type to store objects of the class

        float max=0.0f; //Variable to store maximum percentage
        Student top=null;  // Class Student type variable to store object with maximum percentage
        for(int i=0;i<3;i++)
        {
            Scanner in=new Scanner(System.in);
            arr[i]=new Student(in.nextLine(),in.nextFloat()); // Creating and storing objects of class Student in array arr
            //Finding maximum percentage
            if(arr[i].percentage>max)
            {
                max=arr[i].percentage;
                top=arr[i];
            }
        }
        top.display();//displaying information of student with maximum percentage

    }
}

