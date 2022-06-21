package oops;

public class ParentChild {
    public static void main(String[] args) {
        Child ch=new Child();
        ch.print();

    }
    
}
 class Parent{
String name;

 }
class Child extends Parent{
String name;
Child(){
    super.name="Aditi";
this.name="Payaru";
}

 public void print(){
     System.out.println(super.name+" "+this.name);
 }

}