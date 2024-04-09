package week9.Question2;

import java.util.ArrayList;
import java.util.Arrays;

public class Andrea {
    /*
        2 - List_RemoveNameAhmed -
            Given a list of people names: "Ahmed", "John", Eric", "Ahmed", "Aaron".....
            Write a java operation to remove all the names named Ahmed
     */
    public static void main(String[] args) {
        String[] names = {"Ahmed", "John", "Eric", "Ahmed", "Aaron"};
        System.out.println("Original: " + Arrays.toString(names));
        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));
        for (int i = 0; i < names.length; i++) {
            list.remove("Ahmed");
        }
        System.out.println("New: " + list);
    }
}