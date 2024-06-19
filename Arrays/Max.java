package Arrays;

public class Max {
    public static void main(String[] args) {
        int arr[]  = {1,2,3,40,33,21,4};
        int size=arr.length;
        int max=arr[0];
        for(int i=0;i<size;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("maximum element of the array is " +max);
    }
}
