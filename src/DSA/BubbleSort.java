class BubSort{
    public void bubbleSort(int[]arr){
        int n= arr.length;
        for (int i=0; i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={10,12,30,4,7,9,45,3,1,15};
        BubSort ob=new BubSort();
        ob.bubbleSort(arr);
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }

}
