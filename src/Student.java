import java.util.Scanner;

public class Student {
    String name;
    float percentage;
    void Student(String name,float percentage){
        this.name=name;
        this.percentage=percentage;
    }
    void display(){
        System.out.println(name+"  "+percentage);
    }
}
class Test{
    public static void main(String[] args) {
        Student arr[]=new Student[3];

        float max=0.0f;
        Student top=null;
        for(int i=0;i<3;i++)
        {
            Scanner in=new Scanner(System.in);
            String name=in.nextLine();
            float percentage=in.nextFloat();
            arr[i]=new Student();
            arr[i].Student(name,percentage);
            if(arr[i].percentage>max)
            {
                max=arr[i].percentage;
                top=arr[i];
            }
        }
        top.display();
        //System.out.println(top.name+"  "+top.percentage);
    }
}

