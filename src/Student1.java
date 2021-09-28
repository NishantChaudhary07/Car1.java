import java.util.*;
public class Student1 {
    String name,address;
    int age;
    void Student1()
    {
        name="unknown";
        age=0;
        address="not available";
    }
    void setInfo(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    void setInfo(String name,int age,String address)
    {
        this.name=name;
        this.age=age;
        this.address=address;
    }
    void display()
    {
        System.out.println(name+"\n"+age+"\n"+address);
    }

    public static void main(String[] args) {
        Student1 arr[]=new Student1[10];
        for(int i=0;i<10;i++)
        {
            Scanner in=new Scanner(System.in);
            String name=in.nextLine();
            int age=in.nextInt();
            in.nextLine();
            String address=in.nextLine();
            arr[i]=new Student1();
            arr[i].setInfo(name,age,address);
        }
        for(int i=0;i<10;i++) {
            arr[i].display();
        }
        }
    }


