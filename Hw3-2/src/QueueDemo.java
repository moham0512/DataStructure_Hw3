
public class QueueDemo {

    public static void main(String[] args) {

        Queue q = new Queue(6);

        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        q.Enqueue(4);
        q.Enqueue(5);
        q.Enqueue(6);

        for (int i = 0; i < 6; i++) {
            System.out.println(q.Dequeue());
        }
    }

}
