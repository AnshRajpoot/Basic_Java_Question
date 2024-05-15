import java.util.Scanner;

public class EvenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");

        String name = sc.nextLine();
        for( String str : name.split(" "))
        {
              if(str.length()%2==0)
              {
                System.out.println(str);
              }
        }
        
    }
}
