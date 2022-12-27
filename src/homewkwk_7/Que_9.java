package homewkwk_7;
import java.util.Scanner;
public class Que_9 {
    public static void main(String[] args) {     //main method,
        int rate = 0;
        int sales = 0;
        double commission = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input sales id");
        int id = sc.nextInt();
        System.out.println("Input seller's name");
        String name = sc.next();
        System.out.println("Input sales amount");
        int a = sc.nextInt();
        System.out.println("Input basic salary");
        int b = sc.nextInt();
        System.out.println("Input Sales Commission");
        double d = sc.nextDouble();

        if (sales >= 50000) {
            rate = 35;
            commission = sales * 0.35;

        } else if (sales >= 30000) {
            rate = 20;
            commission = sales * 0.20;
        } else if (sales >= 20000) {
            rate = 10;
            commission = sales * 0.10;
        } else if (sales >= 1000) {
            rate = 5;
            commission = sales * 0.5;
        } else if (sales < 10000) {
            rate = 2;
            commission = sales * 0.2;

        } else{
            System.out.println("Invalid Sales");
        }


    }
    }