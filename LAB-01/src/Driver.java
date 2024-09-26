public class Driver extends User{
    private String vehicleType;
    private boolean availability;
    private NotificationService notificationService;

    public void setPreferredNotificationService(NotificationService notificationService)
    {
        this.notificationService = notificationService;
    }
    public NotificationService getPreferredNotificationService() {
        return this.notificationService;
    }

    public void acceptRide(Trip trip){
        //
    }

    public void rateRider(Rider rider, double rating){
        //
    }

    public void updateLocation(String newLocation){
        //
    }

    public void startTrip(Trip trip){
        //
    }

}
