package oops;

public class UpcatingAndDowncasting {
    public static void main(String[] args) {
         //Upcating
        //  Parent parent = new Child();
        //  parent.display();
        //  parent.show();
         //DOwncasting
         Parent parent=new Child();
         Child child=(Child)parent;
         child.display();
         child.show();
    }
    
}
class Parent{
    public void show(){
        System.out.println("Parent Class");
    }
    public void display(){
System.out.println("It preferred parent class");
    }

}
class Child extends Parent{
    public void show(){
 
        System.out.println("Child Class");

    }
    public void display(){
        System.out.println("It preferred child class");
            }

}