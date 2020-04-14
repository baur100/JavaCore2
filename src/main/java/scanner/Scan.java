package scanner;

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Scan {
    public static void main(String[] args) {

        String s = "Hello World! 3 + 3.0 = 6";

        // create a new scanner with the specified String Object
        Scanner scanner = new Scanner(System.in);
        Pattern p = Pattern.compile("[a-zA-Z0-9 ]*");
while (!scanner.hasNext(p)) {
    System.out.print("" + scanner.hasNext(p) + "  ");
    System.out.println("Это все хуйня, пробуй еще!  " + scanner.next());
}

        // print the rest of the string
        System.out.println("Thank you.  " + scanner.next());

        // close the scanner
        scanner.close();
    }
}