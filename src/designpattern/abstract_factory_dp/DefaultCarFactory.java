package designpattern.abstract_factory_dp;
//DefaultCarFactory

public class DefaultCarFactory {
    static Car buildCar(CarType carType){
        Car car = null;
        switch (carType){
            case MINI :
                car =  new MiniCar(Location.DEFAULT);
                break;
            case MICRO :
                car = new MicroCar(Location.DEFAULT);
                break;
            case LUXURY :
                car = new LUXURYCar(Location.DEFAULT);
                break;
            default :
                break;
        }
        return car;
    }
}
