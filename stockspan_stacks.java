
import java.util.Stack;

public class stockspan_stacks {
    static Stack<Integer> s = new Stack<>();
    static int price[]=new int[6];
    public static void stockspan(int arr[])
    {
        s.push(0);
        price[0]=1;
        for(int i=1;i<arr.length;i++)
        {
            while(!s.empty() && arr[s.peek()] <= arr[i])
                s.pop();

            price[i]=((s.empty())?(i+1):(i-s.peek()));
            //System.out.println(price[i]);
            s.push(i);
        }
    }
    public static void printd()
    {
        for(int i=0;i<price.length;i++) {
            System.out.println(price[i]);
        }
    }
    public static void main(String args[])
    {
        int arr[]={10,5,4,20,90,120};
        //arr[]={10,5,4,20,90,120};

        stockspan(arr);
        printd();
    }

}

