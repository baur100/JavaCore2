package HW15;

import java.util.ArrayList;
import java.util.List;

public class Work {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<String>();
        List<Double> rowList = new ArrayList<Double>();
        List<Integer> intNumbers = new ArrayList<Integer>();
        List<Starships> starships = new ArrayList<Starships>();

        starships.add(new Starships("Millennium falcon", "Star Wars", 62));
        starships.add(new Starships("USS Enterprise", "Star Track", 490));
        starships.add(new Starships("Empire Star Destroyer", "Star Wars", 5900));
        Starships voyager = new Starships("Voyager 1", "NASA", 12);
        starships.add(voyager);
        starships.forEach((a) -> System.out.println(a.getName()+", "+a.getLocation()+", "+a.getSize()));
        starships.remove(2);
        System.out.println("");


        cars.add(0, "Honda");
        cars.add(1, "Mazda");
        cars.add("BMW");
        cars.add(0, "MB");
        System.out.println(cars.set(2,"WV") + " was replaced by WV");
        System.out.println(cars);

        for (double i = -1; i <=1 ; i=i+0.1) {
            rowList.add(Math.sin(i));
        }
        System.out.println(rowList);
        if (rowList.contains(-0.8414709848078965)) {
            rowList.remove(rowList.indexOf(-0.8414709848078965));
        }
        System.out.println(rowList);

        for (int i = 0; i <= 10; i++) {
            intNumbers.add((int) Math.exp(i));
        }
        System.out.println(intNumbers);
        intNumbers.forEach((x)-> print(x.compareTo(20)));



    }

    public static void print(int x){
        System.out.println("Here is comparison results:  " + x);
    }
}
