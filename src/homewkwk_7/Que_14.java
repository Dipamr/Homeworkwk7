package homewkwk_7;
//14. Write a program that tells us input value is number or an alphabet or symbol.


import java.util.Scanner;
public class Que_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value: - ");
        char ch= sc.next().charAt(0);
        if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z')){
            System.out.println("alphabet");
        }
       else if(ch>='1'&& ch<='9')


        {
            System.out.println("number");
        }
       else
        {
            System.out.println("Special Character");
        }

    }
}
