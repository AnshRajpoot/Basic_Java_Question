import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the Second number : ");
        int num2 = sc.nextInt();
        System.out.println( "Original number is " + num1 + " "+ num2);
        // method 1
        // num1 = num1 + num2;
        // num2 = num1 - num2;
        // num1 = num1 - num2;

        //  method 2
        //    num1 = num1 ^ num2;
        //    num2 = num1 ^ num2;
        //    num1 = num1 ^ num2;

        //method 3
        //  int num3;
        //  num3=num1;
        //  num1=num2;
        //  num2=num3;

        //method 4
        //    num1 = num1 * num2;
        //    num2 = num1 / num2;
        //    num1 = num1 / num2;

        // method 5

         num2=num1+num2-(num1=num2);
        System.out.println("Swap number is " + num1 + " " + num2);
    }
}
