package HW10;

public class Store {
    private String name;
    private String owner;
    private int established;
    private Boolean isChain;
    private String [] departments;

    public Store() {}

    public Store(String name, String owner, int established, Boolean isChain, String[] departments) {
        this.name = name;
        this.owner = owner;
        this.established = established;
        this.isChain = isChain;
        this.departments = departments;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setEstablished(int established) {
        this.established = established;
    }

    public void setChain(Boolean chain) {
        isChain = chain;
    }

    public void setDepartments(String[] departments) {
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public int getEstablished() {
        return established;
    }

    public Boolean getChain() {
        return isChain;
    }

    public String[] getDepartments() {
        return departments;
    }

    public void printInfo(){
        System.out.println(name+"\nEstablished: "+established);
        if(isChain){
            System.out.println("Chain store");
        }else{
            System.out.println(owner);
        }
        for(String dep:departments){
            System.out.println("Departmets: "+dep+ ", ");
        }
    }
}
