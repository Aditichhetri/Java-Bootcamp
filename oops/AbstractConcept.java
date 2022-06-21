package oops;

public class AbstractConcept {
     public static void main(String[] args) {
         Student s=new Student(23);
         s.contactno();
         s.show();
         s.show1();
         

     }
    
}
abstract class Person{//Have to make this class also Abstract
private String name;
private int age;
Person(String name,int age){
    this.name=name;
    this.age=age;
}
public abstract void contactno();//Abstract method without body
public void show(){
    System.out.println(name+" "+age);
}

}
  class Student extends Person 
{
    private int id;
    Student(int id)
    {   super("Aditi",20);
        this.id=id;
    }
    public void show1(){
        System.out.println(id);
    }
    public void contactno(){
        System.out.println("This is contact number");
    }


}