public class hWAsorArrayInt {
    public static void main(String[] args) {
        int[] list=new int[]{22,12,4,35,76,87,1};

        int temp;
        for(int i=0;i<list.length;i++){
            for(int j=i+1;j<list.length;j++){
                if (list[i]<list[j]){
                    temp=list[i];
                    list[i]=list[j];
                    list[j]=temp;
                }
            }
        }
        System.out.println("desc order");
        for(int i=0;i<list.length;i++){
            System.out.println(list[i]+";");
        }




    }
}
