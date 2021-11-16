
public class Hw38 {

    public static void main(String[] args) throws Exception {

        Queue q1 = new Queue();
        Queue q2 = new Queue();

        q1.enQueue(5);
        q1.enQueue(2);
        q1.enQueue(3);
        q1.enQueue(1);
        q1.enQueue(4);

        Sort(q1, q2);

        System.out.println("output: ");
        while (!q2.isEmpty()) {
            System.out.println(q2.deQueue());
        }
    }

    public static void Sort(Queue q1, Queue q2) {

        Stack hs = new Stack();

        while (!q1.isEmpty()) {
            hs.push(q1.deQueue());
            int len = q1.size();
            for (int i = 0; i < len; i++) {
                int d = (int) q1.deQueue();
                if (d > (int) hs.peek()) {
                    q1.enQueue(hs.pop());
                    hs.push(d);
                } else {
                    q1.enQueue(d);
                }
            }
        }

        while (!hs.isEmpty()) {
            q2.enQueue(hs.pop());
        }
    }

}
