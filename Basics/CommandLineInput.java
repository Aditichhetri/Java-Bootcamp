package Basics;
class CommandLineInput {
    public static void main(String[] args) {
        // if(args.length==2){
         int sum1 = 0;
        // for (int i = 0; i <args.length; i++) {
        //     sum1 = sum1 + Integer.parseInt(args[i]);
        // }
        // 
        // else {System.out.println("Invalid Input!!");}
        // Enhanced for loops /for each loop-->
        for(String i:args){
            sum1+= Integer.parseInt(i);
        }
        System.out.println("The sum is :" + sum1);
    }
}
