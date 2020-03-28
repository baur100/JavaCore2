package homework7;

public class sort {
    public static void main(String[] args){
        int [] array = {3,9,1,8,4,8,5};

        int min = array[0];
        int max = array[0];

        for(int i=0; i<=6; i++){
            if(array[i] < min) min = array[i];
            if(array[i] > max) max = array[i];
        }
            System.out.println("The smallest value in the Array is: "+ min);
            System.out.println("The largest value in the Array is: " + max);

    }
}
