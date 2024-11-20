import java.util.Scanner;

public class WeatherApp {

public static void main(String[] args) {
    WeatherProviderFacade wpf = new WeatherProviderFacade();
    
    Scanner scanner = new Scanner(System.in);

    while (true) {
            System.out.println("Select location method: 1. By IP, 2. By City, 3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Getting weather data by IP...");
                    wpf.getWeatherByIP();
                    break;
                case 2:
                    System.out.print("Enter city name: ");
                    String city = scanner.nextLine();
                    System.out.println("Getting weather data by city...");
                    wpf.getWeatherByCity(city);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
}
}
