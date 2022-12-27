package homewkwk_7;


//10. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry
import java .util.Scanner;
public class Que_10 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Enter any alphabet from A to F;");
        String city = t.nextLine();
        if (city.equals("A")) {
            System.out.println("Ahemdabad");
        } else if (city.equals("B")) {
            System.out.println("Boston");
        } else if (city.equals("C")) {
            System.out.println("Chandigarh");
        } else if (city.equals("D")) {
            System.out.println("Delhi");
        } else if (city.equals("E")) {
            System.out.println("Essen");
        } else if (city.equals("F")) {
            System.out.println("Florence");
        } else {
            System.out.println("Invalid entry");
        }

    }
}
