import java.util.Arrays;
import java.util.Scanner;

public class SeelctionSort {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter no of values in array");
        int n= s.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(arr));
    }
    public static int[] sort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            int min=arr[i];
            int loc=i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]<min)
                {
                    min=arr[j];
                    loc=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[loc];
            arr[loc]=temp;
        }
        return arr;
    }
}
