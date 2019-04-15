
import java.util.Stack;

public class nextGE_stack {
    static int arr[]={2,1,5,6,7,10};
    static Stack<Integer> s = new Stack<>();
    public static void main(String args[])
    {
        s.push(arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            while(!s.empty() && s.peek() < arr[i] ) {
                int p = (Integer) s.peek();
                if (p < arr[i]) {
                    System.out.println("Next greater element of " + p + " is " + arr[i]);
                    s.pop();
                }
            }
                s.push(arr[i]);
                //System.out.println(arr[i]);
        }
    }
}


