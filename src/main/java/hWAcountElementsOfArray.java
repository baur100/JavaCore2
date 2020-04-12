public class hWAcountElementsOfArray {

    public static void main(String[] args) {
        String[] text = new String[]{"a", "a", "r", "d", "f", "f", "a", "a", "a"};
        int s = text.length;
        int count = 1;
        String temp = "";
        if (s == 0) {
            System.out.println("please, provide numbers for array");
        } else if (s == 1) {
            System.out.println(text[0] + " " + 1);
        } else
            for (int i = 0; i <=text.length; i++) {
               if (text[i+1] == text[i]) {

                    count = count + 1;
                   i++;

                }  System.out.println(text[i] + " " + count);

                count = 1;


            }

        }
    }


