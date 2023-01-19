package designpattern.abstract_factory_dp;

public class CarFactory {
    private CarFactory(){}

    public static Car buildCarFactory(CarType carType){
        Car car = null;
        // We can add any GPS Function here which
        // read location property somewhere from configuration
        // and use location specific car factory
        // Currently I'm just using INDIA as Location

//        first sorting through location then sorting through car-type
        Location location = Location.INDIA;
        switch (location){
            case USA :
                car = USACarFactoty.buildCar(carType);
                break;
            case INDIA:
                car = IndianCarFactory.buildCar(carType);
                break;
            case DEFAULT:
                car = DefaultCarFactory.buildCar(carType);
                break;
            default:
                break;
        }
        return car;
    }
}
