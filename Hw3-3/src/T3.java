
import java.util.Scanner;

public class T3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String sp[] = str.split(" ");

        for (int i = 0; i < sp.length; i++) {
            Stack s1 = new Stack(sp[i].length());
            Stack s2 = new Stack(sp[i].length());
            for (int j = 0; j < sp[i].length(); j++) {
                s1.push(sp[i].charAt(j));
            }
            for (int j = 0; j < sp[i].length(); j++) {
                s2.push(s1.pop());
            }
            for (int j = 0; j < sp[i].length(); j++) {
                System.out.print(s2.stack[j]);
            }
            System.out.print(" ");
        }

    }

}
