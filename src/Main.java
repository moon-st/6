import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Phototechnique> photoCollection = new ArrayList<>();
        System.out.println("Меню:");
        System.out.println("1. Добавить элемент в коллекцию." );
        System.out.println("2. Обновить данные элемента по индексу");
        System.out.println("3. Удалить элемент по индексу");
        System.out.println("4. Вывести все объекты на экран" );
        Scanner in = new Scanner(System.in);
        int menu = in.nextInt();






       // Phototechnique o1 = new Phototechnique();
      //  o1.SetPhotoObject();
       // o1.PrintPhotoObject();
        //Camera dgc1 = new Camera();
       //Camera dgc2 = new Camera();
       // dgc2.SetManufacturer("Nicon");
        Camera dgc2 = new Camera("olimpus", 25.0, 3);
        dgc2.PrintPhotoObject();
        System.out.println(dgc2.getType().ordinal());
       // dgc1.SetPhotoObject();
      //  dgc1.PrintPhotoObject();
        Lens l1 = new Lens();
        l1.SetManufacturer("Fujifilm");
        l1.SetPrice(60.0);
        l1.setMinimumFocalLength(10);
        l1.PrintPhotoObject();


    }
}
