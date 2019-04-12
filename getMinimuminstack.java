
import java.util.Stack;

public class getMinimuminstack {
    Stack<Integer> s;
    getMinimuminstack(Stack s)
    {
        s = new Stack();
    }
    public static Stack push1(Stack s, int d)
    {
        Stack s1 = new Stack();
        s.push(d);
        if(s1.isEmpty())
        {
            s1.push(d);
        }
        else
        {
            Integer top = (Integer) s1.peek();
            if(top > d)
            {
                s1.push(d);
            }
        }
        return s1;
    }
    public static void main(String args[])
    {
        Stack s= new Stack();
        Stack s1= new Stack();
        for(int i = 10; i>0 ;i--)
        {
            s1=push1(s,i);
        }
        System.out.println(s1.peek());
        while(!s.isEmpty())
        {
            System.out.println(s.pop());
        }

    }
}

