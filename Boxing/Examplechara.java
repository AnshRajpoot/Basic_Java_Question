package Boxing;

public class Examplechara {
    public static void main(String[] args) {
        Character x = Character.valueOf('d'); // 'd' has ASCII value 100
        Character y = Character.valueOf('\n'); // '\n' has ASCII value 10

        Character z = Character.valueOf((char) (x.charValue() + y.charValue()));
        System.out.println((int)z.charValue());
    }
    
}
