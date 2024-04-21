import java.time.LocalDate;
import java.util.List;

public abstract class Animal {
    protected String name;
    protected String type;
    protected LocalDate birthDate;
    protected List<String> vaccinates;
    protected String illness;
    protected String owner;

    public Animal(String name, LocalDate birthDate, List<String> vaccinates, String illness, String owner) {
        this.name = name;
        this.type = getClass().getSimpleName();
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
                " type=" + type +
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
    //public abstract void lifeCircle();//{
//        wakeUp();
//        eat();
//        play();
//        sleep();
   // }
//    public void slither(){
//        System.out.println("I slither so weird... to bite youuu!!!!");
//    }
//    public void fly(){
//        System.out.print("I hover above you all.");
//    }
}
