package product;

public interface Product {

    public int getId();
    public String getName();
    public int getPrice();
    public int getQuantity();

    public void setId(int id);
    public void setName(String name);
    public void setPrice(int price);
    public void setQuantity(int quantity);

    public String toString();
}
