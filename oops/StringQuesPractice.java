package oops;

public class StringQuesPractice {
    // Remove Duplicates from string eg i/p :"Javaaa" o/p:"Jav"
    public static void main(String[] args) {
        // String s="Javaaa";
        // int encounter[]=new int[120];
        // for(int i=0;i<s.length();i++){
        // if(encounter[s.charAt(i)]==0){
        // System.out.print(s.charAt(i));

        // encounter[s.charAt(i)]++;
        // }
        // }

        // String s= "Java Example";
        // String words[]=s.split(" ");
        // String finalstring="";
        // for(int i=0;i<words.length;i++){
        // String word=words[i];//java
        // String revword="";
        // for(int j=word.length()-1;j>=0;j--){
        // revword+=word.charAt(j);
        // }
        // finalstring+=revword+" ";
        // }
        // System.out.print(finalstring);

        // Anagram string: anagram of string is the string with same letters but the
        // order can be different
        // String a = "listen";
        // String b = "silent";
        // if (a.length() == b.length()) {
        //     int flag = 0;
        //     int counter = 0;
        //     for (int i = 0; i < a.length(); i++) {
        //         for (int j = 0; j < b.length(); j++) {

        //             if (!(a.charAt(i) == b.charAt(j))) {
        //                 counter++;
        //             }
        //         }
        //         if (counter == b.length()) {
        //             flag = 1;
        //             break;
        //         } else
        //             counter = 0;
        //     }

        //     if (flag == 1)
        //         System.out.println("Not Anagram String");
        //     else
        //         System.out.println(" Anagram String");

        // }
        // else
        // System.out.println("Not Anagram String");




// Convert String to int
// Way1
// String s="12345";
// int a=Integer.valueOf(s);
// System.out.println(a+" String to Integer ");
// int b=1234;
// String c=String.valueOf(b);
// System.out.println(c+" Integer to String");

// Way 2
String s="1234665";
Integer num=Integer.parseInt(s);
System.out.println(num);
System.out.println(num.getClass()); 

int num1=245602;
String s1=Integer.toString(num1);
System.out.println(s1);
System.out.println(s1.getClass());

    }
}
