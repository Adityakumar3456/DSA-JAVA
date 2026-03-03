package oops_08;

public class staticc {
    public static void main(String [] args){
        Master m1 = new Master();
        m1.name = "Hello";
        System.out.print(m1.name + Master.College);
    }
}

class Master{
    String name;
    static String College = "ABC College";
    
}
