package oops;

public class IsADemo {
    public static void main(String[] args) {
        Student student=new Student();
        student.printId();
        student.printName();//2 constructor kaise chal rahe hai saath mein because jo child class ne extend kia parent class ko toh isske default contructer ke pass super () hoga vo upar walee ke default constructor ko call kar dega!
    }
    
}
// parent class /base class
class Person{
    String name;
    // Person(){
    //     name="Aditi Chhetri";
    // }
    Person(String name){
        this.name=name;
    }
    public void printName()
    {
        System.out.println("Name is: "+name);
    }

}
// sub class /child class/derived class
class Student extends Person{
    int id;
    Student(){
        super("Anushka Chhetri");//Call to parametrized constructor
        //super();//Call to Default constructor of parent class
        id=34;
    }
    public void printId(){
        System.out.println("Id is: "+id);
    }

}
