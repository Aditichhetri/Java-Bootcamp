package oops;

public class Stud {
    public static void main(String[] args) {
        Person rahul = new Person(23, 'M');
        // rahul.age=45;
        // rahul.gender='M';
        // System.out.println("AGE OF rahul: "+rahul.age+" "+"GENDER OF rahul:
        // "+rahul.gender);
        rahul.print();

    }

}

class Person {
    private int age;
    private char gender;

    // Parametrized Constructor
    // Person(int age,char gender){
    // this.age=age;
    // this.gender=gender;
    // }
    // print metehod
    // USing SOurce Action Button after ;right click
    public Person(int age, char gender) {
        this.age = age;
        this.gender = gender;
    }

    public void print() {// Print method
        System.out.println("AGE is: " + age + " " + "GENDER : " + gender);
    }
}
