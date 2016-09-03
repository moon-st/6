import java.util.Comparator;

/**
 * Created by Admin on 03.09.2016.
 */
public class SortByPrice implements Comparator<Phototechnique> {

    @Override
    public int compare(Phototechnique o1, Phototechnique o2) {
        double pr1 = o1.GetPrice();
        double pr2 = o2.GetPrice();

        if(pr1 > pr2) {
            return 1;
        }
        else if(pr1 < pr2) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
