import java.util.ArrayList;

/**
 * Created by Admin on 02.09.2016.
 */
public class PhCollection {
    ArrayList<Phototechnique> photoCollection = new ArrayList<>(100);
    public void addToCollection(){
        Camera cam = new Camera();
        cam.SetPhotoObject();
        photoCollection.add(cam);
}
    public void PrintCollection(){
        for (Phototechnique count : photoCollection){
            count.PrintPhotoObject();
        }
}
}


