package hw11_z;

public class Seller {
    private String name;
    private String lastName;
    private Address address;

    public Seller(String name, String lastName, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    public String getName() { return name;
    }
    public String getLastName() { return lastName;
    }
    public Address getAddress() { return address;
    }
    public void printSeller(){
        System.out.println("Owner = "+ name+" "+lastName);
        address.printAddress2();
    }

}
