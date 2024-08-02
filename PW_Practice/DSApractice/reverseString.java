import java.util.Scanner;

/**
 * reverseString
 */
public class reverseString {
    public static String toReverse(String str){
       String rev = "";
       for(int i=0; i< str.length(); i++){
        rev = str.charAt(i) + rev;
        System.out.println(str.charAt(str.length()-1-i));
       }
       return rev;


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word to check palindrome or not");

        String str = scan.next();
        String result= toReverse(str);
        System.out.println(str+"-->"+result);
        System.out.println(str.equalsIgnoreCase(result));
        if(str.equalsIgnoreCase(result)){
            System.out.println("palindrom");
        }
        else{
            System.out.println("Not palindrom");
        }
        scan.close();
    }
}