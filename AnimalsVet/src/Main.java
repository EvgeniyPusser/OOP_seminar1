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
                new ArrayList<>(),"Chumka", "Petrov", 4);
        System.out.println(cat);
        System.out.print(cat.getLegsCount());

        Animal dog = new Dog("Zver", "Dog",LocalDate.of(1990, 6, 12),
                new ArrayList<>(),"Chumka", "Petrov");

        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        //cat.wakeUp(10);
        System.out.println("++++++++++++++++++++++++++++++++");
//        cat.wakeUp();
//        cat.eat();
//        cat.play();
//        cat.sleep();
        cat.lifeCircle();
        cat.slither();
        dog.slither();
        cat.fly();

        Snake cobra = new Snake("Nagaina", "Snake", LocalDate.of(2024, 6, 23),
                new ArrayList<>(), "no", "Gugenheim");
        cobra.slither();
        cobra.fly();

        Animal ano = new Animal("Y", "Animal",
                LocalDate.of(2000, 3, 12),
                Collections.singletonList("Hssuiui"), "yyy", "Uy") {
            @Override
            public void lifeCircle() {

            }
        };

        }
    }
