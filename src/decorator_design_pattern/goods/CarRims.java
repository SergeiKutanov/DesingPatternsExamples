package decorator_design_pattern.goods;

/**
 * Created by sergei on 15.03.15.
 */
public class CarRims extends CarDecorator {

    Car car;

    public CarRims(Car car)
    {
        this.car = car;
    }

    public String description()
    {
        return car.description() + " with rims installed";
    }

}
