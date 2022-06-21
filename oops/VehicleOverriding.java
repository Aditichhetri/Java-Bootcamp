package oops;

public class VehicleOverriding {
    public static void main(String[] args) {
        Car c= new Car();
        c.display();
        c.display1();
    }
}
 class Vehicle{
int engineno;
String type;
Vehicle(){
    this(33);
    type="Passenger";
}
Vehicle(int engineno){
    this.engineno=engineno;
}
public void display1(){
    System.out.println("Engine number is is: "+engineno);
    System.out.println("Type of Car  is: "+type);

}



 }

 class Car extends Vehicle{
int carno;
String model;
Car(){
    this(58977);
    model="Sedan";
}
Car(int carno){
    super();
    this.carno=carno;
}
public void display(){
    System.out.println("model is: "+model);
    System.out.println("Car number is: "+carno);

}
 }