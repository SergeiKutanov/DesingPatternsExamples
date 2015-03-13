package strategy_pattern.MeansOfTransportation;

import strategy_pattern.MeansOfTransportation.movementAlgorithms.MovementAlgorithm;

public abstract class Vehicle {

    private MovementAlgorithm movementAlgorithm;

    public void setMovementAlgorithm (MovementAlgorithm movementAlgorithm)
    {
        this.movementAlgorithm = movementAlgorithm;
    }

    public void go()
    {
        movementAlgorithm.go();
    }

}
