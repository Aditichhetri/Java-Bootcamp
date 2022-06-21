package ExceptionHandling;

public class exceptionbasics {
    public static void main(String[] args) {
        System.out.println("DB Connection Open");
        System.out.println("DB Query");
        try
        {
            String t=null;
            t.toUpperCase();//throw new NullPointerException
            
        int num[]=new int[11]; 
        num[12]=55;//throw new ArrayIndexOutOfBoundsException

        int num1=9/0;//throw new Arithmetic Exception
        }
        catch(ArithmeticException num1){
            System.out.println("This is an arithmetic exception :You are diving number by 0 " +num1);
            return;
        }
        catch(ArrayIndexOutOfBoundsException n){
            System.out.println("This is an Array Index Out Of Bounds Exception " +n);
            return;
        }
        catch(NullPointerException n){
            System.out.println(" variable Pointing to null " +n);
            return;
        }
        


        System.out.println("Get Results of Query ");
        System.out.println("Print Result of Query");
        System.out.println("DB Connection Close");
 
    
    
    
    }
    
}
