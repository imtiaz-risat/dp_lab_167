public class EPostalNotifierAdapter implements INotify {
    AddressService ad;
    EPostalNotifier epn;

    public EPostalNotifierAdapter(AddressService ad, EPostalNotifier epn){
        this.ad = ad;
        this.epn = epn;
    }

    // Adapter Method
    @Override
    public void sendNotification(String id, String msg) {
        String address = ad.getAddress();
        epn.sendNotification(address, id, msg);
    }
    
}
