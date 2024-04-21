import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VetClinic {
    private List<Animal> patients = new ArrayList<>();

    public void addPatient(Animal animal){
        patients.add(animal);
    }
public void addPatients(Animal ...animals){
        //List<Animal> animalList = new ArrayList<>();
    Collections.addAll(patients, animals);
        //patients.addAll(animalList);
}
public List<GoAble> getGoAbles() {
    List<GoAble> result = new ArrayList<>(patients.size());
    for (Animal animal : patients) {
        if (animal instanceof GoAble) result.add((GoAble) animal);

    }
    return result;
}
    public List<SlitherAble> getSlitherAbles() {
        List<SlitherAble> result = new ArrayList<>(patients.size());
        for (Animal animal : patients) {
            if (animal instanceof SlitherAble) result.add((SlitherAble) animal);

        }
        return result;
    }

    public List<Animal> getPatients() {
        return patients;
    }
}
