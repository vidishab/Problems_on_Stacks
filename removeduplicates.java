
import java.util.Stack;

public class removeduplicates {
    //static char arr[] = {'c', 'a', 'r', 'e', 'e', 'r', 'm', 'o', 'n', 'k'};
    static char arr[] = {'m', 'i', 's', 's', 'i', 's', 's', 'i', 'p', 'p','i'};
    static Stack s = new Stack<>();

    public static void main(String args[]) {
        s.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (s.empty() == false) {
                Character p = (Character) s.peek();
                if (p == arr[i])
                    s.pop();
                else
                    s.push(arr[i]);
            }
        }
        while (!s.empty()) {
            System.out.println(s.pop());
        }
    }
}
