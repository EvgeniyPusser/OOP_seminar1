import java.time.LocalDate;
import java.util.List;

public class Dog extends Animal{
    public Dog(String name, String type, LocalDate birthDate, List<String> vaccinates, String illness, String owner) {
        super(name, type, birthDate, vaccinates, illness, owner);
    }

    @Override
    public void lifeCircle() {

    }
}
