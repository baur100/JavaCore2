public class Lesson3 {
    public static void main(String[] args) {
//        int age = 66;
//        int price = 1000;
//        if (age > 65) {
//            System.out.println(price * 0.8);
//        } else {
//            if (age > 12) {
//                System.out.println(price * 1);
//
//            } else if (age < 2) {
//                System.out.println(price * 0);
//            } else {
//                System.out.println(price * 0.5);
//
//            }
//        }
       // Arrays !!!
        int[] arr = {5, 7, 0, 12, 66 ,-285};
        System.out.println(arr[3]);
        String[] people ={"Nata", "Nick","Boris", "Ivan","Marina"};
        people[1] = "James";
        System.out.println(people[1]);
        System.out.println(people[people.length-1]);
        people[people.length-1] = "Karan";

        int[] arr1 = new int[5];
        String[] strs = new String[2];
        strs[0] = "hello";
        strs[1] = "world";
        //strs[2] = "peace";


    }

}
