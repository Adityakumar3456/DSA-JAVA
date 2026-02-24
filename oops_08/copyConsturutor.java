package oops_08;

public class copyConsturutor {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Hello";
        s1.roll= 123;
        s1.password = "abcd";

        s1.marks[0] = 100;
        s1.marks[1] = 98;
        s1.marks[2] = 97;

        Student s2 = new Student(s1);
        s2.password = "Hello";
        s2.marks[0] = 99;



    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[] = new int[3];

    // copy constructor or shallow copy

    // Student(Student s1){
    //     int marks[] = new int[3];
    //     this.marks = s1.marks;
    //     this.name = s1.name;
    //     this.roll = s1.roll;

    //     this.password = s1.password;

    //     for(int i = 0; i < marks.length; i++){
    //      s1.marks[i];
    //     }
    // }

    //Deep copy
    Student(Student s1){
        int marks[] = new int[3];
        this.marks = s1.marks;
        this.name = s1.name;
        this.roll = s1.roll;

        this.password = s1.password;

        for(int i = 0; i < marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }

    Student(){
        System.out.print("");
    }

}
