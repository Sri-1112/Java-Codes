
public class CustomList {
    public static void main(String[] args) {
        int g1=1, g2=2;
        boolean h1=true,h2=false;
        System.out.println((g1|g2)==3);
        System.out.println((g1^g2)<4);
        System.out.println(g1&g2);
        System.out.println(h1||!h2);
    }
}

////    private String[] items;
////    private static int size;
////    public CustomList () {
////
////    items = (String []) new Object [100];
////    size = 0;}
////    public void addlast (String x) {
////        if (size >= 100)
////            return;
////        items[size] = x;
////        size = size + 1;
////    }
////
////    public String getlast () {
////        if (size == 0) {
////            return null;}
////        return items [size - 1];}
////    public int size () {
////        return size;}
//
//    public static void main(String[] args) {
//        //System.out.println(1);
//       String mystring = "abbababbabcbabsbbababababb";
//       process(mystring);
//    }
//    public static void process(String input) {
//        Set store = new HashSet();
//        String result = "";
//        for (int index = input.length() - 1; index >= 0; index--) {
//            Character ch = input.charAt(index);
//            if (!store.contains(ch)) {
//                store.add(ch);
//                result = result + ch;
//            }
//        }
//        System.out.println(result);
//    }
//    }
//
////class A{
////    int f(){return 0;}
////}
////class B extends A{
////    int f(){return 1;}
////}
////class C extends B{
////    int f(){return 2;}
////}

