package oops;


public class StringFunctions {
    public static void main(String[] args) {
        
    
    String name="Amiit";
// System.out.println(name.length());//4
// System.out.println(name.charAt(2));//i
// System.out.println(name.substring(1,3));//mi
//index no. start from 0 ,position no starts from 1
// System.out.println(name.trim());
System.out.println(name.replace('t', 'r'));//Amir
System.out.println(name.toLowerCase());//amit
System.out.println(name.toUpperCase());//AMIT
System.out.println(name.concat(" Kaise ho?"));
System.out.println(name.indexOf('i'));//2
System.out.println(name.lastIndexOf('i'));//3

    
}
}