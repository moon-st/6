import java.util.ArrayList;
import java.util.List;

public class GeneralCollection<T> {
    private GenericService<T> service;
    private List<T> list;

    public GeneralCollection (int size, GenericService<T> service){
        list = new ArrayList<>(size);
        this.service = service;
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
        list.set(index, service.createNew());

    }

    public void delete(int index) {
        list.remove(index);
    }

    public void printAll() {
        System.out.println(list.toString());
    }


}
