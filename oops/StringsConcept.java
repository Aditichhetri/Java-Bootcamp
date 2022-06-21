package oops;

public class StringsConcept {
    public static void main(String[] args) {
        // As a Literal
        // String name="Ram";
        // String name2="Ram";
        // System.out.println(name == name2);
// As a Object
        // String name3=new String("Ram").intern();
        // String name4=new String("Ram");
        // System.out.println(name3 == name4);
        // System.out.println(name == name3);
//intern() ki wagah se String Pool mein String aur wahan naya obj create kareaga(agar same value se koi bana nahi hua hoga) ki nahi(agar same value se koi bana hua hoga)

//ImMutation
String str1="leet";
String str2=str1;
//System.out.println(str1==str1);//true
str1+="code";
System.out.println(str1+" "+str2+" "+(str1==str2));//false,it create new obj after every change 
StringBuffer strobj1=new StringBuffer("leet");
StringBuffer strobj2=strobj1;
strobj1.append("code");
System.out.println(strobj1+" "+strobj2+(strobj1==   strobj2));


}
   
   
    
    
}
