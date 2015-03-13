package strategy_pattern;

import strategy_pattern.MeansOfTransportation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by sergei on 3/13/15.
 */
public class app {

    public static void main(String[] args)
    {

        List<Vehicle> meansOfTransportation = new ArrayList<Vehicle>();

        meansOfTransportation.add(new Racer());
        meansOfTransportation.add(new F1Racer());
        meansOfTransportation.add(new Plane());
        meansOfTransportation.add(new Superman());

        Iterator iterator = meansOfTransportation.iterator();
        while (iterator.hasNext()) {
            Vehicle vehicle = (Vehicle) iterator.next();
            vehicle.go();
        }
    }

}
