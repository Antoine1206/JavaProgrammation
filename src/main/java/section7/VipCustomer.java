package section7;

public class VipCustomer {


    private String name;
    private int limit;
    private String address;


    public VipCustomer() {
        this("default name", 5000, "default@email.com");
    }

    public VipCustomer(String name, int limit) {
        this(name, limit, "email");    //email par defaut
    }

    public VipCustomer(String name, int limit, String address) {
        this.name = name;
        this.limit = limit;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getLimit() {
        return limit;
    }

    public String getAddress() {
        return address;
    }
}
