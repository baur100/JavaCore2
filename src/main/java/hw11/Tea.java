package hw11;

public class Tea {
    private String temp;
    private String kind;

    public Tea(String temp, String kind) {
        this.temp = temp;
        this.kind = kind;
    }
    public void prinInfo(){
        System.out.println(temp+kind+" tea");
    }
}
