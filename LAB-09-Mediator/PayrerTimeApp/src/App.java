import java.util.Scanner;

import Mediator.Mediator;
import Widgets.CurrentTime;
import Widgets.CurrentWakt;
// import java.io.*;
import Widgets.Location;
import Widgets.NextPrayer;
import Widgets.PrayerTimeSettings;
import Widgets.PrayerTimeTable;
import Widgets.Timezone;
import Widgets.WaktTimeTable;

public class App {
    public static void main(String[] args) throws Exception {
        Mediator md = new Mediator();
        CurrentTime currentTime = new CurrentTime(md);
        CurrentWakt currentWakt = new CurrentWakt(md);
        Location location = new Location(md);
        NextPrayer nextPrayer = new NextPrayer(md);
        PrayerTimeTable prayerTimeTable = new PrayerTimeTable(md);
        PrayerTimeSettings prayerTimeSettings = new PrayerTimeSettings(md);
        Timezone timeZone = new Timezone(md);
        WaktTimeTable waktTimeTable = new WaktTimeTable(md);
        md.addDependencies(currentTime, currentWakt, location, nextPrayer, prayerTimeSettings, prayerTimeTable, timeZone, waktTimeTable);

        Scanner scanner = new Scanner(System.in);

        while (true) {
                System.out.println("Update:\n1. Location\n2. Timezone\n3. Prayer Time Settings\n4. Exit");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        location.Update();
                        System.out.println("---------------");
                        break;
                    case 2:
                        timeZone.Update();
                        System.out.println("---------------");
                        break;
                    case 3:
                        prayerTimeSettings.Update();
                        System.out.println("---------------");
                        break;
                    
                    case 4:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
    }
}
