package hw11_z;

public class Mother {
    private String name;
    private LastName lastname;
    private Children children;
    private Address address;

    public Mother(String name, LastName lastname, Children children, Address address) {
        this.name = name;
        this.lastname = lastname;
        this.children = children;
        this.address = address;
    }

    public LastName getLastname() {return lastname;
    }

    public String getName() {return name;
    }

    public Address getAddress() {return address;
    }

    public Children getChildren() {return children;
    }

    public void printMother() {
        System.out.println("My name is "+ name);
//        address.printAddress3();
//        children.infoChildren();
        lastname.printLastName();


    }
}
