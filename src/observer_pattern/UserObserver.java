package observer_pattern;

/**
 * Created by sergei on 17.03.15.
 */
public class UserObserver implements ObserverInterface {

    @Override
    public void update(String event) {
        if (event.equals("delete")) {
            System.out.println("UserObserver received event: " + event);
        }
    }

}
