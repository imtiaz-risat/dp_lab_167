import java.util.HashMap;
import java.util.Map;

public class UCacheManager {
    public Map <String,WeatherData> cache = new HashMap<>();
        
    public void storeWeather(String location,WeatherData weather){
        cache.put(location, weather);
    }
}
