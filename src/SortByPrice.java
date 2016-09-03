import java.util.Comparator;

/**
 * Created by Admin on 03.09.2016.
 */
public class SortByPrice implements Comparator<Phototechnique> {

    @Override
    public int compare(Phototechnique o1, Phototechnique o2) {
        double pr1 = o1.GetPrice();
        double pr2 = o2.GetPrice();
        return Double.compare(pr1, pr2);

    }
}
