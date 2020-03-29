package hw8_z;

public class Furniture {
    public String type;
    public String shape;
    public String material;
    public String color;

    public void expand(){
        System.out.println(type+" expands to 8 persons");

    }

    public void assembleInstruction(){
        System.out.println(shape+" "+type+" requires specialist assembling");
    }
    public void assembleInstruction2(){
        System.out.println(shape+" "+type+" doesn't require specialist assembling");
    }
    public void feature(){
        System.out.println(shape+" "+type+" great for traveling due to light weight and small size");
    }


}
