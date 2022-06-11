package behavioral.observer;

public class SmartScreen implements Observer {

    private WeatherStation weatherStation;

    public SmartScreen(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }


    @Override
    public void update() {
        weatherStation.getWeatherState();
    }
}
