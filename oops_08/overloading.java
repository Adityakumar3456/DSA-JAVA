package oops_08;
public class overloading {
    public static void main(String args[]){
        calculator calc = new calculator();
        System.out.println(calc.sum(2,4));
        System.out.println(calc.sum((float)2.4,(float)4.8));       //same method from different parameter
        System.out.println(calc.sum(2,4,4));

    }
}

class calculator{
    int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b){       //method overload
        return a+b;
    }

    int sum(int a, int b, int c){     //method overload
        return a+b+c;
    }
}
