import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal implements GoAble{
    private int legsCount;

    public Cat(String name, String type, LocalDate birthDate, List<String> vaccinates, String illness, String owner, int legsCount) {
        super(name, birthDate, vaccinates, illness, owner);
        this.legsCount = legsCount;
    }

    public int getLegsCount() {
        return legsCount;
    }

    @Override
    public double goOnLegs() {
        System.out.printf("%s going", type);
        return 0;
    }


}
