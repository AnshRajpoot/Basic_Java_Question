package Boxing;

public class ExampleShor {
    public static void main(String[] args) {
        Short x = Short.valueOf((short)100);

        Short y = Short.valueOf((short)30);

        Short z =Short.valueOf((short)(x.shortValue()+y.shortValue()));

        System.out.println(z.shortValue());
    }
}
