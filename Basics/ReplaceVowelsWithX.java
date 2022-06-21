package Basics;
class ReplaceVowelsWithX {
    public static void main(String[] args) {
        String s = "Hello Meow";
        char[] arr = s.toCharArray();
        for (int n = 0; n < arr.length; n++) {
            if (arr[n] == 'a' || arr[n] == 'e' || arr[n] == 'i' || arr[n] == 'o' || arr[n] == 'u' || arr[n] == 'A'
                    || arr[n] == 'E' || arr[n] == 'I' || arr[n] == 'O' || arr[n] == 'U') {
                arr[n] = 'X';
            }
        }
        for (char v : arr) {
            System.out.print(v);
        }
    }
}