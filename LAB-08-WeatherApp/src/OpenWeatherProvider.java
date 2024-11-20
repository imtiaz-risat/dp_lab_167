import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.net.http.HttpClient;
import java.io.IOException;

public class OpenWeatherProvider implements IWeatherProvider {

    String ApiKey = "8b2131d2c1d531dd655dde21ebfc3984";
    String CityName= "Dhaka";
    String Url = "https://api.openweathermap.org/data/2.5/weather?q=" + CityName + "&appid=" + ApiKey;

    @Override
    public WeatherData getWeatherData() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getWeatherData'");
        HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(Url))
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = null;
		try {
			response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

        // weather data banaite hbe response body theke
        WeatherData weatherData = new WeatherData("32", "Sunny", "Dhaka", "OpenWeather");

        return weatherData;
    }
    
}
