import java.util.Arrays;
import java.util.Scanner;

class bubblesort
{
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
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}