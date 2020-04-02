package hw11;

public class Employee {
    private Address address;
    private Profile profile;

    public Employee(Address address, Profile profile) {
        this.address = address;
        this.profile = profile;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Profile getProfile() {
        return profile;
    }

    private void displayEmployee() {
        address.displayAddress();
        profile.displayProfile();
    }
}
