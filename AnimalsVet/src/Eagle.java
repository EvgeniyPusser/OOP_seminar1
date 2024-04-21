import java.time.LocalDate;
import java.util.List;

public class Eagle extends Animal implements FlyAble{
    public Eagle(String name, LocalDate birthDate, List<String> vaccinates, String illness, String owner) {
        super(name, birthDate, vaccinates, illness, owner);
    }

//    @Override
//    public void lifeCircle() {
//
//    }

//    @Override
//    public long swim() {
//        System.out.printf("%s flying", type);
//        return 29;
//    }

    @Override
    public double flyOnWings() {
        System.out.printf("%s flying", type);
        return 0;
    }
}
