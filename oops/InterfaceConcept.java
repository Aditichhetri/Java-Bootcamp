package oops;

public class InterfaceConcept {
    public static void main(String[] args) {
        Child obj=new Child();
        obj.display();
        //using Static keyword
        Print.printing();
    }
    
}
 interface Print{
public static void printing(){
    System.out.println("Printing method of interface class Print");
}
}
interface Show{
public void display();
    
}
//class implements the interface
class Child implements Print, Show{//Multiple interface helps in multiple inheritance
    public void display(){
System.out.println("Display method of interface class Show");
    }

//    {System.out.println("Printing method of interface class Print");
   // }
}