package observer_pattern;

import java.util.Vector;

/**
 * Created by sergei on 17.03.15.
 */
public class Subject implements SubjectInterface {

    private Vector<ObserverInterface> observers;
    private String event;

    public Subject() {
        observers = new Vector<ObserverInterface>();
    }

    @Override
    public void registerObserver(ObserverInterface observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(ObserverInterface observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            ObserverInterface observer = (ObserverInterface) observers.get(i);
            observer.update(event);
        }
    }

    public void createRecord() {
        this.event = "create";
        notifyObservers();
    }

    public void deleteRecord() {
        this.event = "delete";
        notifyObservers();
    }

}
