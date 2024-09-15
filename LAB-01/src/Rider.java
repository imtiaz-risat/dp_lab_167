public class Rider {
    private int id;
    private String name;
    private String location;
    private Double rating;
    private PaymentMethod preferredPaymentMethod;

    public void requestRide(RideType rideType, String pickUpLocation, String dropOffLocation){
        // Booking a trip
    }

    public void rateDriver(Driver driver, double rating){
        //
    }

    public void makePayment(Trip trip, PaymentMethod paymentMethod){
        //
    }
}
