import java.time.LocalDate;
import java.util.List;

public class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected List<String> vaccinates;
    protected String illness;
    protected String owner;

    public Animal(String name, LocalDate birthDate, List<String> vaccinates, String illness, String owner) {
        this.name = name;
        this.birthDate = birthDate;
        this.vaccinates = vaccinates;
        this.illness = illness;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<String> getVaccinates() {
        return vaccinates;
    }

    public String getIllness() {
        return illness;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", vaccinates=" + vaccinates +
                ", illness='" + illness + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }

    private void wakeUp() {
        System.out.println("Animal is woken up!");
    }

    private void wakeUp(int time) {
        System.out.println("Animal is woken up at  " + time);
    }

    private void eat() {
        System.out.println("The animal eats well...");
    }
    private void play(){
        System.out.println("animal plays");
    }
    private void sleep(){
        System.out.println("Animal is sleeping.");
    }
    public void lifeCircle(){
        wakeUp();
        eat();
        play();
        sleep();
    }
}
