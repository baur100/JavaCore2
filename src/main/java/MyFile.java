public class MyFile {
    public static void main(String[] args) {
        String test = " Now, looking at these three methods, ";
        reverse(test);
        reverseChar(test);
    }

    public static void reverse(String str){
        StringBuilder output = new StringBuilder();
        String[] words = str.split(" ");

        for (int i = words.length - 1; i >= 0; i--){
            output.append(words[i]);
            output.append(" ");
        }

        System.out.println("Initial String: " + str.length() + '\n' + "Reversed String: " + output.length());
        System.out.println("\033[35;1mOriginal String: \033[0m" + str);
        System.out.println("\033[35;1mReversed String: \033[0m" + output.toString().trim());

        // String Builder Method

        if (str.isEmpty()) { return; }

        StringBuilder rev = new StringBuilder();

        int i, j = str.length();

        for (i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                if (rev.length() == 0) { rev.append(str.subSequence(i + 1, j)); }
                else { rev.append(" ").append(str.subSequence(i + 1, j)); }
                j = i;
            }
            else if (i == 0) { rev.append(" ").append(str.subSequence(i, j)); }
        }

        System.out.println("Initial String: " + str.length() + '\n' + "Reversed String: " + rev.length());
        System.out.println("\033[35;1mOriginal String: \033[0m" + str);
        System.out.println("\033[35;1mReversed String: \033[0m" + rev);
    }

    public static void reverseChar(String str) {
        if (str.isEmpty() || str.length() <= 1) {
            System.out.println("Error!");
            return;
        }
        StringBuilder reverse = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--){
            reverse.append(str.charAt(i));
        }
        System.out.println(reverse);
    }
}
