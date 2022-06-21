package Basics;

public class PatternsProgram {
    public static void main(String[] args) {
        // *
        // **
        // ***
        // ****
        // int n=10;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // *****
        // ****
        // ***
        // **
        // *
        // int n=5;
// for(int i=0;i<n;i++){
//     for(int j=n;j>i;j--){
//         System.out.print("*");
//     }
//     System.out.println();
// }

// A
// BB
// CCC
// DDDD
// EEEEE
// int n=5;
// char a=(char)65;
// for(int i=0;i<n;i++){
//     for(int j=0;j<=i;j++){
//         System.out.print(a);
//     }a++;
//     System.out.println();
// }
//Floyd's Triangle
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14
// int n=10;
// int count=1;
// for(int i=0;i<n;i++){
//     for(int j=0;j<=i;j++){
//         System.out.print(count+" ");
//         count++;
//     }
//     System.out.println();
// }

//Hollow Rectangle pattern
// **********
// *        *
// *        *
// *        *
// *        *
// *        *
// **********
// int row=7;
// int column=10;
// for(int i=0;i<row;i++){
//     for(int j=0;j<column;j++){
//         if(i==0||i==row-1){
//             System.out.print("*");
//         }
//         else if(j==0||j==column-1){
//             System.out.print("*");
//         }
//         else{
//             System.out.print(" ");
//         }
//     }
//     System.out.println();
// }

//Pyramid
//____*____
//___***
//__*****
//_*******
// int n=5;
// for(int i=0;i<n;i++){
//     for(int j=i;j<n;j++){
//         System.out.print(" ");
//     }
//     for(int j=0 ;j<=(i*2);j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }


// *******
//  *****
//   ***
//    *
// int n=5;
// for(int i=n;i>0;i--){
//     for(int j=n;j>i;j--){
//         System.out.print(" ");
//     }
//     for(int k=1;k<(i*2);k++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
int n=5;
for(int i=0;i<n;i++){
    for(int j=i;j<n-i;j++){
        System.out.print(" ");
    }
    for(int j=0;j<=(i*2);i++){
        System.out.print("*");
    }
    System.out.println();

for(i=n/2;i>0;i--){
    for(int j=n/2;j>i;j--){
        System.out.print(" ");
    }
    for(int j=1;j<=(i*2);j++){
        System.out.print("*");
    }
    System.out.println();
}


}
}
}





      
    

