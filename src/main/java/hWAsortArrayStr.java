import java.util.Arrays;

public class hWAsortArrayStr {
    public static void main(String[] args) {
        String[] list = new String[]{"a", "ds", "f", "z", "b", "da"};

        // Arrays.sort(list);
        for(int x =0;x<list.length-1;x++){
            for(int j =x+1;j<list.length;j++){
                if(list[x].compareTo(list[j])>0){
                    String temp=list[x];
                    list[x]=list[j];
                    list[j]=temp;
                }
            }
        }


        for(int i=0;i<list.length;i++){
            System.out.print(list[i]+"'");
        }

    }
}

