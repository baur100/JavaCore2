package hw11_z;

public class Realtor {
    private String name1;
    private String lastName1;
    private long cellNumber;
    private Address address;
    private int price;

    public Realtor(String name1, String lastName1, long cellNumber, Address address, int price) {
        this.name1 = name1;
        this.lastName1 = lastName1;
        this.cellNumber = cellNumber;
        this.address = address;
        this.price = price;
    }

    public long getCellNumber() {      return cellNumber;
    }

    public Address getAddress() {        return address;
    }

    public int getPrice() {        return price;
    }

    public String getLastName1() {        return lastName1;
    }

    public String getName1() {        return name1;
    }
    public void printRealtor(){
        System.out.println("Realtor name = "+ name1+" "+lastName1+", cell "+cellNumber+" price: "+price);
        address.printAddress1();
    }
}



