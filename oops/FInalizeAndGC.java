package oops;

public class FInalizeAndGC {
    /**
     *
     */
    private static final String THIS_IS_FINALIZE_METHOD_CALLED = "This is finalize method called";
    public static void main(String[] args) {
        
        // FInalizeAndGC object=new FInalizeAndGC();
        // object=null;//Unused Object
       
        System.gc();//Request to JVM to call Garbage collector

        System.out.println("This is main method:complete");

    }
    // Overriding Finalize method
public void finalize()
{
System.out.println(THIS_IS_FINALIZE_METHOD_CALLED);//WE have called this function explicitly but the garbage collector calls it implicitly.
}
}