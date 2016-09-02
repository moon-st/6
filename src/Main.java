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
//        menu.addEntry(new MenuEntry("Обновить эл-т по индексу") {
//            @Override
//            public void run() {
//
//            }
//        });
//        menu.addEntry(new MenuEntry("Удалить эл-т по индексу") {
//            @Override
//            public void run() {
//
//            }
//        });
//            menu.addEntry(new MenuEntry("Отсортировать по цене") {
//            @Override
//            public void run() {
//
//            }
//        });
//            menu.addEntry(new MenuEntry("Вычислить среднюю стоимость") {
//            @Override
//            public void run() {
//
//            }
//        });
//            menu.addEntry(new MenuEntry("Загрузить из файла") {
//            @Override
//            public void run() {
//
//            }
//        });
//            menu.addEntry(new MenuEntry("Выгрузить в файл") {
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




