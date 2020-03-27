package hW7;

public class Sort {
    public static int[] sort(int[] listone) {
        int[] newlist = new int[listone.length];

        for(int i=0;i<listone.length;i++){
            int temp = listone[i];

            for(int j=i+1;j<listone.length;j++){
                if (listone[j]<temp){
                    temp=listone[j];
                }

            }
            newlist[i]=temp;


        }
        return newlist;
    }
}