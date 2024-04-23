package pharmacy;

import java.util.*;

public class IterablePharmacy implements Iterable<Component>{
    private int index;
    public String name;
    private List<Component> components;


    public IterablePharmacy() {
        this.index = 0;
        this.components = new ArrayList<>();


    }

    public IterablePharmacy(String name) {
        this.index = 0;
        this.components = new ArrayList<>();
        this.name = name;


    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }
    //    @Override
//    public boolean hasNext() {
//        return index < components.size();
//    }

    //    @Override
//    public Component next() {
//        return components.get(index++);
//    }
    public void addComponents(Component... components) {
        if (components.length == 0) System.out.print("Вы ничего не добавили.");
        Collections.addAll(this.components, components);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        IterablePharmacy pharmacy = (IterablePharmacy) object;
        return index == pharmacy.index && Objects.equals(components, pharmacy.components);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, components);
    }
    //    @Override
//    public Iterator<Component> iterator() {
//        return new ComponentIterator(this);
//    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    };}

//    @Override
//    public boolean equals(Object object) {
//        if (object == this) {return true;}
//        if ((object == null || object.getClass() != this.getClass())) {
//            return false;
//        } Component guest = (Component) object;
//        return  != null && Component.(guest.getClass());
//    }
//
//        }


//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }






