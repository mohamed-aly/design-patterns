package behavioral.observer;
/*
let me know when something is changed
defines one to many relationship (Observable and observers) (publisher and subscriber)
Observer pattern is about changing from pull to push
examples: websockets, entityListeners
 */
public class ObserverApp {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        SmartPhone smartPhone = new SmartPhone(weatherStation);
        SmartScreen smartScreen = new SmartScreen(weatherStation);
        weatherStation.subscribe(smartPhone);
        weatherStation.subscribe(smartScreen);
        weatherStation.notifySubscribers();
    }
}
