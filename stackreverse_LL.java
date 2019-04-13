
public class stackreverse_LL {
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    public void push(int d)
    {
        Node newnode=new Node(d);
        if(head==null)
        {
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public Node reverse()
    {
        Node prev=null;
        Node next=null;
        Node curr=head;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void main(String args[])
    {

        stackreverse_LL ob = new stackreverse_LL();
        stackreverse_LL ob1 = new stackreverse_LL();
        for(int i=0;i<5;i++)
        {
            ob.push(i);
        }
        ob.print();
        ob1.head=ob.reverse();
        ob1.print();
    }
}

