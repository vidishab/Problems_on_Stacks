
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class consecutivenuminstack {
    static Stack<Integer> s = new Stack<>();
    static Stack<Integer> s1=new Stack<>();
    static int val=1,p,q;
    public static void main(String args[])
    {
        s.push(4);
        s.push(5);
        s.push(-2);
        s.push(-3);
        s.push(11);
        s.push(10);
        s.push(5);
        s.push(6);
        s.push(20);
        s.push(21);
        while(!s.empty())
        {
            int top=s.pop();
            s1.push(top);
        }
        //System.out.println(s1.size());
        for(int i=0;i<=s1.size();i++)
        {
            //System.out.println(i);
            if(!s1.empty()) {
                p = s1.pop();
                //System.out.println(p);
            }
            if(!s1.empty()) {
                q = s1.pop();
                //System.out.println(q);
            }
            //System.out.println(q);
            if(Math.abs(p-q) != 1)
                val=0;
        }
        if(val==1)
           System.out.println("All have a mx diff of 1-Consecutive");
        else
            System.out.println("Not consecutive");
    }
}
