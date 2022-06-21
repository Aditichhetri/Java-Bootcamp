package Basics;
public class ReverseAString {
    public static void main(String[] args) {
        // Approach 1
        // String str="aditi",ans="";
        // char charecter;
        // for(int i=0;i<str.length();i++){
        // charecter=str.charAt(i);
        // ans=charecter+ans;
        // }
        // System.out.println(ans);
        // Approach 2:2Pointer Approach
        String str = "Aditi";
        char str2[] = str.toCharArray();
        // int mid=str.length()/2;
        int p = 0, q = str2.length - 1;
        char temp;
        while (p < q) {
            temp = str2[p];
            str2[p] = str2[q];
            str2[q] = temp;
            p++;
            q--;
        }
        for (char n : str2) {
            System.out.print(n);
        }

    }

}
