import java.util.Stack;

public class SpanOfStock {
    static void stockSpan(int[]arr){
        Stack<Integer> s=new Stack<>();
        s.push(0);
        System.out.println(1);
        for(int i=1;i<= arr.length-1;i++){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            int span=s.isEmpty()? i+1:i-s.peek();
            System.out.println("Span: "+span);
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int[] arr= new int[]{15, 10, 8, 9, 12, 17};
        stockSpan(arr);
    }
}
