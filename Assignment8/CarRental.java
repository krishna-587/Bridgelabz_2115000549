public class CarRental {

    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double dailyRate = 800.0;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double totalCost(){
        return dailyRate*rentalDays;
    }
}
