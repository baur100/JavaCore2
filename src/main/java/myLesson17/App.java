package myLesson17;

public class App {
    public static void main(String[] args) {

        int[] xx = {2, 5, 1};

        try {
            int vv = xx[1];
            int vvv = 6 / 0;
            System.out.println("I'm not wrong");
        } catch (ArrayIndexOutOfBoundsException err) {
            System.out.println("I'm WRONG");
        } catch (ArithmeticException err) {
            System.out.println("Divided by ZERO");
        } catch (Exception err) {
            System.out.println("Unknown exception");
            // throw new Exception("Errrrr");
            // блок finally не обязателен
        } finally {
            System.out.println("I will run in any case");
        }

        var p = new Person("Ivan", "Krotov");
        var p2 = new Person("Doris", "Sun");
        Person.counter = 10;
        Person.setCounter(15);
        System.out.println(Person.getCounter());
    }
}
