import java.util.ArrayList;
public class Menu {
    ArrayList<Phototechnique> photoCollection = new ArrayList<>(100);
    public void addToCollection(){
        Camera cam1 = new Camera();
        cam1.SetPhotoObject();
        photoCollection.add(cam1);
    }
    public void PrintCollection(){
        for (Phototechnique count : photoCollection){
            count.PrintPhotoObject();
        }
    }

    public static void printMenu(){
        System.out.println("Меню:");
        System.out.println("1. Добавить элемент в коллекцию.");
        System.out.println("2. Обновить данные элемента по индексу");
        System.out.println("3. Удалить элемент по индексу");
        System.out.println("4. Вывести все объекты на экран");
     //   System.out.println("5. Отсортировать по цене");
     //   System.out.println("6. Посчитать среднюю стоимость");

    }
}
