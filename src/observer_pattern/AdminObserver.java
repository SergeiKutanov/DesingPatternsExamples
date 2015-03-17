package observer_pattern;

/**
 * Created by sergei on 17.03.15.
 */
public class AdminObserver implements ObserverInterface {

    @Override
    public void update(String event) {
        if (event.equals("create")) {
            System.out.println("Admin observer received event: " + event);
        }
    }

}
