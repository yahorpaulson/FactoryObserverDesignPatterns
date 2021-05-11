package at.omi.blatt6.a4.sensor.example.observer;

public interface IObservable {

    void add(IObserver o);
    void remove(IObserver o);
    void notifyObserver();
}
