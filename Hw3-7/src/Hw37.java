
import java.util.Scanner;

public class Hw37 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("enter array length : ");
        int n = input.nextInt();
        System.out.println("enter array : ");
        double[] a = new double[n];

        for (int i = 0; i < n; i++) {
            a[i] = input.nextDouble();
        }

        Biggest(a);
    }

    public static void Biggest(double[] d) throws Exception {

        Stack big = new Stack(d.length);
        Stack len = new Stack();
        int count = 1;
        int min = 0, max = 0;

        for (int i = 0; i < d.length - 1; i++) {

            if (count == 2) {
                min = i - 1;
            }

            if (d[i] > d[i + 1]) {
                count++;
            } else if (count != 1) {
                max = min + count;
                big.push(count);
                len.push(max);
                len.push(min);
                count = 1;
            }
        }

        int biggest = 0;
        if(!big.isEmpty()){
            int lens = big.size();
            biggest = (int) big.pop();
            for (int i = 0; i < lens - 1; i++) {
                int b = (int) big.pop();
                if (biggest < b) {
                    biggest = b;
                    min = (int) len.pop();
                    max = (int) len.pop();
                }
            }
        }
        
        System.out.println("Biggest subsequence :" + biggest);

        System.out.print("[ ");
        for (int i = min; i < max; i++) {
            System.out.print(d[i] + " , ");
        }
        System.out.println(" ]");
        
    }
}
