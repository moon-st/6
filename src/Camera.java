import java.util.Scanner;

/**
 * Created by Admin on 24.07.2016.
 */
public class Camera extends Phototechnique implements iCamera{
    private KindOfCam type;
    private int zoom;
    public Camera(){
        super();
        zoom = 0;
        type = KindOfCam.UNKNOWN;
    }
    public Camera(String m, double pr, int z){
        super(m, pr);
        zoom = z;
        type = KindOfCam.UNKNOWN;
    }

    public Camera(String m, double pr, int zoom, KindOfCam type) {
        super(m, pr);
        this.zoom = zoom;
        this.type = type;
    }

    public void setType(KindOfCam type) {
        this.type = type;
    }

    public KindOfCam getType() {
        return type;
    }

    public void SetZoom(int z){
        zoom = z;
    }
    public int GetZoom() {return zoom;    }

    @Override
    public void SetPhotoObject() {
        super.SetPhotoObject();
        System.out.println("Введите величину цифрового зума");
        Scanner in = new Scanner(System.in);
        zoom = in.nextInt();
        System.out.println("Установите тип камеры: 0 - цифровая, 1 - оптическая, 2 - пленочная");
       // type.ordinal() = in.nextInt();
    }

    @Override
    public void PrintPhotoObject() {
        super.PrintPhotoObject();
        System.out.println("Цифровой зум: "+zoom);
        System.out.println("Тип камеры: "+type);
    }
}
