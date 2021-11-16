
public class Hw31 {

    public static void main(String[] args) throws Exception {

        Stack s = new Stack(5);
        
        
        
        s.push(5);
        s.push(3);
        s.push(4);
        s.push(1);
        s.push(2);
        
        s = SortStack(s);
        
        int len = s.size();
        for (int i = 0; i < len; i++) {
            System.out.println(s.pop());
        }
        
    }

    public static Stack SortStack(Stack Origin) throws Exception {

        if (Origin == null) {
            return null;
        }

        if (Origin.size() < 2) {
            return Origin;
        }

        int len1 = Origin.size();
        
        Stack hstack1 = new Stack(len1);
        
        for (int i = 0; i < len1; i++) {
            hstack1.push(Origin.pop());
        }
        
        Stack hstack2 = new Stack();
        Origin = Sort(hstack1,hstack2,Origin);
        return Origin;
    }
    
    public static Stack Sort(Stack hstack1 , Stack hstack2 , Stack Origin){
        
        if(hstack1.isEmpty()){
            return Origin;
        }
        
        
        Object smallest = hstack1.pop();

        int len = hstack1.size();

        for (int i = 0; i < len; i++) {
            Object element = hstack1.pop();

            if(Compare(smallest,element) > 0){
                Object temp = smallest;
                smallest = element;
                element = temp;
            }
            hstack2.push(element);
        }
        Origin.push(smallest);

        return Sort(hstack2 , hstack1 , Origin);
    }

    public static int Compare(Object obj1 , Object obj2){
        
        int n = 0;
        
        if(obj1.getClass() == String.class && obj2.getClass() == String.class){
            String s1 = (String)obj1;
            String s2 = (String)obj2;
            n = s1.compareTo(s2);
        }else if(obj1.getClass() == Double.class && obj2.getClass() == Double.class){
            double d1 = (Double)obj1;
            double d2 = (Double)obj2;
            
            if(d1 == d2){
                n = 0;
            }else if(d1 > d2){
                n = 1;
            }else{
                n = -1;
            }
        }else{
            int d1 = (Integer)obj1;
            int d2 = (Integer)obj2;
            
            if(d1 == d2){
                n = 0;
            }else if(d1 > d2){
                n = 1;
            }else{
                n = -1;
            }
        }
        
        return n;
        
    }
}
