package decorator_design_pattern.goods;

/**
 * Created by sergei on 15.03.15.
 */
public class CarMusic extends CarDecorator {

    Car car;

    public CarMusic(Car car)
    {
        this.car = car;
    }

    public String description()
    {
        return car.description() + " with music installed";
    }

}
