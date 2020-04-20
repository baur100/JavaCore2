public class StringLesson {
    public static void main(String[] args) {
        String str = " Hello students, today is a good day ";
        System.out.println(str.length());                                   //Size of string
        System.out.println(str.contains("ello"));                           //Contains substring
        System.out.println(str.replace('o', '0'));           //Replace single char
        System.out.println(str.replace("ello", "ELLO"));     //Replace substring
        System.out.println(str.charAt(0));                                  //Return char at index
        System.out.println(str.compareTo("Hello students, today is a good day"));
        boolean xx = "ddd".equals("ttt");                                   //Is equal two strings
        System.out.println(str.compareToIgnoreCase("Hello studentS, today iS A Good Day"));
        System.out.println(str.concat(" - because today is Sunday"));
        System.out.println(str.indent(5));                                  //Отступ
        var words = str.split(" ");
        System.out.println(words[1]);
        String url = "www.strings.com";
        var domain = url.split("\\.")[1];
        System.out.println(domain);
        System.out.println(String.join("-", words));

        System.out.println(str.trim());                                     //Trim String (убирает пробелы)
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.substring(2, 5));
        System.out.println(str.substring(str.length() - 3));

        System.out.printf("My name is %s", "xx");
        String name = "Some Name";
        System.out.println("My name is " + name);
        System.out.printf("My name is %s", name);
    }
}
