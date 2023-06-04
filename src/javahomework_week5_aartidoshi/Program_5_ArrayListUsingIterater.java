package javahomework_week5_aartidoshi;
/**
 * Write a Java program to iterate through all elements in an array list using Iterater.
 */

import java.util.ArrayList;
import java.util.ListIterator;

public class Program_5_ArrayListUsingIterater {


        public static void main(String[] args) {

            ArrayList<String> gagetslist = new ArrayList<>();
            gagetslist.add("MobilePhone");
            gagetslist.add("Laptop");
            gagetslist.add("Television");
            gagetslist.add("MusicSystem");
            gagetslist.add("VideoGames");

            ListIterator<String> iterator = gagetslist.listIterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
    }

