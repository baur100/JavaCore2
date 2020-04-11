package Lesson17;

public class App {
    public static void main(String[] args) {
        int[] xx = {2, 5, 1};
        try {
            int vv = xx[1];
            int vvv = 6 / 0;

            System.out.println("not error");
        } catch (ArrayIndexOutOfBoundsException err) {
            System.out.println("error");

        } catch (ArithmeticException err) {
            System.out.println("Divide by 0");

        } catch (Exception err) {
            System.out.println("Unknown exeption");
            // throw new Exception("Errrrr");

        } finally {
            System.out.println("any run case");
        }
        var p = new Person("Ivan", "Krotov");
        var p2 = new Person("Ivan1", "Krotov2");

        Person.counter = 10;
        //Person.setCounter(15);
        //System.out.println(Person.getCounter());

    }
}
