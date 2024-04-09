package week9.Question3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Andrea {
/*
    3 - List_RemoveSomeValues -
        Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc. remove all values greater than 100.
*/
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 101, 200, 300);
        list.removeIf(i -> i > 100);
        System.out.println(list);

    }
}
