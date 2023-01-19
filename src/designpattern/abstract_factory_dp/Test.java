package designpattern.abstract_factory_dp;

public class Test {
    public static void main(String[] args) {
        System.out.println(CarFactory.buildCarFactory(CarType.MINI));
        System.out.println(CarFactory.buildCarFactory(CarType.MICRO));
        System.out.println(CarFactory.buildCarFactory(CarType.LUXURY));
    }
}
