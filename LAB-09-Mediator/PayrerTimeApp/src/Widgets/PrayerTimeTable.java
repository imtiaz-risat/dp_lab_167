package Widgets;

import Mediator.Mediator;

public class PrayerTimeTable implements IWidget{
    Mediator mediator;

    public PrayerTimeTable(Mediator md){
        this.mediator = md;
    }

    @Override
    public void Update() {
        System.out.println("PrayerTimeTable is updated");
        mediator.notifyy(this);
    }
    
}
