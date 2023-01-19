package designpattern.abstract_factory_dp;
//USACarFactoty

public class USACarFactoty {
    static Car buildCar(CarType carType){
        Car car = null;
        switch (carType){
            case MINI :
                car =  new MiniCar(Location.USA);
                break;
            case MICRO :
                car = new MicroCar(Location.USA);
                break;
            case LUXURY :
                car = new LUXURYCar(Location.USA);
                break;
            default :
                break;
        }
        return car;
    }
}
