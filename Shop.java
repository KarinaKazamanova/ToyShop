import java.util.PriorityQueue;


public class Shop {

    private String shopName;
    private PriorityQueue<Toy> toys;

    public PriorityQueue<Toy> getToys() {
        return toys;
    }

    public void setToys(PriorityQueue<Toy> toys) {
        this.toys = toys;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Shop(String name, PriorityQueue<Toy> toys){
        this.shopName  = name;
        this.toys = toys;
    }

    public Shop(String name){
        this(name, new PriorityQueue<Toy>());
    }


    public void put(Toy t){
        this.toys.add(t);
    }
    
}
