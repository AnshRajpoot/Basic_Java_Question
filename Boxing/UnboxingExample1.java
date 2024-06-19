package Boxing;

class UnboxingExample1{
    public static void main(String[] args) {
        Integer x = Integer.valueOf(100);
        Integer y = Integer.valueOf(10);

        Integer z = Integer.valueOf((x.intValue()+y.intValue()));
        System.out.println(z.intValue());


    }
}