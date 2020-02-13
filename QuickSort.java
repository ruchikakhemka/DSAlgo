
public class QuickSort {
    public int  partition(int[] arr, int start,int end)
    {
        int pivot = arr[end];
        int i = start -1;
        for(int j=start; j<end;j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;

        return i+1;
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public  void quicksort(int[]arr, int low, int high)
    {
        if(low < high)
        {
            int pi = partition(arr,low,high);
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {50, 23, 9, 18, 61, 32};
        int n = arr.length;

        QuickSort ob = new QuickSort();
        ob.quicksort(arr, 0, n-1);

        System.out.println("sorted array");
        printArray(arr);
    }
}
