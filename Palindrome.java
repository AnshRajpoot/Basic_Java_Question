import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num1 = sc.nextInt();
        int check = num1;
        int res =0;
        while(num1 != 0)
        {
            res=res*10+num1%10;
            num1=num1/10;
        }
        if(check==res)
        {
            System.out.println("Number"+ check + " is palindrome");
        }
        else
        {
            System.out.println("Number "+ check + " is not palindrome");
        }

    }
}
