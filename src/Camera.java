import org.omg.CORBA.UNKNOWN;

import java.util.Scanner;

/**
 * Created by Admin on 24.07.2016.
 */
public class Camera extends Phototechnique {
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

    public Camera(String m, double pr, int zoom, int type) {
        super(m, pr);
        this.zoom = zoom;
        this.type = KindOfCam.values()[type];
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
        while (zoom<=0){
            if (zoom<0) System.out.println("Повторите воод зума");
            try {
                zoom = Integer.parseInt(in.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Введите зум корректно");
        }}
        System.out.println("Установите тип камеры: 1 - цифровая, 2 - оптическая, 3 - пленочная");
        while (type==KindOfCam.UNKNOWN){
            try{
                int id = Integer.parseInt(in.nextLine());
                if (id<0&&id>4){
                    System.out.println("Повторите ввод типа камеры");
                    id =0;
                }
                type = KindOfCam.values()[id];
            }catch (IndexOutOfBoundsException|NumberFormatException e){
                System.out.println("Установите тип камеры корректно (1 - цифровая, 2 - оптическая, 3 - пленочная)");
            }
        }

    }

    @Override
    public void PrintPhotoObject() {
        super.PrintPhotoObject();
        System.out.println("Цифровой зум: "+zoom);
        System.out.println("Тип камеры: "+type);
        System.out.println("");
    }
}
