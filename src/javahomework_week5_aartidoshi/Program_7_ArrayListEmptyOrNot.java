package javahomework_week5_aartidoshi;

import java.util.ArrayList;

/**
 *  Write a Java program to test if an array list is empty or not.
 */
public class Program_7_ArrayListEmptyOrNot {

    public void isEmpty(){
        ArrayList<String> CarList = new ArrayList<>();
        CarList.add("Mercedes");
        CarList.add("BMW");
        CarList.add("Jagure");
        CarList.add("Tesla");
        CarList.add("Audi");
        CarList.add("Mini Cooper");
        CarList.add("Ferrari");
        System.out.println("Given Array List : " + CarList);
        if(CarList.isEmpty()){
            System.out.println(" !! Given Array List is Empty !! ");
        }else{
            System.out.println(" !! Given Array List is Not Empty !!");
        }
    }

    public static void main(String[] args) {
        Program_7_ArrayListEmptyOrNot obj = new Program_7_ArrayListEmptyOrNot();
        obj.isEmpty();
    }
}
