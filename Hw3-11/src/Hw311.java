
public class Hw311 {

    public static void main(String[] args) {

        int[] a = {5, 2, 8, 6, -1, 3};

        int[] b = Sort(a);

        System.out.println("Sorted array: ");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }

    public static int[] Sort(int[] arr) {
        
        while(true){
            
            boolean f = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (!(arr[i] <= arr[i + 1])) {
                    f = false;
                }
            }
            if(f){
                break;
            }
            
            Stack hs1 = new Stack();
            Stack hs2 = new Stack();

            for (int i = 0; i < arr.length; i++) {
                hs1.push(arr[i]);
            }

            while (!hs1.isEmpty()) {
                int biggest = (int) hs1.pop();
                if (!hs1.isEmpty() && biggest < (int) hs1.peek()) {
                    hs2.push(hs1.pop());
                    hs1.push(biggest);
                } else {
                    hs2.push(biggest);
                }
            }

            int len = hs2.size();
            for (int i = 0; i < len; i++) {
                arr[i] = (int) hs2.pop();
            }
        }
        return arr;
    }
}
