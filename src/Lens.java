import java.util.Scanner;

/**
 * Created by Admin on 25.07.2016.
 */
public class Lens extends Phototechnique {
    private int minimumFocalLength;

    public Lens() {
        super();
        this.minimumFocalLength =0;
    }

    public Lens(String m, double pr, int minimumFocalLength) {
        super(m, pr);
        this.minimumFocalLength = minimumFocalLength;
    }

    public int getMinimumFocalLength() {
        return minimumFocalLength;
    }

    public void setMinimumFocalLength(int minimumFocalLength) {
        this.minimumFocalLength = minimumFocalLength;
    }

    @Override
    public void SetPhotoObject() {
        super.SetPhotoObject();
        System.out.println("Введите минимальное фокусное расстояние");
        Scanner in = new Scanner(System.in);
        while (minimumFocalLength<=0){
            if (minimumFocalLength<0) System.out.println("Повторите воод зума");
            try {
                minimumFocalLength = Integer.parseInt(in.nextLine());

            }catch (NumberFormatException e){
                System.out.println("Введите зум корректно");
            }}
        ;
    }

    @Override
    public void PrintPhotoObject() {
        super.PrintPhotoObject();
        System.out.println("Мин. фокусное расстояние: "+minimumFocalLength);
        System.out.println("");
    }
}
