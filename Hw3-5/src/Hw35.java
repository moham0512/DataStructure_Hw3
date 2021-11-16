
import java.util.Scanner;


public class Hw35 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        
        System.out.println("number of valid parentheses : " + BBalance(s));
        
    }

    public static int BBalance(String s) {

        int count = 0;
        try {
            
            
            Stack balance = new Stack(s.length());

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    balance.push('(');
                }
                
                if(!balance.isEmpty() && s.charAt(i) == ')' && ((Character)balance.pop()) == '('){
                        count++;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

}
