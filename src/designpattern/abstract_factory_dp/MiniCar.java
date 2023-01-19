package designpattern.abstract_factory_dp;

public class MiniCar extends Car{

    MiniCar(Location location) {
        super(CarType.MINI, location);
        construct();
    }

    @Override
    void construct() {
        System.out.println("connecting to mini-car");
    }
}
