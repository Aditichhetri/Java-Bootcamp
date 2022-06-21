package ExceptionHandling;
import java.util.Scanner;
public class Divison {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
System.out.println("Enter 2 numbers to divide");
int num1=sc.nextInt();
int num2=sc.nextInt();
double ans;
try{
ans=num1/num2;}
catch(ArithmeticException e) {
System.out.println("You dividing number by 0");
return;
}
System.out.println("Answer is "+ans);
    }
    
}
