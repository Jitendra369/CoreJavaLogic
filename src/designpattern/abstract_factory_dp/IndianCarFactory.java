package designpattern.abstract_factory_dp;

public class IndianCarFactory {
    static Car buildCar(CarType carType){
        Car car = null;
        switch (carType){
            case MINI :
               car =  new MiniCar(Location.INDIA);
            break;
            case MICRO :
                car = new MicroCar(Location.INDIA);
            break;
            case LUXURY :
                car = new LUXURYCar(Location.INDIA);
            break;
            default :
            break;
        }
        return car;
    }
}
