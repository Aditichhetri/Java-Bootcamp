package FileHandling;
import java.io.File;
import java.io.IOException;
public class FileDemo {
    public static void main(String[] args) throws IOException {
        //try{
        String path="C:\\Users\\User\\Desktop\\Project1\\Java Bootcamp\\Fike\\sample.txt";
        File file=new File(path);
        if(file.exists()){
            file.delete();
            System.out.println("File Deleted");
        }
        else{
            file.createNewFile();
            System.out.println("File Created");
        }
    
    // catch(IOException e){
    //     System.out.println("Enter correct file path name");
    //     return;
    // }
  // }
//    file.mkdirs(); 
System.out.println(file.getAbsolutePath());
System.out.println(file.getName());
}
}
