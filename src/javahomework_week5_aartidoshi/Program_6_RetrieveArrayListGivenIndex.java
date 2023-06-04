package javahomework_week5_aartidoshi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  Write a Java program to retrieve an element (at a specified index) from a given array list
 */

public class Program_6_RetrieveArrayListGivenIndex {
    public static void main(String[] args) {

        ArrayList<String> gagetslist = new ArrayList<>();
        gagetslist.add("MobilePhone");
        gagetslist.add("Laptop");
        gagetslist.add("Television");
        gagetslist.add("MusicSystem");
        gagetslist.add("VideoGames");
        System.out.println(gagetslist);
        Scanner s6 = new Scanner(System.in);
        System.out.println("Please eneter the number to choose from the index : ");
        int index = s6.nextInt();
        if(index< gagetslist.size()){
            System.out.println(gagetslist.get(index));
        }else{
            System.out.println("Invalid Input by the User");
        }
        s6.close();
    }
}
