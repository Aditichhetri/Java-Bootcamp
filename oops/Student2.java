package oops;

public class Student2 {
private int id;
private String name;
private double fees;
private String collegeName; 

//How to call 3 constructor
public Student2(){
    this(10,"Ram Prakash");//2ns constructor
    collegeName="DIT";
}


    public Student2(int id, String name) {
        this(2022.0);//3rd constructor
    this.id = id;
    this.name = name;
}


    public Student2(double fees) {
        this.fees = fees;
    }
    public void print (){
        System.out.println("ID is: "+id+"NAme is: "+name+"Fees is: "+fees+"college name is: "+collegeName);
    }


    public static void main(String[] args) {
        Student2 ram=new Student2();
        ram.print();

    }
    
}
