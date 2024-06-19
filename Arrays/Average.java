package Arrays;

public class Average {
    public static void main(String[] args) {
        int arr [] = {1,2};
        int size = arr.length;
        int sum =0;
        for(int i=0;i<size;i++)
        {
            sum =sum+arr[i];
        }
        System.out.println("Avg of these number is "+sum);
        float avg =0;
        avg = sum/size;
        System.out.println("Avg of these number is "+avg);

    }
}
