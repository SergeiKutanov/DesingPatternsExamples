package strategy_pattern.MeansOfTransportation;

import strategy_pattern.MeansOfTransportation.movementAlgorithms.SupermanMovement;

/**
 * Created by sergei on 3/13/15.
 */
public class Superman extends Vehicle {

    public Superman()
    {
        setMovementAlgorithm(new SupermanMovement());
    }

}
