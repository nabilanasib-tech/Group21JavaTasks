package week9.Question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Andrea {
/*
    2 - List_RemoveNameAhmed -
        Given a list of people names: "Ahmed", "John", Eric", "Ahmed", "Aaron".....
        Write a java operation to remove all the names named Ahmed
 */
    public static void main(String[] args) {
        String[] names = {"Ahmed", "John", "Eric", "Ahmed", "Aaron"};
        List<String> list =  new ArrayList<String>();
        Collections.addAll(list, names);
        list.remove("Ahmed");
        list.remove("Ahmed");
        names = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(names));
    }
}
