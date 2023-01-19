package designpattern.abstract_factory_dp;

public class MicroCar extends Car{

    MicroCar(Location location) {
        super(CarType.MICRO, location);
        construct();
    }

    @Override
    void construct() {
        System.out.println("Connecting to microcar");
    }
}
