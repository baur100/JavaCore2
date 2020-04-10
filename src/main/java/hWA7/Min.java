package hWA7;

public class Min {
    public static int min(int []listone){
        int min =100000000;
        for(int i=0;i<listone.length;i++){
            if(listone[i]<min){
                min = listone[i];
            }
        }

        return min;
    }
}
