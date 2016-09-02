
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        final  PhCollection phCollection = new PhCollection();
        Menu menu = new Menu();
        menu.addEntry(new MenuEntry("Добавить элемент") {
            @Override
            public void run() {
            phCollection.addToCollection();
            }
        });
//        menu.addEntry(new MenuEntry("2 - Обновить эл-т по индексу") {
//            @Override
//            public void run() {
//
//            }
//        });
//        menu.addEntry(new MenuEntry("3 - Удалить эл-т по индексу") {
//            @Override
//            public void run() {
//
//            }
//        });
        menu.addEntry(new MenuEntry("Вывести все эл-ты на экран") {
            @Override
            public void run() {
                phCollection.PrintCollection();
            }
        });
        menu.run();
//        menu.printMenu();
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        int option =0;
//        while (option==0){
//            try {
//                option = Integer.decode(in.readLine());
//                if (option>5) {
//                    System.out.println("Введите корректный номер пункта меню");
//                    option = 0;
//                }
//            } catch (Exception e) {
//                System.out.println("Введите корректный номер пункта меню");
//
//            }
//        }
//
//        switch (option) {
//            //case 0:
//            case 1:
//                menu.addToCollection();
//
//            case 2:
//                //menu.rewrite
//            case 3:
//                // menu.dell
//
//            case 4:
//                menu.PrintCollection();
//        }

//        photoCollection.add(new Camera("olimpus", 25.0, 3, 2));
//                for (Phototechnique count : photoCollection){
//            count.PrintPhotoObject();
        }

    }




