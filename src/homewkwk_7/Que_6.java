package homewkwk_7;
import java.util.Scanner;

//6. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
//salary
public class Que_6 {
    public static void main(String[] args) { //main method

        int HRA;
        int DA;
        int TA;
        int PF;
        int Grosssalary;
        int basicsalary;
        String Empolyeename;
        int  EmployeeID;
        Scanner sc1=new Scanner (System.in);
        System.out.println("Enter Employee ID");
        int a =sc1.nextInt();
        System.out.println("Enter Empolyee name");
        String name =sc1.next();
        System.out.println("Enter basic salary");
        basicsalary = sc1.nextInt();
        DA =(8* basicsalary)/100;
        HRA=(10*basicsalary)/100;
        TA=(9*basicsalary)/100;
        PF=(20*basicsalary)/100;

        Grosssalary=basicsalary+DA+HRA+TA- PF;
        System.out.println("|-------------------------------- |");
        System.out.println("|      Salary Slip                |");
        System.out.println("|                                 |");
        System.out.println("|-------------------------------- |");
        System.out.println("|Empolyee Id              :"+a+"  |");
        System.out.println("|Employee Name           :"+name+"|");
        System.out.println("|-------------------------------- |");
        System.out.println("|Basic salary     :"+basicsalary+" |");
        System.out.println("|HAR10%                    :"+HRA+"|");
        System.out.println("|TA8                       :"+TA+"|");
        System.out.println("|DA9                      :"+DA+"|");
        System.out.println("|PF -20&                  :"+PF+  "|");
        System.out.println("|----------------------------------|");
        System.out.println("|Gross salary      :"+Grosssalary+"|");
        System.out.println("|--------------------------------- |");

// let me know my mistake in this question? Thankyou
//giving me code 1

    }
}
