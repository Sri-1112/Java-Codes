import java.util.ArrayList;

public class RevArrayList {
    public ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist) {
        ArrayList<Integer> revArrayList = new ArrayList<Integer>();
        for (int i = alist.size() - 1; i >= 0; i--) {
            revArrayList.add(alist.get(i));
        }
        return revArrayList;
    }

    public void printElements(ArrayList<Integer> alist) {
        for (Integer integer : alist) {
            System.out.print(integer + " ");
        }
    }
}
