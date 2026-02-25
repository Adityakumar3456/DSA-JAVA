package oops_08;

public class Abstract {
    public static void main(String args){
        // Horse h1 = new Horse();
        // h1.eat();
        // h1.legs();
        // System.out.println(h1.color);

        Mustang m1 = new Mustang();
        //Animal -> Horse -> Mustang
    }
}

abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal");
    }
    

    void eat(){
        System.out.println("Eats food");
    }

    abstract void legs();   //abstract method
}

class Horse extends Animal{

    void changecolor(){
        System.out.println("Horse");
    }
    void legs(){
        System.out.println("Horse has 4 legs");  //necessary to call and implement the abstract method of abstract class
    }
}

class Mustang extends Horse{
    void change(){
        System.out.println("Mustang");
    }
}

class Chicken extends Animal{

    void changecolor(){
        color = "white";
    }
    void legs(){
        System.out.println("Chicken has 2 legs");    //necessary to call and implement the abstract method of abstract class
    }
}
