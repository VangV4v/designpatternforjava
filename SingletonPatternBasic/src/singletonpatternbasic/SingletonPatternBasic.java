package singletonpatternbasic;

public class SingletonPatternBasic {

    public static void main(String[] args) {
        Persons p1 = Persons.getInstance();
        p1.initData("Vang", "21");
        Persons p2 = Persons.getInstance();
        p2.initData("Wang", "21");
        System.out.println(p1.toString());
        System.out.println(p1.toString());
    }

}
