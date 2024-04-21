import java.time.LocalDate;
import java.util.List;

public class Snake extends Animal implements SlitherAble {
    private int length;
    public boolean venomous;

    public Snake(String name, LocalDate birthDate, List<String> vaccinates, String illness, String owner) {
        super(name, birthDate, vaccinates, illness, owner);
    }

    public void slither() {
        System.out.print("I am slithering to touch you.....ssssss...");
    }

    @Override
    public int slitherAsDevil() {
        System.out.printf("%s slithering", type);
        return 0;
    }
}
