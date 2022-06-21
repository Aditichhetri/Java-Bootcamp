package ExceptionHandling;

public class throwsKeyword {
    public static void main(String[] args) {
        view();

    }

     static void view() {
        System.out.println("CALL logical layer");
        try{
        logic();
        }
        catch(ArithmeticException r){
            System.out.println("No,divide by 0");
            System.exit(0);
        }
        System.out.println("get result from logical layer");
        System.out.println("Print result to user");
        
    }

     static void logic() throws ArithmeticException{
        System.out.println("CALL db layer");
        db();
        System.out.println("get result from db layer");
        System.out.println("send result to view");
    }

    static void db() throws ArithmeticException {
        System.out.println("Connection open");
        try
        {
        int r=99/0;
        System.out.println("query and get result");
        System.out.println("send result to logical layer");
        }
        finally //cannot use without try
        {
        System.out.println("Close Connection");
    }
}
}
