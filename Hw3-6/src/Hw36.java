
import java.util.Scanner;


public class Hw36 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        
        String s = input.nextLine();
        
        System.out.println("Number of parentheses we need :" + NBalance(s));
    }

    public static int NBalance(String s) throws Exception {

        Stack nb = new Stack(s.length());
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                nb.push('(');
            }
            
            if(!nb.isEmpty() && s.charAt(i) == ')'){
                nb.pop();
            }else if(s.charAt(i) == ')'){
                count++;
            }
        }

        count += nb.size();
        
        return count;
    }

}
