import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class client {
    
	public static void main(String[] args) {
		String ApiKey = "8b2131d2c1d531dd655dde21ebfc3984";
    	String CityName= "Dhaka";
    	String Url = "https://api.openweathermap.org/data/2.5/weather?q=" + CityName + "&appid=" + ApiKey;

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
		System.out.println(response.body());
}
}
