package builderpattern;

public class BuilderPattern {

    public static void main(String[] args) {
        Bikes sport = new BikeConcreteBuilder().setName("Cyn").setPrice("2000").build();
        Bikes flast = new BikeConcreteBuilder().setName("Mna").setPrice("2000").setType("New").build();
        System.out.println(sport.toString());
        System.out.println(flast.toString());
    }
    
}