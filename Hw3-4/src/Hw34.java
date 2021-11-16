
public class Hw34 {

    public static void main(String[] args) throws Exception {

        
        Stack in = new Stack(5);
        
        in.push(2);
        in.push(-1);
        in.push(4);
        in.push(7);
        in.push(1);
        
        in = SortStack(in);
        
        int len = in.size();
        for (int i = 0; i < len; i++) {
            System.out.println(in.pop());
        }
    }

    public static Stack SortStack(Stack in) throws Exception {

        int len1 = in.size();
        Stack out = new Stack(len1);
        
        if (in == null) {
            return null;
        }

        if (in.size() < 2) {
            
            for (int i = 0; i < len1; i++) {
                out.push(in.pop());
            }
            return out;
        }



        Stack hstack = new Stack();
       
        out = Sort(in , out , hstack);
        
        return out;
    }

    public static Stack Sort(Stack in, Stack out, Stack hstack) {

        if (in.isEmpty()) {
            return out;
        }

        int smallest = (int) in.pop();

        int len = in.size();

        for (int i = 0; i < len; i++) {
            int element = (int) in.pop();

            if (smallest > element) {
                int temp = smallest;
                smallest = element;
                element = temp;
            }
            hstack.push(element);
        }
        out.push(smallest);

        return Sort(hstack, out, in);
    }
}
