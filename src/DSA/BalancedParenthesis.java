package DSA;

import java.util.Stack;

public class BalancedParenthesis {
    public static boolean isPair(char val1,char val2){
         return ((val1=='('&&val2==')')||(val1=='{'&&val2=='}')||(val1=='['&&val2==']'));
    }
    public static boolean checkBalance(String  a){
        Stack<Character>s = new Stack<>();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='['||a.charAt(i)=='('||a.charAt(i)=='{') {
                s.push(a.charAt(i));
            }
            else {
                if (s.isEmpty()) {
                    return false;
                }
                else if(isPair(s.peek(),a.charAt(i))){
                    s.pop();
                    continue;
                }
                return false;
            }
        }
        if(s.isEmpty()) return true;
        else return false;

    }

    public static void main(String[] args) {
        String a="(({})[]";
        System.out.println(checkBalance(a) ? "Balanced" : "Not balanced");
    }
}
