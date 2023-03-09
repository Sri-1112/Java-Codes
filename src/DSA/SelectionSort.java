public class SelectionSort {
    public static void main(String[] args) {
        int[] arr= new int[]{12, 10, 30, 4, 7, 9, 45, 3, 1, 15};
        selectionSort(arr);
        for (int i:arr
             ) {
            System.out.print(i+" ");

        }
    }

    public static void selectionSort(int[] arr) {
        int n= arr.length;
        int minIndex=0;
        for (int i=0;i<n-1;i++){
            minIndex=i;
            for(int j=i+1;j<n;j++){
                if (arr[j] < arr[minIndex]) minIndex = j;
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
}
