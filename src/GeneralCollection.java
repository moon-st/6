import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GeneralCollection<T> {
    private GenericService<T> service;
    private List<T> list;

    public GeneralCollection (int size, GenericService<T> service){
        list = new ArrayList<>(size);
        this.service = service;
    }

    public List<T> getList() {
        return list;
    }

    public void add() {
        T t = service.createNew();
        list.add(t);
    }


    public void update(int index) {
        T t = list.get(index);
        if (t == null) {
            throw new
                    IllegalArgumentException("there is no such cameras!");
        }
        service.update(t);

    }

    public void delete(int index) {
        list.remove(index);
    }
    public static  <T> void sortByPrice(List<T> list, Comparator<? super T> c){
       Collections.sort(list,  c);
    }
    public void printAll() {
        System.out.println(list.toString());
    }


}
