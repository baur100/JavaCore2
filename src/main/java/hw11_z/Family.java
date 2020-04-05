package hw11_z;

public class Family {
    private LastName lastname;
    private Children children;
    private Mother mother;
    private Address address;

    public Family(LastName lastname, Children children, Mother mother, Address address) {
        this.lastname = lastname;
        this.children = children;
        this.mother = mother;
        this.address = address;

    }

    public Children getChildren() {
        return children;
    }

    public LastName getLastname() {
        return lastname;
    }

    public Mother getMother() {
        return mother;
    }

    public Address getAddress() { return address;
    }

    public void familyInfo(){
        lastname.printLastName();
        mother.printMother();
        children.infoChildren();
        address.printAddress3();
        lastname.getLastName();



    }


}
