public abstract class RideType {
    public abstract double calculateFare(double distance, String timeOfDay);
    public abstract int getCapacity();
}

class Carpool extends RideType{
    @Override
    public double calculateFare(double distance, String timeOfDay){
        return 0;
    };

    @Override
    public int getCapacity(){
        return 3;
    }
}


class LuxuryRide extends RideType{
    @Override
    public double calculateFare(double distance, String timeOfDay){
        return 0;
    };

    @Override
    public int getCapacity(){
        return 6;
    }
}

class BikeRide extends RideType{
    @Override
    public double calculateFare(double distance, String timeOfDay){
        return 0;
    };

    @Override
    public int getCapacity(){
        return 1;
    }
}





