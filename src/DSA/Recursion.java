package DSA;

public class Recursion {
    private int fact,pow,fib,arr[];

    Recursion(int fact, int pow, int fib, int[] arr) {
        this.fact = fact;
        this.pow = pow;
        this.fib = fib;
        this.arr = arr;
    }

//    public void setFact(int fact) {
//        this.fact = fact;
//    }
//
//    public void setPow(int pow) {
//        this.pow = pow;
//    }
//
//    public void setFib(int fib) {
//        this.fib = fib;
//    }
//
//    public void setArr(int[] arr) {
//        this.arr = arr;
//    }

    public int getFact() {
        return fact;
    }

    public int getPow() {
        return pow;
    }

    public int getFib() {
        return fib;
    }

    public int[] getArr() {
        return arr;
    }
    public int calcFact(int fact){
        if(fact<=1)
            return 1;
        else
            return fact * calcFact(fact - 1);
    }
    public int calcPower(int pow,int base){
        if(pow==0)
            return 1;
        else
            return base*calcPower(pow-1,base);
    }
    public int calcFib(int fib){
        if(fib>1)
            return fib;
        else return calcFib(fib-1)+calcFib(fib-2);
    }
    public int firstOcc(int[] arr,int i,int size, int target){
        if(i==size) return -1;
        if(arr[i]==target) return i;
        else return firstOcc(arr, i+1, size, target);
    }
    public int lastOcc(int[]arr,int i,int size,int target){
        if(i==0) return -1;
        if(arr[i]==target) return i;
        else return lastOcc(arr, i-1, size, target);
    }
}
