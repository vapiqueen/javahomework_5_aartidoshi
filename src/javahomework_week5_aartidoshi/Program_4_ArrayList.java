package javahomework_week5_aartidoshi;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Program_4_ArrayList {

    public static void main(String[] args) {
        //ArrayList for colour
        ArrayList<String> colourlist = new ArrayList<>();
        colourlist.add("White");
        colourlist.add("Pink");
        colourlist.add("Yellow");
        colourlist.add("Purple");
        colourlist.add("Green");

        for(String colourList:colourlist){
            System.out.println(colourList + ",");
        }
    }
}

