package hw14;

public class FinalProject {
    public static void main(String[] args) {

        Lion lion = new Lion(50);
         lion.name();
         lion.canBreathe();
         lion.haveBackbone();
         lion.canEat();
         lion.produceMilk();
         lion.canDo();
         lion.canLove();
         lion.canEnjoy();
         System.out.println("  Lion's speed "+ new Lion(50));

         Wolf wolf = new Wolf(6);
         wolf.name();
         wolf.canBreathe();
         wolf.haveBackbone();
         wolf.canDo();
         wolf.canEat();
         wolf.produceMilk();
         wolf.canEnjoy();
         wolf.canLove();
        System.out.println(new Wolf(6));

        BlueWhale whale = new BlueWhale(110000);
        whale.name();
        whale.canBreathe();
        whale.canEat();
        whale.haveBackbone();
        whale.produceMilk();
        whale.canDo();
        whale.canEnjoy();
        whale.canLove();
     System.out.println(new BlueWhale(110000));

    }
}
