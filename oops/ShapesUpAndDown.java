package oops;

public class ShapesUpAndDown {
    public static void main(String[] args) {
        //Upcasting
        Shapes sh=new Circle();
        sh.type();
        System.out.println("######################");
        //Downcating
        Circle circle=new Rectangle();
       Rectangle rectangle  =(Rectangle)circle;
       rectangle.area();
       rectangle.type();

    }
    
}
class Shapes{
public void type(){
System.out.println("curved");
}

}
class Circle extends Shapes{
    public void area(){
        System.out.println("pi*r*r");
        }


}
class Rectangle extends Circle{
    public void area(){
        System.out.println("l*b");
        }
}