
import java.util.Stack;

public class nextgreaterelement {
    static Stack<Integer> s = new Stack<>();
    static int arr[]={2,3,4,5,6};
    public static void main(String args[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(j>i)
                    s.push(arr[j]);
                break;
            }
        }
        while(!s.empty())
        {
            System.out.println(s.pop());
        }
    }
}

