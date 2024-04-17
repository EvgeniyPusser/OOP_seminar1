import java.time.LocalDate;
import java.util.List;

public class Snake extends Animal{
    private int length;
    boolean venomous;

    public Snake(String name, LocalDate birthDate, List<String> vaccinates, String illness, String owner) {
        super(name, birthDate, vaccinates, illness, owner);
    }
    public void slither(){
        System.out.print("I am slithering to touch you.....ssssss...");
    }
    public void fly(){
        System.out.print("If I could...");
    }
}
