package oops;

public class IsAConcept {
    public static void main(String[] args) {
        Employee e=new Employee ("IT");
        e.show();
        e.display();

    }
}
class Person{
   private String name;
   private String phoneNumber;
    Person(){
        //this("Aditi Chhetri");
phoneNumber="374003234";
    }
    Person(String name){
        this();
        this.name=name;
    }
    public void display(){
        System.out.println(name+" "+phoneNumber);
    }


}
class Employee extends Person{
    private String domain;
    private int id;
    Employee(){
        super("Anu");
        //this("IT");
        id=10;
    }
    Employee(String domain){
        this();
        this.domain=domain;
    }
    public void show(){
        System.out.println(id+" "+domain);
    }

}
