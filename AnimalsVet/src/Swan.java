import java.time.LocalDate;
import java.util.List;

public class Swan extends Animal implements FlyAble, SwimAble{
    public String grace;

    public Swan(String name, LocalDate birthDate, List<String> vaccinates,
                String illness, String owner)
    {
        super(name, birthDate, vaccinates, illness, owner);

    }

    @Override
    public double flyOnWings() {
        System.out.printf("%s is flying and water-flying bird", type);
        return 0;
    }

    @Override
    public void swim() {
        System.out.printf("%s is swimming and water-swimming bird", type);
    }
}
