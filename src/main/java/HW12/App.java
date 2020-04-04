package HW12;

public class App {
    public static void main(String[] args) {
        General general = new General("Ivan", "Ivanov", "генерал", "мужчина", "Москва");
        System.out.println(general.getFirstname());
        System.out.println(general.getLastname());
        System.out.println(general.getRank());
        System.out.println(general.getGender());
        System.out.println(general.getCity());

        Major major = new Major("Petr", "Petrov", "майор", "мужчина", "Ленинград",
                55);
        System.out.println(major.getFirstname());
        System.out.println(major.getLastname());
        System.out.println(major.getRank());
        System.out.println(major.getGender());
        System.out.println(major.getCity());
        System.out.println(major.getAge());

        Lieutenant lieutenant = new Lieutenant("Genadiy", "Portnov", "лейтенант", "мужчина",
                "Калуга", 33, 3.0);
        System.out.println(lieutenant.getFirstname());
        System.out.println(lieutenant.getLastname());
        System.out.println(lieutenant.getRank());
        System.out.println(lieutenant.getGender());
        System.out.println(lieutenant.getCity());
        System.out.println(lieutenant.getAge());
        System.out.println(lieutenant.getIq());

        Soldier soldier = new Soldier("Stepan", "Bevrov", "солдат", "мужчина", "Керчь",
                20, 2.8, 19662020);
        System.out.println(soldier.getFirstname());
        System.out.println(soldier.getLastname());
        System.out.println(soldier.getRank());
        System.out.println(soldier.getGender());
        System.out.println(soldier.getCity());
        System.out.println(soldier.getAge());
        System.out.println(soldier.getIq());
        System.out.println(soldier.getMilitaryID());
    }
}
