package oops_08;

public class overriding {
    public static void main(String args[]){
        Lion l1 = new Lion();
        l1.eat();  //we made the eat method in Animal first but when we extend or change it in the child class it will run only of child
    }
}

class Animals{
    void eat(){
        System.out.println("Eats the food");
    }
}

class Lion extends Animals{
    void eat(){        //override the same method with different definion in child class
        System.out.println("Eats the Deer and drinkss Beer!!!  Faaa");
    }
}
