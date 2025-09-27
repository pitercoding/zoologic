package service;

import model.Chordata;
import java.util.ArrayList;
import java.util.List;

public class InMemoryAnimalRepository implements AnimalRepository {

    private final List<Chordata> animais = new ArrayList<>();

    @Override
    public List<Chordata> findAll() {
        return new ArrayList<>(animais);
    }

    @Override
    public void save(Chordata animal) {
        animais.add(animal);
    }

    @Override
    public void delete(Chordata animal) {
        animais.remove(animal);
    }

    @Override
    public void update(int index, Chordata animalAtualizado) {
        if (index >= 0 && index < animais.size()) {
            animais.set(index, animalAtualizado);
        }
    }
}

