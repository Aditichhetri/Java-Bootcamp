package Basics;
import java.util.Scanner;

public class ScannerConcept {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age");
        int age=sc.nextInt();

        System.out.println("Enter your gender: ");
        char gender = sc.next().charAt(0);

        System.out.println("Enter your cgpa: ");
        double cgpa= sc.nextDouble();

        System.out.println("Enter your phone number: ");
        long mobileNo= sc.nextLong();
        sc.close();

        System.out.println("Name is :"+name);
        System.out.println("age is :"+age);
        System.out.println(" gender is :"+gender);
        System.out.println(" cgpa is :"+cgpa);
        System.out.println(" Phone Number is :"+mobileNo);
  
      
    }
    
}
