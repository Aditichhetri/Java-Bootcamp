package oops;

public class Protected {
    public static void main(String[] args) {
    B obj =new B(); 
    obj.print();
    }
    
}

class A{
protected int a;
A(){
    a=19;
}

}
class B extends A{
    public void print()
    {
        System.out.println(a);
    }

}