package strategy_pattern.MeansOfTransportation;

import strategy_pattern.MeansOfTransportation.movementAlgorithms.FlyingMovement;

/**
 * Created by sergei on 3/13/15.
 */
public class Plane extends Vehicle {

    public Plane()
    {
        setMovementAlgorithm(new FlyingMovement());
    }
}
