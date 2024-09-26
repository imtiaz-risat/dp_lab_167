public class Trip {
    private int id;
    private Driver driver;
    private Rider rider;
    private String pickupLocation;
    private String dropOffLocation;
    private RideType rideType;
    private String Status;
    private Double fare;
    private Double distance;
    private NotificationService notificationService;

    // Ekta constructor thakbe parameter (driver, rider, rideType)
    public Trip(Driver driver, Rider rider, RideType rideType){
        this.driver = driver;
        this.rider = rider;
        this.rideType = rideType;
    }

    public void calculateFare(){
        this.fare = rideType.calculateFare(this.distance, "time-of-day");    
    }

    public void assignDriver(){
        // 
    }

    public void completeTrip(){
        // ekhan theke driver rider er preffered notificationService use hbe
        // for rider
        notificationService = rider.getPreferredNotificationService();
        notificationService.sendNotification("Thank you for riding!");
        // for driver
        notificationService = driver.getPreferredNotificationService();
        notificationService.sendNotification("Great work! Trip is completed.");

        // the Trip object calls processPayment() on the selected payment method.
        processPayment();
    }

    public Double getFare(){
        return this.fare;
    }

    private void processPayment(){
        this.rider.getPreferredPaymentMethod().processPayment(getFare());
    }

}
