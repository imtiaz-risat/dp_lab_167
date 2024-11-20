public class OpenWeatherProxy {
    UCacheManager cacheManager;
    OpenWeatherProvider openWeatherProvider;

    public OpenWeatherProxy(UCacheManager cacheManager, OpenWeatherProvider openWeatherProvider){
        this.cacheManager = cacheManager;
        this.openWeatherProvider = openWeatherProvider;
    }

    public WeatherData getWeatherData(){
        // cache e ase ki na check krbe
        
        return openWeatherProvider.getWeatherData();
    }
}
