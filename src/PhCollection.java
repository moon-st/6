import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhCollection {
    ArrayList<Phototechnique> photoCollection = new ArrayList<>(100);
    public void addCamToCollection(){
        Camera cam = new Camera();
        cam.SetPhotoObject();
        photoCollection.add(cam);
    }
        public void addLensToCollection(){
        Lens lens = new Lens();
        lens.SetPhotoObject();
        photoCollection.add(lens);
    }
    public void setItem(int id){
        if (photoCollection.get(id)instanceof Camera){
            Camera cam = new Camera();
            cam.SetPhotoObject();
        photoCollection.set(id, cam);
    }else {
        Lens lens = new Lens();
            lens.SetPhotoObject();
            photoCollection.set(id, lens);
          }
    }
    public void removeItem(int id){
        photoCollection.remove(id);
    }
    public void sortByPrice(){
        Collections.sort(photoCollection, new SortByPrice());
    }
    public void PrintCollection(){
        for (Phototechnique obj : photoCollection){
            obj.PrintPhotoObject();
        }
    }
}
