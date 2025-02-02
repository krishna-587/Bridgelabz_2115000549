public class Vehicle {

    static double registrationFee = 210.0;

    private String ownerName;
    private String vehicleType;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("The name of owner is: " + ownerName);
        System.out.println("The type of vehicle is: " + vehicleType);
    }

    public static void updateRegistrationFee(double newRegistrationFee) {
        registrationFee = newRegistrationFee;
    }
}
