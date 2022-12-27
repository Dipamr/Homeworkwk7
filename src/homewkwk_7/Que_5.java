package homewkwk_7;
import java.util.Scanner;
public class Que_5 {
    public static void main(String[] args) {            //main method
        Scanner sc = new Scanner(System.in);
        System.out.println("Mark sheet");
        int Maths, Science, English;
        System.out.println("Input student Name");
        String t=sc.next();
        System.out.println("Input Student roll number");
        int a = sc.nextInt();
        System.out.println("Maths marks");
        Maths =sc.nextInt();
        System.out.println("Science marks");
        Science=sc.nextInt();
        System.out.println("English marks");
        English = sc.nextInt();
        System.out.println("Invalid Input");

        float sum = Maths + Science + English;
        System.out.println("The sum of total of all subjects" + sum);
        int total = 300;
        System.out.println("Total marks" + total);
        float per =sum/total*100;
        System.out.println("Total percentage" + per);

        if(per >=80){
            System.out.println("grade A+");                           //else if method
        }else if(per>=60){
            System.out.println("grade A");
        }else if (per>=50){
            System.out.println("grade B");
        }else if (per>35){
            System.out.println("grade C");
        }else{
            System.out.println("Fail");
        }


    }
}

