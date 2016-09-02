import java.util.ArrayList;
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
    public void PrintCollection(){
        for (Phototechnique obj : photoCollection){
            obj.PrintPhotoObject();
        }
    }
}
