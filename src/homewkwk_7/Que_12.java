package homewkwk_7;


//12. Write a java program to input any two number and ask user to enter their symbol (+, -,
///, *) find addition, Subtraction, multiplication and division according to their symbol
//(using if else)
import java.util.Scanner;
public class Que_12 {
    public static void main(String[] args) {     //main class
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first and second number - ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("choose and enter the type of operation to perform (+, - , * , /) - ");
        char op = sc.next().charAt(0);
        solve(a, b, op);
    }
        public static int solve(int a,int b,char op) {              //if-else
            int ans = 0;
            if (op == '+') {
                ans = a + b;

            } else if (op == '-') {
                ans = a - b;
            } else if (op == '*') {
                ans = a * b;
            } else if (op == '/') {
                ans = a / b;
            }
            System.out.println("+ ans");
            return ans;


        }

    }


