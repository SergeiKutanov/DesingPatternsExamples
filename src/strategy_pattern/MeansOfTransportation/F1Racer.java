package strategy_pattern.MeansOfTransportation;

import strategy_pattern.MeansOfTransportation.movementAlgorithms.DrivingMovement;

/**
 * Created by sergei on 3/13/15.
 */
public class F1Racer extends Vehicle {

    public F1Racer()
    {
        setMovementAlgorithm(new DrivingMovement());
    }

}
