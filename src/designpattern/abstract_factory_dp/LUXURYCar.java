package designpattern.abstract_factory_dp;

public class LUXURYCar extends Car{

    LUXURYCar(Location location) {
        super(CarType.LUXURY, location);
        construct(); // calling const
    }

    @Override
    void construct() {
        System.out.println("connecting to luxary car");
    }
}
