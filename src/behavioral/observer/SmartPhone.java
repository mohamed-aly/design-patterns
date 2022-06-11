package behavioral.observer;

public class SmartPhone implements Observer {

    private WeatherStation weatherStation;

    public SmartPhone(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }


    @Override
    public void update() {
        weatherStation.getWeatherState();
    }
}
