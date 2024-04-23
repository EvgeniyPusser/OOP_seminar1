package pharmacy;

import java.util.Objects;

public class Component implements Comparable<Component>{
    private String name;
    private  String weight;
    private  int power;
    //private String getWeight;


    public String getName() {
        return name;
    }

    public String getWeight() {
        return weight;
    }

    public int getPower() {
        return power;
    }

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
        
        
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", power=" + power +
                '}';
    }

    @Override
    public int compareTo(Component o) {
        return Integer.compare(this.power,o.power);
//        if(this.power > o.power) return -1;
//        if(this.power < o.power) return 1;
//        else{
//            return 0;

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, power);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Component component = (Component) object;
        return power == component.power && Objects.equals(name, component.name) && Objects.equals(weight, component.weight);
    }
    public boolean containComponent(String stuff) {
        return name.equals(stuff);
    }
}

