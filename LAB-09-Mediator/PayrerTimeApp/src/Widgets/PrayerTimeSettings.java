package Widgets;

import Mediator.Mediator;

public class PrayerTimeSettings implements IWidget {
    Mediator mediator;

    public PrayerTimeSettings(Mediator md){
        this.mediator = md;
    }

    @Override
    public void Update() {
        System.out.println("PrayerTimeSettings is updated");
        mediator.notifyy(this);
    }
    
}
