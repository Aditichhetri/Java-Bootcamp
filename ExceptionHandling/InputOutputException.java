package ExceptionHandling;

import java.io.File;
import java.io.IOException;

public class InputOutputException {
    public static void main(String[] args) {
        
    
    System.out.println("DB Connection Open");
    System.out.println("DB Query");
    try
    {
        String path="C:\\Users\\User\\Desktop\\Project1\\Java Bootcamp\\File\\test.txt";
    
    File f= new File(path);
    if(f.exists())
    {
        System.out.println("This file exist ");
        f.delete();
    }
    else
    {
        f.createNewFile();
    }
    }
    catch(IOException e){
        System.out.println("File not created");
        return;
    }
    System.out.println("Get Results of Query ");
    System.out.println("Print Result of Query");
    System.out.println("DB Connection Close");
}
}
