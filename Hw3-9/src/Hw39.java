
public class Hw39 {

    public static void main(String[] args) {

        Queue q1 = new Queue();
        Queue q2 = new Queue();

        q1.enQueue(6);
        q1.enQueue(2);
        q1.enQueue(3);
        q1.enQueue(1);
        q1.enQueue(4);

        Swap(q1, q2);

        System.out.println("output: ");
        while (!q2.isEmpty()) {
            System.out.println(q2.deQueue());
        }
        
    }

    public static void Swap(Queue q1, Queue q2) {

        Queue hq = new Queue();

        hq.enQueue(q1.deQueue());

        int len = q1.size() - 1;
        for (int i = 0; i < len; i++) {
            q1.enQueue(q1.deQueue());
        }
        
        while(!q1.isEmpty()){
            q2.enQueue(q1.deQueue());
        }
        q2.enQueue(hq.deQueue());
    }
}
