import java.time.LocalDate;
import java.util.List;

public class Dolphin extends Animal implements SwimAble{
    public int IQ;

    public Dolphin(String name, LocalDate birthDate, List<String> vaccinates, String illness, String owner) {
        super(name, birthDate, vaccinates, illness, owner);
    }

    @Override
    public void swim() {
        System.out.printf("%s swimming and coding sometimes...", type);

    }
}
