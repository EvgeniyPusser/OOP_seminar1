@FunctionalInterface
public interface GoAble {

    public final static int i = 7;

    double goOnLegs();

    default double acceleration() {

        return 9.8;

    }
}
