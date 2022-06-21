package Basics;
import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        // String status="night";
        // if(status=="night")
        // {
        // System.out.println("Sleep");
        // }
        // else{System.out.println("Work");}

        // Find Maximum of 3 elements
        // int a=4,b=3,c=200;
        // if(a>b){
        // if(a>c)System.out.println("MAX: "+a);
        // else System.out.println("MAX: "+c);
        // }
        // else if(b>a){
        // if(b>c)System.out.println("MAX: "+b);
        // else System.out.println("MAX: "+c);
        // }
        // else System.out.println("MAX: "+c);

        // By using logical and &&
        // if(a>b&& a>c){
        // System.out.println("max: "+a);
        // }
        // else if(b>c){System.out.println("max: "+b);}
        // else System.out.println("max: "+c);

        // //Ternary Operator
        // String result= (status=="day")? "Sleep":"Work";
        // System.out.println(result);

        // Switch Case
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        String choice = sc.nextLine();
        switch (choice) {
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("Two");
                break;
            default:
                System.out.println("Default");
                break;
        }
        sc.close();

    }

}
