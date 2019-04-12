
import java.util.Stack;

public class palindromstack {
    Stack<Character> s;
    palindromstack(Stack s )
    {
        s = new Stack();
    }
    public static void findpalindrome(Stack s)
    {
        Stack s1 = new Stack();
        while(!s.empty())
        {
            Character top = (Character) s.peek();
            if(top == 'x')
                break;
            s1.push(top);
            s.pop();
        }
        s.pop();
        while (!s1.empty() && s.empty()) {
            Integer p = (Integer) s.pop();
            Integer q = (Integer) s1.pop();
            if (p != q) {
                System.out.println("Not a palindrome");
                break;
            }
        }
            if (!s.empty()) {
                System.out.println("Not a palindrome");
            }
            else if (!s1.empty()) {
                System.out.println("Not a palindrome");
            }
            else {
                System.out.println("Palindrome");
            }
    }
    public static void main(String args[])
    {
        Stack s = new Stack();
        char a[] = {'a','b','a','b','x','b','a','b','a','a'};
        for(int i=0; i < a.length ; i++)
        {
            s.push(a[i]);
        }
        findpalindrome(s);
    }
}

