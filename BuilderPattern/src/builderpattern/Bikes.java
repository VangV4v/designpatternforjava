package builderpattern;

/**
 *
 * @author vangv
 */
public class Bikes {
    private String name;
    private String type;
    private String price;

    public Bikes(String name, String type, String price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Bikes{" + "name=" + name + ", type=" + type + ", price=" + price + '}';
    }
    
}