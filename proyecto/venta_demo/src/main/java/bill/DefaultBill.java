package bill;

import java.util.HashMap;
import product.*;

public class DefaultBill {
    private int id;
    private String date;
    private int client_id;
    private HashMap<Product, Integer> products;

    public DefaultBill(int id, String date, int client_id, HashMap<Product, Integer> products) {
        this.id = id;
        this.date = date;
        this.client_id = client_id;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public int getClientId() {
        return client_id;
    }

    public HashMap<Product, Integer> getProducts() {
        return products;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setClientId(int client_id) {
        this.client_id = client_id;
    }

    public void setProducts(HashMap<Product, Integer> products) {
        this.products = products;
    }

    public String toString() {
        String result = "id: " + id + "\ndate: " + date + "\nclient_id: " + client_id + "\nproducts: ";
        for (Product product : products.keySet()) {
            result += product.toString() + " quantity: " + products.get(product) + "";
        }
        return result;
    }

}