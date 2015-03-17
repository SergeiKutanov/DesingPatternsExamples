package observer_pattern;

/**
 * Created by sergei on 17.03.15.
 */
public interface SubjectInterface {

    public void registerObserver(ObserverInterface observer);
    public void unregisterObserver(ObserverInterface observer);
    public void notifyObservers();

}
