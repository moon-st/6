
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

        }

    }




