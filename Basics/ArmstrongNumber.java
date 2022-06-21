package Basics;
import java.lang.Math;
public class ArmstrongNumber {
    public static void main(String[] args) {
        int koinumber=00000;
        int temp=koinumber;
        int sum = 0,count=0;
        while(temp!=0){
            temp=temp/10; 
            count++;
        }
        temp=koinumber;
        while(koinumber!=0){
        int rem=koinumber%10;
        sum=sum+(int)Math.pow(rem,count);
        koinumber=koinumber/10;
        }
        if(sum==temp)
        System.out.println("Armstrong Number");
        else
        System.out.println("Not an Armstrong Number");
    }
}
