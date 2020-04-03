package hw11_z;

public class Listening {
    private Seller seller;
    private Realtor realtor;
    private Address address;

    public Listening(Seller seller, Realtor realtor, Address address) {
        this.seller = seller;
        this.realtor = realtor;
        this.address = address;
    }

    public Address getAddress() { return address;
    }

    public Realtor getRealtor() { return realtor;
    }

    public Seller getSeller() { return seller;
    }
    public void ListeningInfo(){
        address.printAddress1();
        realtor.printRealtor();
        seller.printSeller();

    }

}
