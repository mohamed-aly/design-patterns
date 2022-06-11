package behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation implements Observable {
    List<Observer> observers;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(Observer observer : this.observers){
            observer.update();
        }
    }

    public void getWeatherState(){
        Random random = new Random();
        System.out.println("Temperature: " + random.nextInt(60) + "," +
                " Humidity: " + random.nextInt(100) + "%");
    }
}
