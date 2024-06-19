package Boxing;

public class Exampledoubl {
    public static void main(String[] args) {
        Double x = Double.valueOf(100.00);
        Double y = Double.valueOf(20.0);

        Double z = Double.valueOf(x.doubleValue()+y.doubleValue());

        System.out.println(z.doubleValue());
    }
}
