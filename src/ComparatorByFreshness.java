import java.util.Comparator;


public class ComparatorByFreshness implements Comparator<Vegetable> {

    @Override
    public int compare(Vegetable o1, Vegetable o2) {
        return Integer.compare(o1.getDaysFromHarvesting(), o2.getDaysFromHarvesting());
    }
}
