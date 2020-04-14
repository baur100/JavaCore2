package HW16P1;

public class Offices {
    private String name;
    private String headOffice;

    public Offices(String name, String headOffice) {
        this.name = name;
        this.headOffice = headOffice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadOffice() {
        return headOffice;
    }

    public void setHeadOffice(String headOffice) {
        this.headOffice = headOffice;
    }

    @Override
    public String toString() {
        return "Offices{" +
                "name='" + name + '\'' +
                ", headOffice='" + headOffice + '\'' +
                '}';
    }
}
