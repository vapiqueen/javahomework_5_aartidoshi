package javahomework_week5_aartidoshi;

import java.util.Arrays;

/**
 * Write a Java program to reverse an array of integer values.
 */
public class Program_3_ReverseArrayOfIntegerValue {

    public void reverseAnArray(int [] list){
        for (int i = 0; i<list.length /2; i++) {
            int temp = list[i];
            list[i]=list[list.length -1 -i];
            list[list.length -1 -i] = temp;
        }
        System.out.println(Arrays.toString(list));
    }

    public static void main(String[] args) {
        int[] array = new int[]{07,10,12,13,24,26,80,84};
        System.out.println("Actual Array" + Arrays.toString(array));
        Program_3_ReverseArrayOfIntegerValue obj =new Program_3_ReverseArrayOfIntegerValue();
        obj.reverseAnArray(array);
    }

}
