import java.util.*;

public class Calculator {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      
        int result = 0;

       
        System.out.print("Enter an expression to compute: ");
        String userInput = input.nextLine();

        
        String[] tokens = userInput.split("");

       
        switch (tokens[1].charAt(0)) {
            case '+':
                result = Integer.parseInt(tokens[0])
                        + Integer.parseInt(tokens[2]);
                break;
            case '-':
                result = Integer.parseInt(tokens[0])
                        - Integer.parseInt(tokens[2]);
                break;
            case '*':
                result = Integer.parseInt(tokens[0])
                        * Integer.parseInt(tokens[2]);
                break;
            case '/':
                result = Integer.parseInt(tokens[0])
                        / Integer.parseInt(tokens[2]);
        }


        System.out.println(result);
    }
    
}
