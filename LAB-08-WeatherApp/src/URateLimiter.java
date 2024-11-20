public class URateLimiter {
    private boolean OpenWeatherIsExhausted;
    private boolean WeatherStackIsExhausted;
    

    public boolean isOpenWeatherExhausted(){
        return OpenWeatherIsExhausted;
    }

    public void setOpenWeatherIsExhausted(boolean isExhausted){
        this.OpenWeatherIsExhausted = isExhausted;
    }
    public boolean isWeatherStackExhausted(){
        return WeatherStackIsExhausted;
    }

    public void setWeatherStackIsExhausted(boolean isExhausted){
        this.WeatherStackIsExhausted = isExhausted;
    }
}
