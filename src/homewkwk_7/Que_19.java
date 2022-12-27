package homewkwk_7;
//19. Write a Java program to sort a numeric array and a string array.
import java.util.Arrays;

public class Que_19 {
    public static void main(String[] args) {
        int[]array1={11,12,13,14,15};
        String[]array2={"cat","dog","rat","fish","mouse"};
        System.out.println("Original value:" + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted value:"+ Arrays.toString(array1));
        System.out.println("Original value:" + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted value:"+ Arrays.toString(array2));




    }

}
