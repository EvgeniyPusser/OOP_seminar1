import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Murzik", LocalDate.of(1990, 6, 12),
                new ArrayList<>(),"Chumka", "Petrov", 4);
        System.out.println(cat);
        System.out.print(cat.getLegsCount());

        Animal dog = new Dog("Zver", LocalDate.of(1990, 6, 12),
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

        }
    }
