package hWA7;

public class Max {
    public static int max(int []listone){
        int max =-100000000;
        for(int v:listone){
            if(v>max){
                max = v;
            }
        }

        return max;
    }
}
