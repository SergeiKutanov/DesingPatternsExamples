package decorator_design_pattern.goods;

/**
 * Created by sergei on 15.03.15.
 */
public class CarAntiTheftSystem extends CarDecorator {

    Car car;

    public CarAntiTheftSystem(Car car)
    {
        this.car = car;
    }

    public String description()
    {
        return car.description() + " and Anti Theft System installed";
    }

}
