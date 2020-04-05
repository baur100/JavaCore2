package hw_13;

public class App {
    public static void main(String[] args) {

        Address address = new Address("Hollow Hills", 2015,89012);

        var parent1 = new Parents("Dinara", address,40);
        var parent2 = new Parents("Ronny", address, 50);

        var child1 = new Child1("Samuel", address, 14,8);
        var child2 = new Child1("Malika", address,10,4);

        //String a = parent1.getAddress().getStName();

        //System.out.println(child1.getName());
        //System.out.println(child2.getName());
        //System.out.println(parent1.getName());
        //System.out.println(parent2.getName());
        child1.biking();
        child2.biking();
        parent1.takingWalk();
        parent2.takingWalk();










    }
}
