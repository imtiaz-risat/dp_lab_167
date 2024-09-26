public class Rider extends User {
    private PaymentMethod preferredPaymentMethod;
    private NotificationService preferredNotificationService;

    public void setPreferredPaymentMethod(PaymentMethod paymentMethod)
    {
        this.preferredPaymentMethod = paymentMethod;
    }
    public PaymentMethod getPreferredPaymentMethod(){
        return this.preferredPaymentMethod;
    }
    public void setPreferredNotificationService(NotificationService notificationService)
    {
        this.preferredNotificationService = notificationService;
    }
    public NotificationService getPreferredNotificationService() {
        return this.preferredNotificationService;
    }

    public void requestRide(RideType rideType, String pickUpLocation, String dropOffLocation){
        //
    }

    public void rateDriver(Driver driver, double rating){
        //
    }

    public void makePayment(Trip trip){
        if(preferredPaymentMethod != null){
            Double fare = trip.getFare();
            preferredPaymentMethod.processPayment(fare);
        }else{
            // no prefered payment method
        }
    }
}
