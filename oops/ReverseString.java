package oops;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Approach 1
    //     String name = "Java Example";
    //     char arr[] = name.toCharArray();
    //     String rev = "";
    //     for (int i = arr.length - 1; i >= 0; i--) {
    //         rev += arr[i];

    //     }
    //     System.out.println(rev);

//Approach 2
Scanner sc=new Scanner(System.in);
StringBuilder sb=new StringBuilder();
//String s="Java Example";
sb.append(sc.nextLine());
System.out.println(sb.reverse());
sc.close();    
}



}
