public class WeatherProviderFacade implements IWeatherProvider{
    OpenWeatherProvider openWeatherProvider = new OpenWeatherProvider();
    WeatherStackProvider weatherStackProvider = new WeatherStackProvider();
    URateLimiter rateLimiter = new URateLimiter();

    public WeatherData getWeatherByIP(){
        String ip = "37.111.212.234"; // api use kre ip ber krte hbe

        return getWeatherData();
        
    }

    public WeatherData getWeatherByCity(String city){
        
        return getWeatherData();
        
    }


    @Override
    public WeatherData getWeatherData() {
        
        // ratelimiter 30sec cool down handle krbe
        if(!rateLimiter.isOpenWeatherExhausted())
        {
            WeatherData weatherData = openWeatherProvider.getWeatherData();
            rateLimiter.setOpenWeatherIsExhausted(true);
            return weatherData;
        }else if(){
            WeatherData weatherData = weatherStackProvider.getWeatherData();
            rateLimiter.setWeatherStackIsExhausted(true);
            return weatherData;
        }
    }
    
}
