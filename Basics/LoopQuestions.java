package Basics;
public class LoopQuestions {
    public static void main(String[] args) {
        // count number of digits in a number
        // int a=345;
        // int rem,reverse=0;
        // while(a>0){
        //  rem=a%10;
        //  reverse=rem+10*reverse;
        //  a=a/10;
        // }
        // System.out.println("Reversed Number: "+ reverse);


        // factorial of a number
        // int number=5,ans=number;
        // for(int i=1;i<5;i++){
        // ans=ans*(number-i);
        // }
        // System.out.println("The factorial is: "+ans);
        // or
        // int n=10,fact=1;
        // for(int i=1;i<=n;i++){
        //     fact*=i;
        // }
        // System.out.println("The factorial is: "+fact);



        //Fibonnaci Series
        // int n=8;
        // int n1=0,n2=1,ans;
        // System.out.print(n1+" ");
        // for(int i=0;i<=n;i++){
        //     ans=n1+n2; 
        //     n2=n1;
        //     n1=ans;
   
        //     System.out.print(ans+" ");



        // power of number
        int base=2,exponent=3,ans=1;
        for(int i=1;i<=exponent;i++){
            ans=ans*base;
        }
        System.out.println(ans);

         
    }  
}
