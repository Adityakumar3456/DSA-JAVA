package oops_08;

public class inheritance {
    public static void main(String args[]){
        Dogs d1 = new Dogs();
        d1.eat();
        d1.legs = 4;
        System.out.println(d1.legs);
    }
}

class Animal{
    String Hello;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("Breathe");
    }
}

// class Fish extends Animal{
//     void fins(){
//         System.out.println("Swim");
//     }
// }

class Mammal extends Animal{
    int legs;
}

class Dogs extends Mammal{
    String name;
} 