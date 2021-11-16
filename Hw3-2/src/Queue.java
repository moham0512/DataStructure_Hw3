
public class Queue {
    
    private int n;
    private Stack s1;
    private Stack s2;
    
    public Queue(int n){
        s1 = new Stack(n);
        s2 = new Stack(n);
    }
    
    public Object Dequeue() {

        while (s1.top != -1) {
            s2.push(s1.pop());
        }
        Object obj = s2.pop();
        while (s2.top != -1) {
            s1.push(s2.pop());
        }
        
        return obj;
    }
    
    public void Enqueue(Object obj){
        s1.push(obj);
    }
}
