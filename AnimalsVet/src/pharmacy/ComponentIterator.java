package pharmacy;

import java.util.Iterator;

public class ComponentIterator implements Iterator<Component> {
    private int index = 0;
    private IterablePharmacy pharmacyI;

    public ComponentIterator(IterablePharmacy pharmacyI) {
        this.pharmacyI = pharmacyI;
    }

    @Override
    public boolean hasNext() {
        return index < pharmacyI.getComponents().size();
    }

    @Override
    public Component next() {
        return pharmacyI.getComponents().get(index++);
    }
}
