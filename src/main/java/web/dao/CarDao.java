package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    public List<Car> index();
    public List<Car> show(int count);
}
