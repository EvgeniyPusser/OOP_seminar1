import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Example {
    static Map<Character, BinaryOperator<Double>> map = new HashMap<>();

    public static void fillMap(){
        map.put('*', (x,y)-> x*y);
        map.put('-', (x,y)-> x-y);
        map.put('+', Double::sum);
        map.put('/', (x,y)-> x/y);

    }
    public static void main(String[] args) {
        fillMap();
        System.out.print( switchCase('*', 34, 2));
        System.out.print("                        ");
        System.out.print(switchToMap('*', 56, 9));


    }

    public static int switchCase(char operator, int a, int b) {
        return switch (operator) {
            case '*' -> a * b;
            case '+' -> a + b;
            case '-' -> a - b;
            case '/' -> a / b;
            default -> {
                throw new RuntimeException("Операция не поддреживается.");
            }


        };

    }
    public static double switchToMap(char operator, double a, double b) {
          return map.get(operator).apply(a,b);
    }
}
