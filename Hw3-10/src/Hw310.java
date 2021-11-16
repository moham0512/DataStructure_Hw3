
public class Hw310 {

    public static void main(String[] args) {

        Queue q1 = new Queue();
        Queue q2 = new Queue();

        q1.enQueue(1);
        q1.enQueue(2);
        q1.enQueue(3);
        q1.enQueue(4);
        q1.enQueue(5);
        q1.enQueue(6);

        q2 = Combin(q1);
        System.out.println("output: ");
        if(q2 != null){
            while (!q2.isEmpty()) {
                System.out.println(q2.deQueue());
            }
        }else{
            System.out.println("no Output!");
        }
    }

    public static Queue Combin(Queue q) {

        if (q.size() % 2 != 0) {
            System.out.println("Queue size is not even!");
            return null;
        }

        Queue h1 = new Queue((q.size() / 2)+1);
        Queue h2 = new Queue((q.size() / 2)+1);
        Queue q1 = new Queue(q.size()+1);

        int len = q.size() / 2;
        for (int i = 0; i < len; i++) {
            h1.enQueue(q.deQueue());
        }

        for (int i = 0; i < len; i++) {
            h2.enQueue(q.deQueue());
        }
        
        while (!h1.isEmpty() || !h2.isEmpty()) {
            q1.enQueue(h1.deQueue());
            q1.enQueue(h2.deQueue());
        }

        return q1;
    }
}
