package Basics;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        boolean var=true;

        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                var=false;
            break;}
        }
        if(var==false)
        System.out.println("not prime");
        else
        System.out.println("Prime");
        sc.close();
    }

}
