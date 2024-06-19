package Boxing;

public class ExampleLon {
    public static void main(String[] args) {
        
        Long x = Long.valueOf(100L);
        Long y = Long.valueOf(20L);

        Long z = Long.valueOf(x.longValue()+y.longValue());

        System.out.println(z.longValue());
    }
}
