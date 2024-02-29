package week4.question02;

public class Leena {
    /*
     String -- Remove Duplicates
     Write a return method that can remove the duplicated values from String
     Ex: removeDup("AAABBBCCC") ==> ABC
     */
    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAABBBCCC"));
    }
    public static  String  removeDup( String  str) {
        String result = "";
        for (int i = 0; i < str.length(); i++)
            if (!result.contains("" + str.charAt(i)))
                result += "" + str.charAt(i);

        return result;
    }
    public static  String  removeDuplicates( String  str) {
        char[] chars1 = str.toCharArray();
        String result = "";
        for (char c : chars1) {
            if (!result.contains("" + c))
                result += "" + c;
        }
        return result;
    }

}
