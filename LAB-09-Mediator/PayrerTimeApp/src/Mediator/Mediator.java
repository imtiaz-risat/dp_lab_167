package Mediator;

import Widgets.CurrentTime;
import Widgets.CurrentWakt;
import Widgets.IWidget;
import Widgets.Location;
import Widgets.NextPrayer;
import Widgets.PrayerTimeSettings;
import Widgets.PrayerTimeTable;
import Widgets.Timezone;
import Widgets.WaktTimeTable;

public class Mediator implements IMediator {
    private CurrentTime currentTime;
    private CurrentWakt currentWakt;
    private Location location;
    private NextPrayer nextPrayer;
    private PrayerTimeSettings prayerTimeSettings;
    private PrayerTimeTable prayerTimeTable;
    private Timezone timeZone;
    private WaktTimeTable waktTimeTable;

    public void addDependencies(CurrentTime currentTime, CurrentWakt currentWakt, Location location, NextPrayer nextPrayer, PrayerTimeSettings prayerTimeSettings, PrayerTimeTable prayerTimeTable, Timezone timezone, WaktTimeTable waktTimeTable){
        this.currentTime = currentTime;
        this.currentWakt = currentWakt;
        this.location = location;
        this.nextPrayer = nextPrayer;
        this.prayerTimeSettings = prayerTimeSettings;
        this.prayerTimeTable = prayerTimeTable;
        this.timeZone = timezone;
        this.waktTimeTable = waktTimeTable;

    }
    @Override
    public void notifyy(IWidget widget) {
        if(widget instanceof CurrentTime){
            currentWakt.Update();
            nextPrayer.Update();
        }
        else if(widget instanceof CurrentWakt){
            // nothing
        }
        else if(widget instanceof Location){
            waktTimeTable.Update();
        }
        else if(widget instanceof NextPrayer){
            // nothing
        }
        else if(widget instanceof PrayerTimeSettings){
            prayerTimeTable.Update();
        }
        else if(widget instanceof PrayerTimeTable){
            nextPrayer.Update();
        }
        else if(widget instanceof Timezone){
            waktTimeTable.Update();
            currentTime.Update();
        }
        else if(widget instanceof WaktTimeTable){
            currentWakt.Update();
        }


    }
    
}
