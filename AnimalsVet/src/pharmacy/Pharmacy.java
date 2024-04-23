package pharmacy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterator<Component>, Comparable<Pharmacy> {
    private int index;
    private List<Component>  components;
    private String name;

    public Pharmacy() {
        this.index = 0;
        this.components = new ArrayList<>();

    }

    public Pharmacy(String name) {
        this.index = 0;
        this.components = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Component next() {
        return components.get(index++);
    }
    public void addComponents(Component ... components){
        if(components.length == 0) System.out.print("Вы ничего не добавили.");
        Collections.addAll(this.components, components);
    }

    public int getIndex() {
        return index;
    }

    public List<Component> getComponents() {
        return components;
    }


/*Этот метод считает сумму весов компонентов*/
    public int calcWeight(){
        int weight=0;
        for(Component comp : components){
            int temp_weight = Integer.parseInt(comp.getWeight().replaceAll("[^0-9]", ""));
            weight+=temp_weight;
        }
        return weight;}


    /*Сравнение лекарств происходит по сумме весов компонентов*/
    @Override
    public int compareTo(Pharmacy o) {
        return Integer.compare(o.calcWeight(), this.calcWeight());


    }}






