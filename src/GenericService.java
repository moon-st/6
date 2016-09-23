/**
 * Created by Admin on 22.09.2016.
 */
public interface GenericService<E> {
    E createNew();
    void update(E e);
}
