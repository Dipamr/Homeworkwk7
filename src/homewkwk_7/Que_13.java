package homewkwk_7;
//13. Write a java program to print the numbers between 1 to 100 which can be divided by 3
//and 5 separately.
public class Que_13 {
    public static void main(String[] args){
        for(int i =1;i<=100;i++){
            if(i%3==0){
                System.out.print(i+", ");
            }
        }
        System.out.println();
        for(int i=1;i<=100;i++){
            if(i%5==0){
                System.out.print(i+" ,");
            }
        }
    }
}



