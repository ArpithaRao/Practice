package leetcode;

import java.util.Stack;

/**
 * Created by ARPITHA RAO on 03-05-2017.
 */
public class ParanthesisMatch {

    public boolean checkIfParanthesisBalanced(String string){

        Stack<Character> stack = new Stack<>();
        int i = 0;
        while(i<string.length()){
            if(string.charAt(i) == '(' ||string.charAt(i) == '{' || string.charAt(i) == '['){
                stack.push(string.charAt(i));
            }
            i++;
                if (string.charAt(i) == ')' || string.charAt(i) == '}' || string.charAt(i) == ']') {
                    stack.pop();
                }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        ParanthesisMatch p = new ParanthesisMatch();
        System.out.println(p.checkIfParanthesisBalanced("{{}}}}{}"));
        System.out.println(p.checkIfParanthesisBalanced("{}{}{}"));
    }

}
