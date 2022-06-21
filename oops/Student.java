package oops;

public class Student {
    // class variables/instance variables/data members
    // Private :data Security
    
    private int rollno;
    private String name;
    private String phone ;
    private String course;
    private double fees;
    private String collegeName;


    // Default Constructor
    Student(){
        //Call to parametrzied Constructor

        // always this should be in firstline. 
     //this(10, "Ram Kumar", "9870676365", "BCa", 120000.0);
    collegeName="DIT";
    }


    //PArametrized Constructor
    Student(int rollno,String name,String phone,String course,double fees){
      this();//This is called Constructor Chaining:Call to default constructor
        //this();:not possible because constructor is called only once
        this.rollno=rollno;
        this.name=name;
        this.phone=phone;
        this.course=course;
        this.fees=fees;
        }

    
//Parametrized method to initialize the variable
// r,n,p,c,f-->local variables(scope inside the function/block)
// public void takeInput(int r,String n,String p,String c,double f){
    // public void takeInput(int rollno,String name,String phone,String course,double fees){
    //     // assign local variables to the  instance variable 
    //     // WARNING:ON:rollno=rollno; The assignment to variable name has no effect
    //     this.rollno=rollno;
    //     this.name=name;
    //     this.phone=phone;
    //     this.course=course;
    //     this.fees=fees;
    //     }

// Creating our own method
//Rama hata denge kyuki isse koi bhi access kar sakta hai
// also ye roll no. wagerah easily accessible haii private hone ke baad bhi ,toh uska reason ye hai ki :ek hi class mein hai
public void print() {
        System.out.println("Roll number is: "+this.rollno);
        System.out.println("Name is: "+name);
        System.out.println("Phone is: "+phone);
        System.out.println("Course is: "+course);
        System.out.println("Fees is: "+fees);
        System.out.println("College name is: "+collegeName);

}
//GETTER-value get karni hai toh; SETTER-value set karni hai toh setter

public String getPhone() {
    return phone;
}
public void setPhone(String phone) {
    this.phone = phone;
}





// Problem with this code:1)No use of access specifiers:No data Security ,as variables are easily accessible
//                        2)Duplicacy :Whenever we will change anything print has to be written again and again.
    public static void main(String[] args) {
        //Call to parametrized constructor
        Student ram= new Student(10, "Ram Kumar", "9870676365", "BCa", 120000.0);
        //Student ram = new Student();//new-->to allocate dynamic memory,ram is refrence variable also object created at right side.ALso,Student()is call to default constructor.
        // bularahe hai print method  ko
       // ram.takeInput(10, "Ram Kumar", "9870676365", "BCa", 120000.0);
        ram.print();
        
        // ram.setPhone("8859438661");
        // System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        // ram.print();
        
        // System.out.println("Roll number is: "+ram.rollno);
        // System.out.println("Name is: "+ram.name);
        // System.out.println("Phone is: "+ram.phone);
        // System.out.println("Course is: "+ram.course);
        // System.out.println("Fees is: "+ram.fees);


        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        
        // ram.rollno=34;
        // ram.name="Ram kumar";
        // ram.phone="9870676365";
        // ram.course="BCA";
        // ram.fees= 120000.00;

        // System.out.println("Roll number is: "+ram.rollno);
        // System.out.println("Name is: "+ram.name);
        // System.out.println("Phone is: "+ram.phone);
        // System.out.println("Course is: "+ram.course);
        // System.out.println("Fees is: "+ram.fees);
    
        Student shayam=new Student(11, "Shayam kapoor", "887067335", "BTch", 12000.0);
        shayam.print();
    }

}
