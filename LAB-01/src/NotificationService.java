public interface NotificationService {
    void sendNotification(String message);
}

class SMS implements NotificationService{
    @Override
    public void sendNotification(String message){
        //
    }
}

class Email implements NotificationService{
    @Override
    public void sendNotification(String message){
        //
    }
}

class InApp implements NotificationService{
    @Override
    public void sendNotification(String message){
        //
    }
}