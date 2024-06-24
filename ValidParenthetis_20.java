import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ValidParenthetis_20 {
    public static void main(String[] args) {
        ValidParenthetis_20 v = new ValidParenthetis_20();
        boolean ss =v.valid("(){}[]");
        System.out.println(ss);
    }

    public boolean valid(String s) {
//        Deque<Character> stack = new ArrayDeque<Character>();
//        for (int i=0; i<s.length(); i++){
//            char x = s.charAt(i);
//            if (x == '(' || x == '{' || x == '['){
//                stack.push(x);
//            }
//            char check;
//            switch (x){
//                case '(':
//                    if(!stack.isEmpty()){
//                        return false;
//                    }
//                    check = stack.pop();
//                    if (x=='{' || x=='['){
//                        return false;
//                    }
//                case '{':
//                    if(!stack.isEmpty()){
//                        return false;
//                    }
//                    check = stack.pop();
//                    if (x=='(' || x=='['){
//                        return false;
//                    }
//                case '[':
//                    if(!stack.isEmpty()){
//                        return false;
//                    }
//                    check = stack.pop();
//                    if (x=='(' || x=='{'){
//                        return false;
//                    }
//            }
//        }
//
//
//        return false;

        Stack<Character> stack = new Stack<>();
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else {
                if (!stack.isEmpty()){
                    char cc = stack.pop();
                    if (c == ')'){
                        if(cc != '(') return  false;
                    }
                    if (c == '}'){
                        if(cc != '{') return  false;
                    }
                    if (c == ']'){
                        if(cc != '[') return  false;
                    }
                    
                }else {
                    stack.push(c);
                }

            }
        }
        return stack.isEmpty();
    }
}

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.
//
//
//        Example 1:
//
//        Input: s = "()"
//        Output: true
//        Example 2:
//
//        Input: s = "()[]{}"
//        Output: true
//        Example 3:
//
//        Input: s = "(]"
//        Output: false
