import java.io.Serializable;
public abstract class PhotoTechnique implements Serializable {
    private String brand;
    private int price;

    public PhotoTechnique() {
        brand = "";
        price = 0;
    }
    public PhotoTechnique(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PhotoTechnique{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
