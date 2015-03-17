package observer_pattern;

/**
 * Created by sergei on 17.03.15.
 */
public class app {

    public static void main(String[] args) {

        Subject subject = new Subject();

        ObserverInterface userObserver = new UserObserver();
        ObserverInterface adminObserver = new AdminObserver();

        subject.registerObserver(userObserver);
        subject.registerObserver(adminObserver);

        subject.createRecord();
        subject.deleteRecord();

        subject.unregisterObserver(userObserver);

        subject.createRecord();

    }

}
