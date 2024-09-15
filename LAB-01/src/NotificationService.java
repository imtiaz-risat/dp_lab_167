public interface NotificationService {
    void sendNotification();
}

class SMS implements NotificationService{
    @Override
    public void sendNotification(){
        //
    }
}

class Email implements NotificationService{
    @Override
    public void sendNotification(){
        //
    }
}

class InApp implements NotificationService{
    @Override
    public void sendNotification(){
        //
    }
}