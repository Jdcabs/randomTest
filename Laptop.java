public class Laptop extends Product {

    private int ram_Size;
    private String operating_System;
    private String processor;
    private int HDD_Size;

    public Laptop() {
        System.out.println("-------Laptop Object Created-------");
    }

    //Setters.
    public void setRam_Size(int ram_Size) { this.ram_Size = ram_Size; }
    public void setOperating_System(String operating_System) { this.operating_System = operating_System; }
    public void setProcessor(String processor) { this.processor = processor; }
    public void setHDD_Size(int HDD_Size) { this.HDD_Size = HDD_Size; }

    //Getters.
    public int getRam_Size() { return ram_Size; }
    public String getOperating_System() { return operating_System; }
    public String getProcessor() { return processor; }
    public int getHDD_Size() { return HDD_Size; }


    void setProduct(int product_ID, String name, int price, int ram_Size, String operating_System, String processor, int HDD_Size ){
        setProduct_ID( product_ID);
        setName(name);
        setPrice(price);
        setRam_Size(ram_Size);
        setOperating_System(operating_System);
        setProcessor(processor);
        setHDD_Size(HDD_Size);
        System.out.println("-------Product has been set.-------\n");
    }


    void getProduct(){
        System.out.println("-------ID: " + getProduct_ID() + "-------");
        System.out.println("Name: " + getName());
        System.out.println("Operating System: " + getOperating_System());
        System.out.println("Processor: " + getProcessor());
        System.out.println("Ram Size: " + getRam_Size());
        System.out.println("HDD Size: " + getHDD_Size());
        System.out.println("Price: " + getPrice());
        System.out.println("--------------------------------");
    }
}
