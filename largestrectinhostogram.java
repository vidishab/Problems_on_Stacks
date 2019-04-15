
import java.util.Stack;

public class largestrectinhostogram {
    static Stack<Integer> s = new Stack<>();
    public static void findrect(int arr[])
    {
        int maxarea=0;
        int tp=0;
        int curr=0;
        int i=0;
        while(i<arr.length)
        {
            if(s.empty() || arr[s.peek()] <= arr[i])
                s.push(i++);
            else
            {
                tp=s.peek();
                s.pop();
                curr=arr[tp] * (s.empty() ? i : i-s.peek()-1);

                if(curr > maxarea)
                    maxarea=curr;
            }
        }
        while(s.empty()==false)
        {
            tp=s.peek();
            s.pop();
            curr=arr[tp] * (s.empty() ? i : i-s.peek()-1);
            if(curr > maxarea)
                curr=maxarea;
        }
        System.out.println(maxarea);
    }
    public static void main(String args[])
    {
        int arr[]={6,2,5,4,5,1,6};
        findrect(arr);
    }

}

