public class InsertionSort {
    public static void insSort(int[]arr){
        int n=arr.length;
        for (int i=1;i<n;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }

    }

    public static void main(String[] args) {
        int[] arr= new int[]{12, 10, 30, 4, 7, 9, 45, 3, 1, 15};
        insSort(arr);
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
}
