package Arrays;

public class Min {
    public static void main(String[] args) {
        int arr [] = {2,1,3,-8,4,5};
        int size = arr.length;
        int min  = arr[0];
        for(int i=0;i<size;i++)
        {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum element is " + min);
    }
}
