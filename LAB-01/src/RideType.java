public interface RideType {
    public abstract double calculateFare(double distance, String timeOfDay);
    public abstract int getCapacity();
}

class Carpool implements RideType{
    @Override
    public double calculateFare(double distance, String timeOfDay){
        return 0;
    };

    @Override
    public int getCapacity(){
        return 3;
    }
}


class LuxuryRide implements RideType{
    @Override
    public double calculateFare(double distance, String timeOfDay){
        return 0;
    };

    @Override
    public int getCapacity(){
        return 6;
    }
}

class BikeRide implements RideType{
    @Override
    public double calculateFare(double distance, String timeOfDay){
        return 0;
    };

    @Override
    public int getCapacity(){
        return 1;
    }
}





