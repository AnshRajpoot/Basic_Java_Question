import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String name = sc.nextLine();

         String OriginalString = name;
         String rev="";
         for(int i= name.length()-1;i>=0;i--)
         {
            rev=rev+name.charAt(i);
         }
         if(OriginalString.equals(rev)){
            System.out.println("String is palindrome");
         }
         else{
            System.out.println("String is not palindrome");
         }
    }
}
