package strategy_pattern.MeansOfTransportation.movementAlgorithms;

/**
 * Created by sergei on 3/13/15.
 */
public class FlyingMovement implements MovementAlgorithm {
    @Override
    public void go() {
        System.out.println("I'm flying");
    }
}
