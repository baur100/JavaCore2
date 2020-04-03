package HW11;

public class Storage {
    private String capacity;

    public Storage(String capacity) {
        this.capacity = capacity;
    }
    public void printInfo(){
        System.out.println("Storage => "+capacity);
    }
}
