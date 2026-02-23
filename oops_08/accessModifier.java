package oops_08;

public class accessModifier {
    public static void main(String args[]){
        bank b1 = new bank();
        b1.username = "hello";
        b1.setPassword("hello");
    }
}

class bank{
    public String username;
    private String Password;

    public void setPassword(String pwd){
        Password = pwd;
    }
}
