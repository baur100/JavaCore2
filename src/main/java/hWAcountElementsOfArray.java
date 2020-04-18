import java.util.ArrayList;
import java.util.List;

public class hWAcountElementsOfArray {

    public static void main(String[] args) {
        String[] text = { "a", "a", "r", "d", "f", "f", "a", "a", "a", "a", "a","f","f"};
        //"a", "a", "r", "d", "f", "f", "a", "a", "a", "a",
        List<String> result = new ArrayList<>();

        for (int i = 0; i < text.length - 1; i++) {
  //          if (text[i].equals(text[i + 1])) {
                int count = 1;
                String letter = text[i];
                while (letter.equals(text[i]) && i < text.length) {
                    i++;
                    count++;
                }
                result.add(letter + count);


        }
        System.out.println(result);


//        int s = text.length;
//        int count = 1;
//        String temp = "";
//        if (s == 0) {
//            System.out.println("please, provide numbers for array");
//        } else if (s == 1) {
//            System.out.println(text[0] + " " + 1);
//        } else
//            for (int i = 0; i <text.length; i++) {
//                if (text[i+1] == text[i]) {
//
//                    count = count + 1;
//                    i++;
//
//                }  System.out.println(text[i] + " " + count);
//
//                count = 1;
//
//
//            }
//
//    }
    }
}


