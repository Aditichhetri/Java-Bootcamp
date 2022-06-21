package oops;


public class OverridingConcept {
    public static void main(String[] args) {
        Student s= new Student();
        s.print();
        s.show();
        s.contactno();
    }
    
}
class Parent {
String naam1;
Parent(){
    naam1="BAAP";
}
public void print(){
    System.out.println(naam1);
}
//Hiding
public void contactno(){
    System.out.println("This is parent's contact number ");
}

}
class Student extends Parent{
    String naam;
    Student(){
        naam="Beta";
    }
    public void show(){
        System.out.println(naam);}
        @Override
    public void contactno(){
        System.out.println("This is child's contact number ");
    }

}
