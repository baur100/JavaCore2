package homework10;

public class Shop {
    private String adress;
    private int[] gate;
    private String service;

//    Constructors

    public Shop(String adress, int[] gate, String service){
        this.adress=adress;
        this.gate=gate;
        this.service=service;
    }
    public Shop(String adress, int[] gate){
        this.adress=adress;
        this.gate=gate;
    }
    public Shop(String s){
        this.service=s;
    }
    public Shop(){}


    //Setter

    public void setAdress(String adr) {
        this.adress = adr;
    }

    public void setGate(int[] gate) {
        this.gate = gate;

    }

    public void setService(String serv) {
        this.service = serv;
    }
//    Getter

    public String getAdress() {
        return adress;
    }

    public int[] getGate() {
        return gate;

    }

    public String getService() {
        return service;
    }



    public void printInfo(){
        System.out.println("Adress is "+getAdress()+" Gate is "+getGate()+" service is "+getService());
    }





    public void crash() {
        System.out.println("Ворота " + getGate() + " в сервисе по адресу " + getAdress() + " закрылись");
    }

    public void printClass(){
        System.out.println(getAdress()+" "+
                getService()+" "+
                getGate());

    }

//
//    public void printClass(){
//        System.out.print("Array elements ");
//        for (String v:products) {
//            System.out.print(" " + v);
//        }

}
