package hWA7;

public class Sort {
    public static int[] sort(int[] listone) {
        int temp;
        int[] newlist = new int[listone.length];

        for (int j = 0; j < listone.length - 1; j++) {
            for (int i = 0; i < listone.length - 1; i++) {
                if (listone[i] > listone[i + 1]) {
                    temp = listone[i];
                    listone[i] = listone[i + 1];
                    listone[i + 1] = temp;
                    newlist = listone;
                }
            }
        }


        return newlist;

    }
}




