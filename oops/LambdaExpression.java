package oops;

public class LambdaExpression {
    public static void main(String[] args) {
        // Addition add=(a,b)->(a+b);
        // System.out.println(add.add(3,6));
        // Addition add2=(int a,int b)->(a+b);
        // System.out.println(add2.add(3,6));
        Sub s=(int a,int b)->(a-b);
        System.out.println(s.subtraction(10, 3));
    }
    
}
// interface Addition{
// int add(int a,int b);
// }

// interface and use LambdaExpression and perform subtraction between 2 numbers
interface Sub{
    public int subtraction(int v,int m); 
}