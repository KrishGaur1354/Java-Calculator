import java.util.Scanner;

public class CHRA1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.println("Enter one of the Operator mentioned below:");
            System.out.println("+ = ADDITON");
            System.out.println("- = SUBSTRACTIN");
            System.out.println("* = MULTIPLICATION");
            System.out.println("/ = DIVISION");
            System.out.println("% = REMAINDER");
            System.out.println("X/x = EXIT");
            char ch = input.next().trim().charAt(0);



            if ( ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                System.out.println("Enter First No:");
                int num1 = input.nextInt();
                System.out.println("Enter Second No:");
                int num2 = input.nextInt();

                if ( ch == '+') {
                    ans = num1 + num2;
                }
                if ( ch == '-') {
                    ans = num1 - num2;
                }
                if ( ch == '*') {
                    ans = num1 * num2;
                }
                if ( ch == '/') {

                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if ( ch == '%') {
                    ans = num1 % num2;
                }
                

            } else if ( ch == 'x' || ch == 'X' ) {
                break;
                
            } else {
                System.out.println("Invalid Operator!!!");
            }
            System.out.println(ans);

        }




    }
}
