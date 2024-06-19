package Boxing;

public class ExampleByt {
    public static void main(String[] args) {
        
        Byte x = Byte.valueOf((byte)100);
        Byte y = Byte.valueOf((byte)10);

        Byte z = Byte.valueOf((byte)(x.byteValue()+y.byteValue()));

        System.out.println(z.byteValue());
    }
}
