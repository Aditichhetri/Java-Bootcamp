package oops;
public class Employee {
    public static void main(String[] args) {
        EmployeeDetails aditi= new EmployeeDetails(10,"Aditi",1000000.0);
        EmployeeDetails adi= new EmployeeDetails(1,"Adi",200000.0);
        aditi.print();
        System.out.println();
        adi.print();
    }
    
}
class EmployeeDetails{
       private int id;
       private String name;
       private  double basicSalary;
       private String companyName;

        EmployeeDetails(){
          //  this(1,"Aditi Chhetri",10000000);
            
          companyName = "Google";
        }
        EmployeeDetails(int id, String name, double basicSalary){
            this();
            this.id=id;
            this.name=name;
            this.basicSalary=basicSalary;

        }
        public void  print(){
            System.out.println("Id is: "+id);
            System.out.println("Name is: "+name);
            System.out.println("basic salary is: "+basicSalary);
            System.out.println("Company Name is: "+companyName);
        
        }

}


