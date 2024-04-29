import java.util.ArrayList;
import java.util.List;


public class WeatherStation implements Subject{

    private int temperatura;
    private List<Observer> observers;

    public WeatherStation(){
        observers = new ArrayList<>();
    }

    public void setTemperatura(int temperatura){
        this.temperatura=temperatura;
        notifyObservers();
    }

    public void addObserver(Observer o ) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update(temperatura);
        }
    }
}
