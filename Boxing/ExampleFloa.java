package Boxing;

public class ExampleFloa {
    public static void main(String[] args) {
        Float x = Float.valueOf(100.0f);
        Float y = Float.valueOf(20.0f);

        Float z = Float.valueOf(x.floatValue()+y.floatValue());

        System.out.println(z.floatValue());
    }
}
