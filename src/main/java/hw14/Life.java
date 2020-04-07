package hw14;

public interface Life {
    void reproduce();

    default void eat() {
        System.out.println(this.getClass().getSimpleName() + " is eating");
    }

    default void die() {
        System.out.println(this.getClass().getSimpleName() + " died");
    }

    default void breath() {
        System.out.println(this.getClass().getSimpleName() + " is breathing");
    }

    private void getHierarchy (Class[] obj) {
        if (obj.length != 0) {
            for (Class i : obj) {
                System.out.print(" <- ");
                System.out.print(i.getSimpleName());
                getHierarchy(i.getInterfaces());
            }
        } else {
            return;
        }
    }

    default void printHierarchy () {
        System.out.print(this.getClass().getSimpleName() + " <- " + this.getClass().getSuperclass().getSimpleName());
        getHierarchy(this.getClass().getSuperclass().getInterfaces());
    }
}