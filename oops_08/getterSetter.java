package oops_08;

public class getterSetter {
    public static void main(String args[]){
        pen p1 = new pen();
        p1.setColor("red");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

    }
}

//getter is used to return the value 
//setter is used to modify the value

class pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newcolor){
        this.color = newcolor;
    }

    void setTip(int newTip){
        this.tip =newTip;
    }
}
