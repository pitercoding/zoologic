package service;

import model.Chordata;
import java.util.List;

public interface AnimalRepository {
    List<Chordata> findAll();
    void save(Chordata animal);
    void delete(Chordata animal);
    void update(int index, Chordata animalAtualizado);
}
