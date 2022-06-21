package Basics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class NextLineAndBufferedReaderClass {
    public static void main(String[] args) throws IOException {
        //Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer");
       // int a=sc.nextInt();
        int a=Integer.parseInt(br.readLine());

        
        System.out.println("Enter a string");
        //String b=sc.nextLine();
        String b=br.readLine();
        System.out.println("You have entered  "+a+" "+b);
    }
    
}
