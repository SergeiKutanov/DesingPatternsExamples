package decorator_design_pattern;

import decorator_design_pattern.goods.Car;
import decorator_design_pattern.goods.CarAntiTheftSystem;
import decorator_design_pattern.goods.CarMusic;
import decorator_design_pattern.goods.CarRims;

/**
 * Created by sergei on 15.03.15.
 */
public class app {

    public static void main(String[] args)
    {
        Car car = new Car();

        car = new CarAntiTheftSystem(car);
        car = new CarMusic(car);
        car = new CarRims(car);

        System.out.println(car.description());
    }

}
