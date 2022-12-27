package homewkwk_7;
//15. Write a Java program which input any number between 1 to 7 and it print The Days
//name MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch.
//NOTE: if number is out of selection Print message “Week contains 1 to 7 days”

import java.util.Scanner;
public class Que_15 {
    public static void main(String[] args) {
       int n;
       System.out.print("Enter code of Day");
       Scanner t=new Scanner(System.in);
       n=t.nextInt();
       switch(n){
           case 1:System.out.print("MONDAY");
           break;
           case 2:System.out.print("TUESDAY");
               break;
           case 3:System.out.print("WEDNESDAY");
               break;
           case 4:System.out.print("THURSDAY");
               break;
           case 5:System.out.print("FRIDAY");
               break;
           case 6:System.out.print("SATURDAY");
               break;
           case 7:System.out.print("SUNDAY");
               break;
           case 0:System.out.print("Week contains 1 to 7days");
               break;
           default:
               System.out.println("Invalid Code");
               break;

       }

    }

}
