package HW12_task2;

public class App {
//    2. Создать объекты с глубиной в 3 класса  создать объект и вытащить объект при помощи геттеров
//                println
//        comp.getSysBlock().getProcessor().getBrand()

    public static void main(String[] args) {

        Cosmetic pinkLipstick = new Lipstick("Dior",1,20,"Pink","Moisturizing");
        System.out.println("This lipstick brand is "+pinkLipstick.getBrand());

        MakeUp mascara = new Mascara("Chanel", 1,38,"Black", "waterproof");
        System.out.println("This "+mascara.getBrand()+" mascara is "+mascara.getAction());
    }


}
