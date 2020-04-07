package hw14;

public interface Mammals extends Vertebrates {
    @Override
    default void reproduce() {
        String message = this.getClass().getSimpleName() + " is reproducing";
        System.out.println(message);
        for(int i = 0; i < message.length() / 3; i++) {
            System.out.printf(" - ");
            try{
                Thread.sleep(250);
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
        System.out.println("A new " + this.getClass().getSimpleName().toLowerCase()  + " was born");
    }
    default void warmBlood() {
        System.out.println(this.getClass().getSimpleName() + " has warm blood");
    }
}
