package system_design.car_rental.product;

import system_design.car_rental.Vehical;
import system_design.car_rental.VehicalType;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private  int storeID;
    VehicalInventoryManagement inventoryManagement;
    Location location;
    List<Reservation> reservations = new ArrayList<>();

    public List<Vehical> getVehical(VehicalType vehicalType){
        return inventoryManagement.getVehical();
    }
}
