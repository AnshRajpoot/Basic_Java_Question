package Arrays;

public class Sum {
    public static void main(String[] args) {
        int arr[] = {10,11,12,14,18};
    
    int sum=0;
    int len = arr.length;
    for(int i=0;i<len;i++)
    {
       sum+=arr[i];
    }

    System.out.println("sum of the array is "+sum);
    }
}
