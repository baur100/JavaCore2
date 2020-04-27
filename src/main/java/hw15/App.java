package hw15;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2013, 9900);
        Car car2 = new Car();
        car2.setBrand("Mazda");
        car2.setModel("6");
        car2.setPrice(7_400);
        car2.setYear(2014);

        List<Car> listCar = new ArrayList<Car>();

        listCar.add(car1);
        listCar.add(car2);
        System.out.println("Size of ArrayList is " + listCar.size());
        System.out.println(listCar);
        System.out.println();
        listCar.forEach(x -> System.out.println(x));

        List<Integer> integers = new ArrayList<>(Arrays.asList(456, 36, 479, 469, 6469));
        System.out.println(integers);
        integers.add(3434);
        System.out.println(integers);
        integers.set(0, 432);
        System.out.println(integers);
        integers.remove(1);
        System.out.println(integers);
        System.out.println(integers.get(3));
        integers.forEach(x -> System.out.println(x));
        System.out.println();

        List<Double> doubles = new ArrayList<>();
        doubles.add(23.32);
        doubles.add(54.45);
        doubles.add(24.42);
        doubles.add(12.21);
        System.out.println(doubles);
        doubles.set(3, 33.33);
        System.out.println(doubles.get(3));
        System.out.println(doubles.size());
        doubles.forEach(x -> System.out.println(x));

        System.out.println();
        Collections.sort(doubles);
        doubles.forEach(x -> System.out.println(x));
    }
}