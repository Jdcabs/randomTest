public class Product {

    Product(){
        System.out.println("Object has been created.");
    }

    private int product_ID;
    private String name;
    private int price;

    //Setters.
    public void setProduct_ID(int product_ID) { this.product_ID = product_ID; }
    public void setName(String name) { this.name = name; }
    public void setPrice(int price) { this.price = price; }

    //Getters.
    public int getProduct_ID() { return product_ID; }
    public String getName() { return name; }
    public int getPrice() { return price; }

    void setProduct(int product_ID, String name, int price){
        setProduct_ID( product_ID);
        setName(name);
        setPrice(price);
        System.out.println("-------Product has been set.-------\n");
    }

    void getProduct(){
        System.out.println("-------ID: " + getProduct_ID() + "-------");
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice() + "\n");
    }
}
