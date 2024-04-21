import java.time.LocalDate;
import java.util.List;

public class Dog extends Animal implements GoAble{
    public Dog(String name, String type, LocalDate birthDate, List<String> vaccinates, String illness, String owner) {
        super(name, birthDate, vaccinates, illness, owner);
    }

    @Override
    public double goOnLegs() {
        System.out.printf("%s going", type);
        return 0;
    }

}
