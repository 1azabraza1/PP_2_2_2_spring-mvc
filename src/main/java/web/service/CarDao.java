package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {
    private final List<Car> cars = new ArrayList<Car>();
    {
        cars.add(new Car("model1", "year1", "color1"));
        cars.add(new Car("model2", "year2", "color2"));
        cars.add(new Car("model3", "year3", "color3"));
        cars.add(new Car("model4", "year4", "color4"));
        cars.add(new Car("model5", "year5", "color5"));

    }
    public List<Car> getCars(Integer count) {
        count = (count == null || count > 5) ? 5 : count <= 0 ? 0 : count;
        return cars.stream().limit(count).toList();
    }

}
