package homework10;
//Сделать 3 класса - в каждом классе по краней мере 3 fields
//Каждый аттрибут имеет setter и getter
//Каждый класс имеет по краней мере 2 конструктора - default и полный (можно больше конструкторов)
//создайте в каждом классе метод printClass() - для вывода всех полей на экран
//По крайней мере один атрибут в одном классе должен быть array
//Создайте в классе Work / main() по крайней мере 2 объекта каждого класса - один полным конструктором, один дефолтовым. Объект созданный дефолтовым конструктором заполните при помощи сеттеров
//Выведите на экран эти объекты функцией printClass()


///// Почему то в арреях белеберда??????


public class Work {

    public static void main(String[] args) {
// Shop
        Shop shop1 = new Shop();
        shop1.setAdress("10232 Dany rd, Los-Baltos, 33443");
        shop1.setGate(new int[]{1, 2, 3, 4});
        shop1.setService("Balancers");

        shop1.printInfo();
        shop1.crash();
        

        System.out.println();

        int[] xx = {3, 4, 5, 6};
        Shop shop2 = new Shop("3323 St st, GloryDays, 44355", xx, "tint");

        shop2.crash();
        shop2.printInfo();

        System.out.println();

        shop1.printClass();

        //    Cars
        int[] yy = {1, 12, 1998};
        Cars car1 = new Cars("Toyota", yy, "Green");
        car1.printInfo();
        car1.beep();

        System.out.println();

        String tt = "civic";
        Cars car2 = new Cars("honda", tt);
        car2.beep();
        car2.printInfo();

        System.out.println();


        Cars car3 = new Cars();
        int[] rr = {12,2,2004};
        car3.setMake("Jigul");
        car3.setColor("White");
        car3.setModel("vaz 2106");
        car3.beep();
        car3.printInfo();
        car3.setYear(rr);
        car3.printClass();

        System.out.println();


//        Workers

        Workers workr1 = new Workers();
        workr1.setName("Ivan");
        workr1.setLastName("Mishkin");
        workr1.setBirthYear(12,4,1988);
        workr1.setService("master");

        workr1.tuktuk();
        workr1.working();

        System.out.println();

        Workers workr2 = new Workers("Sasha", "Ivanov", new int[]{31,5,1998},"Pomoshnik");
        workr2.working();
        workr2.tuktuk();








    }


}

