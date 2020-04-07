package hw10;

public class Farm {
    private String name;
    private String owner;
    private String type;
    private String[] products;

    //default constructor
    public Farm() {}

    //constructor
    public Farm(String name, String owner, String type, String[] products) {
        this.name = name;
        this.owner = owner;
        this.type = type;
        this.products = products;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setProduce(String[] products) {
        this.products = products;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public String getType() {
        return type;
    }

    public String[] getProducts() {
        return products;
    }

    public void printInfo(){
        System.out.println(name+" (Owner: "+owner+")"+"\nFarm type: "+type);
        for(String pr:products){
            System.out.println("This farm produces: "+pr+",");
        }
    }

}
