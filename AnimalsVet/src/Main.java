import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Murzik", "Dog", LocalDate.of(1990, 6, 12),
                new ArrayList<>(), "Chumka", "Petrov", 4);

        System.out.print(cat.getLegsCount());

        Animal dog = new Dog("Zver", "Dog", LocalDate.of(1990, 6, 12),
                new ArrayList<>(), "Chumka", "Petrov");

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(cat);
        animals.add(dog);


        Snake cobra = new Snake("Nagaina",
                LocalDate.of(2024, 6, 23),
                new ArrayList<>(), "no", "Gugenheim");


        Eagle eagle = new Eagle("Yu", LocalDate.of(1999, 12, 6),
                new ArrayList<>(), "yu", "Ui");
        System.out.print(cobra.type + eagle.type);
        System.out.print("\n");

        VetClinic clinic = new VetClinic();
        clinic.addPatients(dog, cobra, cat, eagle,
                new Snake("Python", LocalDate.of(2012, 7, 23),
                        new ArrayList<>(),"iiiii", "Pusser"));

        System.out.print(clinic.getPatients());
        System.out.print("\n");
        System.out.print(clinic.getGoAbles());
        System.out.print("\n");
        System.out.print(clinic.getSlitherAbles());

    }
}

