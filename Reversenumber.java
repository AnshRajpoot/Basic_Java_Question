import java.util.Scanner;
import java.util.*;
class Reversenumber{
    public static void main(String [] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number : ");
         int num = sc.nextInt();
        int res=0;
        // method 1
        //  while(num != 0)
        //  {
        //     res=res*10+num%10;
        //     num=num/10;
        //  }

        // method 2
        // StringBuffer sb = new StringBuffer(String.valueOf(num));
        // StringBuffer rev = sb.reverse();

      // method3
            StringBuilder sb = new StringBuilder();
            sb.append(num);
            StringBuilder rev = sb.reverse();
         System.out.println("Reverse number is " + rev);

         
    }
}