package oops;

public class StringbufferandStringbuiler {
    public static void main(String[] args) {
    //     StringBuffer sb=new StringBuffer();//Mutable that means it does not create new objects in memory
    // System.out.println(sb.capacity()+" "+sb.length());//16 0
    // sb.append("Hello");
    // System.out.println(sb.capacity()+" "+sb.length());//16 5
    // sb.append("how are you");
    // System.out.println(sb.capacity()+" "+sb.length());//16 16
    
    //formula to calculate capacity =2n+2,n=old capacity
   // 3848428ufhuihf (in a flow), capacity =length 
  //It is thread safe ,hence slow,so we use stringbuilder
long startTime=System.currentTimeMillis();
StringBuffer sb=new StringBuffer("Java");
for(int i=0;i<10000;i++){
    sb.append("Example");

}
long endtime=System.currentTimeMillis();
System.out.println("Time taken by string buffer is: "+(endtime-startTime));



    startTime=System.currentTimeMillis();
StringBuilder sb2=new StringBuilder("Java");
for(int i=0;i<10000;i++){
    sb2.append("Example");

}
endtime=System.currentTimeMillis();
System.out.println("Time taken by string builder is: "+(endtime-startTime));

    
    
    }







    
    
}
