import java.util.Comparator;

public class SortByPrice implements Comparator<PhotoTechnique> {

    @Override
    public int compare(PhotoTechnique o1, PhotoTechnique o2) {
        double pr1 = o1.getPrice();
        double pr2 = o2.getPrice();
        return Double.compare(pr1, pr2);

    }
}