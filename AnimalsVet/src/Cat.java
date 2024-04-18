import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal {
    private int legsCount;

    public Cat(String name, String type, LocalDate birthDate, List<String> vaccinates, String illness, String owner, int legsCount) {
        super(name, type, birthDate, vaccinates, illness, owner);
        this.legsCount = legsCount;
    }

    public int getLegsCount() {
        return legsCount;
    }

    @Override
    public void lifeCircle() {

    }

    public void slither(){
        System.out.println("No!!! I never slither like this!!");
    }
    public void fly(){
        System.out.print("If I could fly...");
    }

}
