package builderpattern;

public class BikeConcreteBuilder implements BikeBuilder {

    private String name;
    private String type;
    private String price;
    
    @Override
    public BikeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public BikeBuilder setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public BikeBuilder setPrice(String price) {
        this.price = price;
        return this;
    }

    @Override
    public Bikes build() {
        return new Bikes(name, type, price);
    }
    
}