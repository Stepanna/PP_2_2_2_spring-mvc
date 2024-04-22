package web.dao;

import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Reno", 23, 42000));
        cars.add(new Car("Ford Focus", 21, 42000));
        cars.add(new Car("Audi", 2, 45000));
        cars.add(new Car("Volkswagen", 41, 50000));
        cars.add(new Car("BMW", 512, 70000));
    }

    @Override
    public List<Car> index() {
        return cars;
    }

    @Override
    public List<Car> show(int count) {
        List<Car> finalList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            finalList.add(cars.get(i));
        }
        return finalList;
    }
}
