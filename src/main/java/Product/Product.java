package Product;

import java.util.Objects;

public class Product {

    private int id;
    private double cost;
    private String name;
    private boolean onSale;

    public Product(int id, double cost, String name, boolean onSale) {
        this.id = id;
        this.cost = cost;
        this.name = name;
        this.onSale = onSale;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return cost == product.cost && onSale == product.onSale && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost, name, onSale);
    }
}
