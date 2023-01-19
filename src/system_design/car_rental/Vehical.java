package system_design.car_rental;

public class Vehical {
    private int vehicalID;
    private int vehicalNumber;
    private VehicalType vehicalType;
    private String companyName;
    private String modelNumber;
    private Status status;

    public Vehical() {
    }

    public Vehical(int vehicalID, int vehicalNumber, VehicalType vehicalType, String companyName, String modelNumber, Status status) {
        this.vehicalID = vehicalID;
        this.vehicalNumber = vehicalNumber;
        this.vehicalType = vehicalType;
        this.companyName = companyName;
        this.modelNumber = modelNumber;
        this.status = status;
    }

    public int getVehicalID() {
        return vehicalID;
    }

    public void setVehicalID(int vehicalID) {
        this.vehicalID = vehicalID;
    }

    public int getVehicalNumber() {
        return vehicalNumber;
    }

    public void setVehicalNumber(int vehicalNumber) {
        this.vehicalNumber = vehicalNumber;
    }

    public VehicalType getVehicalType() {
        return vehicalType;
    }

    public void setVehicalType(VehicalType vehicalType) {
        this.vehicalType = vehicalType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Vehical{" +
                "vehicalID=" + vehicalID +
                ", vehicalNumber=" + vehicalNumber +
                ", vehicalType=" + vehicalType +
                ", companyName='" + companyName + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", status=" + status +
                '}';
    }
}
