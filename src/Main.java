import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Palindrome palindrome = new Palindrome();
        Converter converter = new Converter();
        Subsequences subsequences = new Subsequences();

        System.out.println("Palindrome");
        //Palindrome-----------------------------------------
        System.out.println(palindrome.palindromeCheck("aba"));
        //Palindrome-----------------------------------------
        System.out.println("Converter");
        //Converter-------------------------------------------
        ArrayList<Integer> b = new ArrayList<>(List.of(2, 1, 3, 4, 5));
        System.out.println(converter.listConverter(0, b));
        //Converter-------------------------------------------
        System.out.println("Subsequences");
        //Subsequences-------------------------------------------
        ArrayList<Integer> al = new ArrayList<>();
        int[] arr = new int[]{3, 1, 2};
        int i = 0;
        subsequences.printingSub(al, arr, i);
        //Subsequences-------------------------------------------
    }
}