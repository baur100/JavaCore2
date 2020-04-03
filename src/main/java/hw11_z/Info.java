package hw11_z;

public class Info {
    private Seller seller;
    private Realtor realtor;
    private Listening listening;
    private Address address;

    public Info(Seller seller, Realtor realtor, Listening listening, Address address) {
        this.seller = seller;
        this.realtor = realtor;
        this.listening = listening;
        this.address = address;
    }

    public Listening getListening() { return listening;
    }

    public Address getAddress() { return address;
    }

    public Realtor getRealtor() { return realtor;
    }

    public Seller getSeller() { return seller;
    }
    public void printInfo(){
        seller.printSellerInfo();
        listening.printListening();
        address.printAddress();
        realtor.printRealtor();

    }


}

