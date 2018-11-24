
import java.util.*;


public class StudentInfo {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name? ");
        String a = sc.next();
        System.out.print("How Old Are You? ");
        int b = sc.nextInt();
        System.out.print("What is your gender? ");
        String c = sc.next();
        System.out.print("What is the value of Pi? ");
        double d = sc.nextDouble();
        
        System.out.println("Your name is: " +a);
        System.out.println("You are " +b+ " years old" );
        System.out.println("You are " +c);
        System.out.println("The value of Pi is: " +d);
    }
    
}
