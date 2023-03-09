public class QuickSort {
    public static void quickSort(int[] arr, int low, int high){
        if (low<high){
            int indexPI=partition(arr, low,high);

            quickSort(arr,low,indexPI-1);
            quickSort(arr,indexPI+1,high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int swapIndex=low-1;
        int pivot=arr[high];
        for (int j=low;j<high;j++){
            if(arr[j]<pivot){
                swapIndex++;
                int temp=arr[j];
                arr[j]=arr[swapIndex];
                arr[swapIndex]=temp;
            }
        }
        int temp=arr[high];
        arr[high]=arr[swapIndex+1];
        arr[swapIndex+1]=temp;
        return swapIndex+1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{12, 10, 30, 4, 7, 9, 45, 3, 1, 15};
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
