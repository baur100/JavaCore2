package hw12;

public class SmartBlueray extends SmartTV{
   protected String BlurayBrand;
   protected String BlurayModel;

    public SmartBlueray(String name, String model, int size, String wifi, String opSysytem, String blurayBrand, String blurayModel) {
        super(name, model, size, wifi, opSysytem);
        BlurayBrand = blurayBrand;
        BlurayModel = blurayModel;
    }

    public String getBlurayBrand() {
        return BlurayBrand;
    }

    public String getBlurayModel() {
        return BlurayModel;
    }
}



