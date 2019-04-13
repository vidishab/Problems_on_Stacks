
import java.util.Stack;

public class stackreverse {
    static Stack<Integer> s = new Stack<>();
    static void reverse(Stack s)
    {
        if(s.size() > 0 )
        {
            Integer a = (Integer) s.peek();
            s.pop();
            reverse(s);
            insertatbottom(s,a);
        }
    }
    static void insertatbottom(Stack s, int p)
    {
        if(s.isEmpty())
            s.push(p);
        else
        {
            Integer temp = (Integer) s.peek();
            s.pop();
            insertatbottom(s,p);
            s.push(temp);
        }
    }
    public static void print(Stack s)
    {
        while(!s.empty())
        {
            System.out.println(s.pop());
        }
    }
    public static void main(String args[])
    {
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        //Stack s1 = new Stack();
        //s1=s;
        //print(s);
        reverse(s);
        print(s);
    }
}

