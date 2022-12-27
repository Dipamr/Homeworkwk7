package homewkwk_7;
//21. Write a Java program to calculate the average value of array elements.
public class Que_21 {
    public static void main(String[]args){
        int [] numbers =new int [] {55,10,15,25,35};
        int sum =0;                                                 //sum of all arraay elements
        for(int i=0;i<numbers.length;i++)sum+=numbers[i];
        double average=sum/ numbers.length;                         //calculate average
        System.out.println(+average);



    }

}
