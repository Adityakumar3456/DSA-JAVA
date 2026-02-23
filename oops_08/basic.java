package oops_08;

public class basic {

    public static void main(String args[]){
        pen p1 = new pen();
        p1.colourChange("red");
        System.out.println(p1.colour);

        student s1 = new student();
        s1.getPercentage(80,77,89);
        System.out.println(s1.percentage);
    }
    
}

class pen{
    String colour;
    int tip;

    void colourChange(String newColour){
        colour = newColour;
    }

    void tipChange(int newTip){
        tip = newTip;
    }
}

class student{
    String name;
    int Age;
    float percentage;

    void getPercentage(int phy, int chem, int maths){
        percentage = (phy + chem+ maths)/3;
    }

}
