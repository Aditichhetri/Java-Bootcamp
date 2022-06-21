package oops;

public class FinalConcept {
    public static void main(String[] args) {
        //Final keyword is used to create a variable ko constant banane ke liye,jaise cpp mein we use const keyword.
        //Prevent Overriding
        //Prvent class from Overriding
// final int j=23;
//j=34;
//System.out.println(j);
B obj=new B();
obj.show();

    }
}
 /*final*/ class A{
public /*final*/  void show(){System.out.println("HI");}

}
class B extends A{
    public void  show(){System.out.println("HELLO");}

}