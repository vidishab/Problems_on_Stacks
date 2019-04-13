
import java.util.Scanner;
import java.util.Stack;

public class twostacksusingarray {
    static Scanner sc = new Scanner(System.in);
    static int p = sc.nextInt();
    static int arr[] = new int[p];
    static int top=0;
    static int top1=arr.length-1;
    static Stack<Integer> s = new Stack<>();
    static Stack<Integer> s1 = new Stack<>();
    public static void push1 (Stack s, int i)
    {
        //top=0;
        arr[top]=i;
        top++;
    }
    public static void push2 (Stack s1, int i)
    {
        //top=0;
        arr[top1]=i;
        //System.out.println(arr[top1]);
        top1--;
        if(top1 < top-1)
        {
            //System.out.println(top1);
            System.out.println("Array size is not enough");
            System.exit(1);
        }

    }
    public static void pop1(Stack s)
    {
        int val=0;
        while(val<top)
        {
           System.out.println(arr[val]);
           val++;
        }
    }
    public static void pop2(Stack s1)
    {
        top1+=1;
        while(top1 < arr.length)
        {
            System.out.println(arr[top1]);
            //System.out.println("Top" + top1);
            top1++;
        }
    }
    public static void main(String args[])
    {
        System.out.println("Size of first stack");
        int res=sc.nextInt();
        System.out.println("Size of second stack");
        int res1=sc.nextInt();
        for(int i=0;i<res;i++)
        {
           push1(s,i);
        }
        for(int i=res-1;i<arr.length;i++)
        {
            push2(s1,i);
        }
        //System.out.println(top);
        pop1(s);
        //System.out.println(top1);
        pop2(s1);
    }
}

