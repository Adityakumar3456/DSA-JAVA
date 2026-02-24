package oops_08;
public class consturctor {
    public static void main(String args[]){
        Student s1 = new Student("Hello");
        System.out.print(s1.name);
    }
}

class Student{
    String name;
    int roll;

    Student(String name){             //This is a constructor we are calling. If we don't call also this will call itsef automatically
        System.out.println("This is constructor");
        this.name = name;
    }
}

