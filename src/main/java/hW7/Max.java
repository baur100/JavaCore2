package hW7;

public class Max {
    public static int max(int []listone){
        int max =-100000000;
        for(int i=0;i<listone.length-1;i++){
            if(listone[i]>max){
                max = listone[i];
            }
        }

        return max;
    }
}
