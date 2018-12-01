//toolbox
import java.util.Scanner;

public class CeasarCipher {
    //main method
    public static void main(String args[]) {
        //tool
        Scanner sc = new Scanner(System.in);
        //declaring the variables
        int shift, i, n, ans;
        String str;
        String str1 = "";
        //getting the user input
        System.out.println("Enter The String To be Encrypted:");
        str = sc.nextLine();
        //converting user's input into lowercase to simplify the algorithm because lower and upper case are different
        str = str.toLowerCase();
        n = str.length();
        //converting user's input into array
        char ch1[] = str.toCharArray();
        char ch3;
        //encrypting user's input into uppercase
        System.out.println("String To Be Encrypted:" + str.toUpperCase());
        //getting the numeric key of the user
        System.out.println("Enter A Numeric Key:");
        shift = sc.nextInt();

        System.out.println();
        //displaying the encryted text
        System.out.print("Encrypted text is:");
        for (i = 0; i < n; i++) {
            if (Character.isLetter(ch1[i])) {
                // converting the char ch1[] into int so that it will be compatible to compare to another int which is int shift.
                //modulo generates the remainder
                //26 is the number of alphabet
                ch3 = (char) (((int) ch1[i] + shift - 97) % 26 + 97);
                str1 = str1 + ch3;
            }
        }
        //displaying the encrypted text into uppercase
        System.out.println(str1.toUpperCase());
        //if the user's want to encrypt again
        System.out.println("Encrypt Again? \n"
                + "[1] Yes \n"
                + "[2] No");
        ans = sc.nextInt();
        //if the user answered 2 it will exit
        if (ans == 2) {
            System.exit(0);
        }
        //if the user answered 1 it will loop until the user entered 2 to exit
        while (ans == 1) {
            Scanner sn = new Scanner(System.in);
            int shift1, ie, ne, anse;
            String stre;
            String str1e = "";
            System.out.println("Enter The String To be Encrypted:");
            stre = sn.nextLine();
            stre = stre.toLowerCase();
            ne = stre.length();
            char ch5[] = stre.toCharArray();
            char ch6;
            System.out.println("String To Be Encrypted:" + stre.toUpperCase());
            System.out.println("Enter A Nemeric Key:");
            shift1 = sn.nextInt();

            System.out.println();
            System.out.print("Encrypted text is:");
            for (ie = 0; ie < ne; ie++) {
                if (Character.isLetter(ch5[ie])) {
                    ch6 = (char) (((int) ch5[ie] + shift1 - 97) % 26 + 97);
                    str1e = str1e + ch6;
                }
            }
            System.out.println(str1e.toUpperCase());
            System.out.println("Encrypt Again? \n"
                    + "[1] Yes \n"
                    + "[2] No");
            anse = sc.nextInt();
            if (ans == 2) {
                System.exit(0);
            }
        }
    }
}
