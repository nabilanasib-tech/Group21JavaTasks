package week04.question3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Batdorj {

    public static void main(String[] args) {

        System.out.println(removeDup("AAABBBCCC")); // ABC
    }

    public static String removeDup(String input) {
        return Arrays.stream(input.split(""))
                .distinct()
                .collect(Collectors.joining());
    }
}
