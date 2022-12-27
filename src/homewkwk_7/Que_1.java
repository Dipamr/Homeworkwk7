package homewkwk_7;
//Que_11. Write a java program that tells us that Input number is odd or even?
//HINT: use ternary operator (? :)
import java.util.Scanner;
public class Que_1 {
    public static void main(String[] args) { //main method
        int number,reminder;
        System.out.println("Pls enter an integer Number");
        Scanner Scanner = new Scanner(System.in);   //use scanner
        number = Scanner.nextInt();
        Scanner.close();
        System.out.println(number+"is "+((number % 2) == 0? "Even" : "Odd")+"Number" );
    }


}
